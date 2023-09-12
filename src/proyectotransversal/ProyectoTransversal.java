/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotransversal;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import proyectotransversal.AccesoDatos.AlumnoData;
import proyectotransversal.AccesoDatos.Conexion;
import proyectotransversal.entidades.Alumno;


/**
 *
 * @author Usuario
 */
public class ProyectoTransversal {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection con=Conexion.getConnection();
        
        Alumno alumno1=new Alumno(45789365,"Fernandez"," Esteban Matias",LocalDate.of(2001, 7, 15),true);
        AlumnoData alu1=new AlumnoData();
//        alu1.guardarAlumno(alumno1);
        alu1.modificarAlumno(alumno1);







    }
    
}
