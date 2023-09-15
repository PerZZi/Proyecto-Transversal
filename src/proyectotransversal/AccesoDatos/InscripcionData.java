
package proyectotransversal.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import proyectotransversal.entidades.Inscripcion;

public class InscripcionData {
    
    private Connection con=null;

    public InscripcionData() {
        con = Conexion.getConnection();
    }
    
    
    public void guardarInscripcion(Inscripcion inscripcion){
        
        String sql="INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscripcion.getNota());
            ps.setInt(2,inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                JOptionPane.showMessageDialog(null, "inscripcion exitosa");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }
}
