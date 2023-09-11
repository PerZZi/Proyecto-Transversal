/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotransversal.AccesoDatos;

import java.sql.Connection;
import proyectotransversal.entidades.Alumno;

/**
 *
 * @author Usuario
 */
public class AlumnoData {
    
    private Connection con=null;
    
    public AlumnoData(){
        
        con=Conexion.getConnection();
    }
    
    
    public void guardarAlumno(Alumno alumno){
        
    }
}
