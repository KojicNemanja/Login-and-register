
package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
    private static PreparedStatement ps = null;
    
    public static Connection getConnection(){
        Connection con = null;
        
        try {
            
            Class c = Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/loginandregister", "nemanja", "nemanja97");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
     }
    
    public static boolean insertUpdateDelete(String query){
        
        try {
            ps = getConnection().prepareStatement(query);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static ResultSet RS(String query){
        try {
            ps = getConnection().prepareStatement(query);
            return ps.executeQuery();
        } catch (SQLException ex) {
            //System.out.println(ex);
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
