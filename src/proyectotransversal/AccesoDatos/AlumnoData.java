package proyectotransversal.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectotransversal.entidades.Alumno;

public class AlumnoData {
    
    private Connection con = null;
    
    public AlumnoData() {
        
        con = Conexion.getConnection();
    }
    
    public void guardarAlumno(Alumno alumno) {
        
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, activo) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNaci()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                JOptionPane.showMessageDialog(null, "Alumno añadido con exito");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }
    }
    
    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni= ?, apellido= ?, nombre= ?, fechaNacimiento= ?, activo=? WHERE idAlumno= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNaci()));
            ps.setBoolean(5, alumno.isActivo());
            ps.setInt(6, alumno.getIdAlumno());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showConfirmDialog(null, "Alumno modificado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
    
    public void eliminarAlumno(int id) {
        
        try {
            String sql = "UPDATE alumno SET activo= 0 where idAlumno = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            int elimino = ps.executeUpdate();
            
            if (elimino == 1) {
                
                JOptionPane.showMessageDialog(null, "Alumno Eliminado");
                
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
            
        }
    }
    
    public Alumno buscarAlumno(int id) {
        
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND activo= 1";
        
        Alumno alumno = null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {                
                alumno = new Alumno();                
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("DNI"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getNString("nombre"));
                alumno.setFechaNaci(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, " No existe ese alumno ");                
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accder a la tabla " + ex.getMessage());
            
        }
        
        return alumno;
    }
    
    public Alumno buscarAlumnoPorDni(int dni) {
        
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND activo= 1";
        
        Alumno alumno = null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {                
                alumno = new Alumno();                
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("DNI"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getNString("nombre"));
                alumno.setFechaNaci(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, " No existe ese alumno ");                
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accder a la tabla " + ex.getMessage());
            
        }
        
        return alumno;
    }
    
        public List<Alumno> ListarAlumnos() {
        
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE activo= 1";
        
        ArrayList<Alumno> alumnos =new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {                
                Alumno alumno = new Alumno();                
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("DNI"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getNString("nombre"));
                alumno.setFechaNaci(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
                
                alumnos.add(alumno);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accder a la tabla " + ex.getMessage());
            
        }
        
        return alumnos;
    }
}
