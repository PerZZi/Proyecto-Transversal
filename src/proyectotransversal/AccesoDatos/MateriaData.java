package proyectotransversal.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectotransversal.entidades.Materia;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        
        con = Conexion.getConnection();
    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if(rs.next()) {
                materia.setIdMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Se agrego una materia ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar guardar la materia " + ex.getMessage());
        }
    }
    
    public Materia buscarMateria(int id) {
        
        String sql = "SELECT nombre, año, FROM materia WHERE idMateria = ? AND estado= 1";
        
        Materia materia = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, " No existe esta materia ");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accder a la tabla " + ex.getMessage());

        }

        return materia;
    }

}
