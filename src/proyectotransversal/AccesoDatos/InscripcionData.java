package proyectotransversal.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import proyectotransversal.entidades.Alumno;
import proyectotransversal.entidades.Inscripcion;
import proyectotransversal.entidades.Materia;

public class InscripcionData {

    private Connection con = null;
    private AlumnoData ad = new AlumnoData();
    private MateriaData md = new MateriaData();

    public InscripcionData() {
        con = Conexion.getConnection();
    }

    public void guardarInscripcion(Inscripcion inscripcion) {

        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                inscripcion.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "inscripcion exitosa");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }

    public List<Inscripcion> ObtenerInscripciones() {
        String sql = "SELECT idInscripto, nota, idAlumno, idMateria FROM inscripcion";

        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setNota(rs.getInt("nota"));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mate = md.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alu);
                inscripcion.setMateria(mate);
                inscripcion.setNota(rs.getDouble("nota"));
                cursadas.add(inscripcion);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex.getMessage());
        }

        return cursadas;
    }

    public List<Inscripcion> ObtenerInscripcionesPorAlumno(int idAlumno) {
        String sql = "SELECT idInscripto, nota, idAlumno, idMateria FROM inscripcion WHERE idAlumno=?";

        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setNota(rs.getInt("nota"));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mate = md.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alu);
                inscripcion.setMateria(mate);
                inscripcion.setNota(rs.getDouble("nota"));
                cursadas.add(inscripcion);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex.getMessage());
        }

        return cursadas;
    }

    public List<Materia> obtenerMateriaCursada(int idAlumno) {

        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT inscripcion.idMateria,nombre, año FROM inscripcion,"
                + "materia WHERE inscripcion.idMateria = materia.idMateria"
                + "AND inscripcion.idAlumno = ?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);
            }

            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion ");

        }

        return materias;
    }

    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {

        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                + "(SELECT idMtereria FROMinscripcion WHERE idAlumno=?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);
            }

            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion ");

        }

        return materias;
    }

}
