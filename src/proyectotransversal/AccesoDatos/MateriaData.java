

package proyectotransversal.AccesoDatos;

import java.sql.Connection;

public class MateriaData {
    
    private Connection con=null;

    public MateriaData() {
        this.con=Conexion.getConnection();
    }
    
    public void guardarMateria(){
        
    }
    
    
}
