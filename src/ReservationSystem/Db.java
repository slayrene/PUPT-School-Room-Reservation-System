
package ReservationSystem;
import java.sql.*;
/**
 * db class provides methods for interacting with a database for a reservation system.
 * It includes methods to check if a student exists and to establish a connection to the database.
 */
public class Db {
  /**
   * Checks if a student with the provided student number exists in the database table `tblstudent`.
   * 
   * @param studno The student number to check for existence.
   * @return True if the student exists, false otherwise.
   */
     public static boolean isStudentExist(String studno) {
        String query = "SELECT COUNT(*) FROM tblstudent WHERE studno = ?";
        try (Connection con = mycon(); // Assuming mycon() returns a valid database connection
             PreparedStatement pst = con.prepareStatement(query)) {

            // Trim the input student number to remove any leading or trailing spaces
            studno = studno.trim();

            pst.setString(1, studno);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; // Return true if student exists, false otherwise
            }
        } catch (SQLException ex) {
            System.out.println("Error checking student existence: " + ex.getMessage());
        }
        return false; // Return false by default or handle exception
    }
  /**
   * Establishes a connection to the database specified by the provided URL, username, and password.
   * 
   * @return A valid Connection object if successful, null otherwise.
   */    
    public static Connection mycon(){
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/dbreservation";
            String user = "root";
            String passw = "";
            
            con = DriverManager.getConnection(url, user, passw);
            
        }catch (ClassNotFoundException | SQLException e ) {
            System.out.println(e);
        }
        return con;
    }
    
}
