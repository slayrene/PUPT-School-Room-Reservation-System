
package ReservationSystem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

/**
 * Room class provides methods for managing rooms in a reservation system.
 * It interacts with a database (`db`) to perform CRUD (Create, Read, Update, Delete) operations on rooms.
 */
public class Rooms {
    
    PreparedStatement pst = null;
    
    Db my_db = new Db();    
     /**
     * Fills the provided JTable with data from the `rooms` table in the database.
     *
     */      
    
        public void fillRoomTable(JTable table) {
            PreparedStatement pst; 
            ResultSet rs;
            String selectQuery = "SELECT * FROM `rooms`";
        
            try {
                pst = my_db.mycon().prepareStatement(selectQuery);
                pst = my_db.mycon().prepareCall(selectQuery);
                rs = pst.executeQuery();

                DefaultTableModel tableModel = (DefaultTableModel)table.getModel();

                Object[] row;

                while (rs.next()){

                    row = new Object[5];
                    row[0] = rs.getInt(1);
                    row[1] = rs.getString(2);
                    row[2] = rs.getString(3);
                    row[3] = rs.getString(4);
                    row[4] = rs.getString(5);
                    tableModel.addRow(row);
                }

            } catch (SQLException e) {
                e.printStackTrace(); 
            }
        }
     /**
     * Fills the provided JTable with data from the `rooms` table in the database.
     * 
     */                 
        public void fillViewTable(JTable table) {
                PreparedStatement pst;
                ResultSet rs;
                String selectQuery = "SELECT `roomID`, `label`, `location`, `floor` FROM `rooms`";

                try {
                    pst = my_db.mycon().prepareStatement(selectQuery);
                    rs = pst.executeQuery();

                    DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

                    Object[] row;

                    while (rs.next()) {
                        row = new Object[4];
                        row[0] = rs.getInt(1);
                        row[1] = rs.getString(2);
                        row[2] = rs.getString(3);
                        row[3] = rs.getString(4);
                        tableModel.addRow(row);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
     /**
     * Fills the provided Combo BoX with data from the `rooms` table in the database.
     */                 
        public void fillRoomCombo(JComboBox roomBox) {
            PreparedStatement pst; 
            ResultSet rs;
            String selectQuery = "SELECT * FROM `rooms`";           
       
            try {
                pst = my_db.mycon().prepareStatement(selectQuery);
                pst = my_db.mycon().prepareCall(selectQuery);
                rs = pst.executeQuery();
                
                while (rs.next()){               
                    roomBox.addItem(rs.getInt(1));
                }

            } catch (SQLException e) {
                e.printStackTrace(); 
            }
           
        }  
    /**
     * Adds a new room to the database.
     */            
    public boolean addRoom (String roomType1, String location, String floor) {

        String addQuery = "INSERT INTO `rooms`(`label`, `location`, `floor`, `reserved`) VALUES (?, ?, ?, ?)"; 

        try (Connection con = my_db.mycon()) { 

          if (con == null) {
            System.out.println("Failed to establish database connection!");
            return false;
          }

          PreparedStatement pst = con.prepareStatement(addQuery);

          pst.setString(1, roomType1);
          pst.setString(2, location);
          pst.setString(3, floor);
          pst.setString(4, "No");

          int rowsAffected = pst.executeUpdate();

          return rowsAffected > 0;

        } catch (SQLException ex) {
          System.out.println("Error adding room: " + ex.getMessage());
          return false;
        }
    }    
    /**
     * Edits an existing reservation in the database.
     */         
        
    public boolean editRoom(int roomNumber, String roomType1, String location, String floor, String isReserved) {
        String editQuery = "UPDATE `rooms` SET `label`=?,`location`=?,`floor` =?,`reserved`=? WHERE `roomID` = ?";
        
        try (Connection con = my_db.mycon()) { 

          if (con == null) {
            System.out.println("Failed to establish database connection!");
            return false;
          }

          PreparedStatement pst = con.prepareStatement(editQuery);

          pst.setString(1, roomType1);
          pst.setString(2, location);
          pst.setString(3, floor);          
          pst.setString(4, isReserved);
          pst.setInt(5, roomNumber);
          
          int rowsAffected = pst.executeUpdate();

          return rowsAffected > 0;

        } catch (SQLException ex) {
          System.out.println("Error editing room: " + ex.getMessage());
          return false;
          }      
    }    
    /**
     * Removes a reservation from the database and updates the room's reserved status.
     */
    public boolean removeRoom (int roomNumber){
        String revQuery = "DELETE FROM `rooms` WHERE roomID =? ";
        
        try {        
            pst = my_db.mycon().prepareStatement(revQuery);
            
            
            pst.setInt(1, roomNumber);
            
            return (pst.executeUpdate() > 0);
            
        } catch (Exception e){
            return false;
        }   
    }
    
    /**
     * Function to set a room to reserved or not .
     */    
    public boolean setRoomToReserved(int roomNumber, String isReserved) {
        String editQuery = "UPDATE `rooms` SET `reserved` = ? WHERE `roomID` = ?";

        try (Connection con = my_db.mycon();
             PreparedStatement pst = con.prepareStatement(editQuery)) {

            pst.setString(1, isReserved);
            pst.setInt(2, roomNumber);

            int rowsAffected = pst.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException ex) {
            System.out.println("Error editing room: " + ex.getMessage());
            return false;
        }
    }
    /**
     * Function to get if the room is reserved.
     */   
    public String isRoomReserved (int number) {
        String editQuery = "SELECT `reserved` FROM `rooms` WHERE `roomID` = ?";

        try (Connection con = my_db.mycon();
             PreparedStatement pst = con.prepareStatement(editQuery)) {

            pst.setInt(1, number);

            ResultSet rs = pst.executeQuery();

            if (rs.next()){
                return rs.getString(1);
            } else {
                return "";
            }

        } catch (SQLException ex) {

            return "";
        }
    }
      
    /**
     * Updates the room's status
     */
    public void updateRoomStatus(int roomNumber) {
        // Query to check if there are any remaining reservations for the room
        String checkQuery = "SELECT COUNT(*) AS count FROM `reservations` WHERE `roomID` = ?";

        try (Connection con = my_db.mycon();
             PreparedStatement pst = con.prepareStatement(checkQuery)) {

            pst.setInt(1, roomNumber);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt("count");

                // If count is 0, update room status to "No"
                if (count == 0) {
                    boolean updateResult = setRoomToReserved(roomNumber, "No");
                    if (updateResult) {
                        System.out.println("Room status updated to 'No' as there are no remaining reservations.");
                    } else {
                        System.out.println("Failed to update room status.");
                    }
                } else {
                    System.out.println("Room still has remaining reservations. Status remains 'Yes'.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error checking reservations: " + ex.getMessage());
        }
    }

}
