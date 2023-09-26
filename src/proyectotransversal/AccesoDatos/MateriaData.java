package proyectotransversal.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agrego una materia ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar guardar la materia " + ex.getMessage());
        }
    }
    
    public Materia buscarMateria(int id) {
        
        String sql = "SELECT nombre, año FROM materia WHERE idMateria = ? AND estado= 1";
        
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
    
     public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre= ?, año= ?, estado=? WHERE idMateria= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showConfirmDialog(null, "Materia modificado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }
     
     public void eliminarMateria(int idMateria) {

        try {
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int materia = ps.executeUpdate();

            if (materia == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la Materia.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al intentar eliminar la Materia");
        }
    }
     
     public List<Materia> ListarMaterias() {
        
        String sql = "SELECT idMateria, nombre, año, estado  FROM materia WHERE estado= 1";
         
        ArrayList<Materia> materias =new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {                
                Materia materia = new Materia(); 
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(true);
                
                materias.add(materia);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accder a la tabla " + ex.getMessage());
            
        }    
        return materias;
    }

}
