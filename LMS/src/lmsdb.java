
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class lmsdb {
    
 public static Connection connect(){  
     Connection conn = null;
     
     try{
         Class.forName("com.mysql.jdbc.Driver");
         conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");  
         
     }
     catch(Exception e){
                 
                 }
     return conn;
 } 
}
