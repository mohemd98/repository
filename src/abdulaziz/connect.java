
package abdulaziz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connect {

     
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pd = null;

    connect() {
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ASER\\Desktop\\Abdulaziz.accdb");
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
