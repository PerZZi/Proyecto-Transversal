/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotransversal;

import java.sql.Connection;
import java.time.LocalDate;
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
        
        //Alumno alumno1=new Alumno(4578565,"Suarez","Martin",LocalDate.of(2001, 7, 15),true);
        //AlumnoData alu1=new AlumnoData();
        //alu1.guardarAlumno(alumno1);
        
        Alumno alumno2=new Alumno(50123456,"Vera","Roxana",LocalDate.of(2010, 12, 5),true);
        AlumnoData alu2=new AlumnoData();
        alu2.guardarAlumno(alumno2);

        







    }
    
}
