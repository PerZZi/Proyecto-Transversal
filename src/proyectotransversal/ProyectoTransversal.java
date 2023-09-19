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
import proyectotransversal.AccesoDatos.InscripcionData;
import proyectotransversal.AccesoDatos.MateriaData;
import proyectotransversal.entidades.Alumno;
import proyectotransversal.entidades.Inscripcion;
import proyectotransversal.entidades.Materia;

public class ProyectoTransversal {

    public static void main(String[] args) {

        Connection con = Conexion.getConnection();

        //Alumno alumno1=new Alumno(18, 4296545,"Fernandez","Mateo",LocalDate.of(2000, 8, 20),true);
        //Alumno alumno2=new Alumno(15, 4569874,"Dorregaray","esteban",LocalDate.of(2003, 6, 10),true);
        //AlumnoData alu1=new AlumnoData();
        //AlumnoData alu2=new AlumnoData();
        //alu1.guardarAlumno(alumno1);
        //alu2.guardarAlumno(alumno2);
        //alu1.modificarAlumno(alumno1);
        //alu2.modificarAlumno(alumno2);
        //Alumno alumnoEncontrado= alu1.buscarAlumnoPorDni(4296545);
        //System.out.println("DNI " + alumnoEncontrado.getDni());
        //System.out.println("Apellido " + alumnoEncontrado.getApellido());
        //AlumnoData alu=new AlumnoData();
        //for (Alumno alumno:alu.ListarAlumnos()) {
        //System.out.println(alumno.getDni());
        //System.out.println(alumno.getApellido());
        //System.out.println(alumno.getNombre());
        //System.out.println(alumno.getFechaNaci());
        
        //Materia materia1 = new Materia("Matematica",2022,true);
        //Materia materia2=new Materia(3,"Ciencia",2022,true);
        //MateriaData mate1=new MateriaData();
        //MateriaData mate2=new MateriaData();
        //mate1.guardarMateria(materia1);
        //mate2.guardarMateria(materia2);
        //mate1.buscarMateria(5);
        //mate1.eliminarMateria(5);
        //mate1.modificarMateria(materia2);
        
//        for (Materia materia:mate1.ListarMaterias()) {
//            System.out.println(materia.getNombre());
//            System.out.println(materia.getAño());
      //}
      
      AlumnoData alu1=new AlumnoData();
      MateriaData mate1=new MateriaData();
      InscripcionData id=new InscripcionData();
//      Alumno ricardo=alu1.buscarAlumno(20);
//      Materia ciencia=mate1.buscarMateria(3);
//      Inscripcion ins=new Inscripcion(ricardo,ciencia,9);
      AlumnoData alu2=new AlumnoData();
      MateriaData mate2=new MateriaData();
      InscripcionData ids=new InscripcionData();
//      Alumno lucio=alu2.buscarAlumno(15);
//      Materia lengua=mate2.buscarMateria(3);
//      Inscripcion insc=new Inscripcion(lucio,lengua,8);
//      ids.guardarInscripcion(ins);
      
//        for (Inscripcion inscrip:id.ObtenerInscripciones()) {
//            System.out.println("id " + inscrip.getIdInscripcion());
//            System.out.println("Apellido " + inscrip.getAlumno().getApellido());
//            System.out.println("Materia " + inscrip.getMateria().getNombre());
//        }
id.actualizarNota(20, 3, 10);
    }
}
