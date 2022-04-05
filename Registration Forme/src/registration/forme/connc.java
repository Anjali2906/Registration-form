package registration.forme;

    import java.sql.*;  

public class connc{
    Connection c;
    Statement s;
    public connc(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///form","root","anjaligupta@123"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
    
}

