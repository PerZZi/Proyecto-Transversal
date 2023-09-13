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

public class ProyectoTransversal {

    public static void main(String[] args) {
        
        Connection con=Conexion.getConnection();
        

        Alumno alumno1=new Alumno(18, 4296545,"Fernandez","Mateo",LocalDate.of(2000, 8, 20),true);
        Alumno alumno2=new Alumno(15, 4569874,"Dorregaray","Lucio",LocalDate.of(2003, 6, 10),true);
        AlumnoData alu1=new AlumnoData();
        AlumnoData alu2=new AlumnoData();
        //alu1.guardarAlumno(alumno1);
        //alu2.guardarAlumno(alumno2);
        //alu1.modificarAlumno(alumno1);
        //alu2.modificarAlumno(alumno2);

    }
}
