package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sebastianvidal
 */
public class Conexion {
    
    private final static String baseDatos = "libreria";
    private final static String usuario = "root";
    private final static String password = "";
    
    
    public Connection obtenerConexion()
    {
        Connection connection = null;
        
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
      
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+baseDatos, usuario, password);
            
            System.out.println("Conexion ok");
            
      
        }catch(SQLException e)
        {
            System.out.println("Error BD: "+ e.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ ex.getMessage());
        
        }
        
        return connection;
    
    }
    
    
}