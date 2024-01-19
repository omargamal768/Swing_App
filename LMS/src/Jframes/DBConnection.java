
package Jframes;
import java.sql.DriverManager;
import java.sql.Connection;

public class DBConnection {
    static Connection con=null;
    public static Connection getConnection(){
        try{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms","root","");
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        return con;
    
    }
}
