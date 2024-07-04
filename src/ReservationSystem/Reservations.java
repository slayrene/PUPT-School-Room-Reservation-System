
package ReservationSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 * This class provides methods for managing reservations in a reservation system.
 * It interacts with a database (`db`) to perform CRUD (Create, Read, Update, Delete) operations on reservations.
 */
public class Reservations {
    // Reference to a database class instance
    Db my_db = new Db();   
     // Reference to a Rooms class instance
    Rooms room = new Rooms();
    /**
     * Fills the provided JTable with data from the `rooms` table in the database.
     * 
     * @param table The JTable to be filled with room data
     */    
    public void fillRoomTable(JTable table) {
        String selectQuery = "SELECT * FROM `rooms`";

        try (Connection con = my_db.mycon(); 
             PreparedStatement pst = con.prepareStatement(selectQuery); 
             ResultSet rs = pst.executeQuery()) {

            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[3] = rs.getString(5);
                row[3] = rs.getString(6);                
                tableModel.addRow(row);
            }

        } catch (SQLException e) {
        }
    }
    /**
     * Fills the provided JTable with data from the `reservations` table in the database, 
     * filtered by a specific student number.
     * 
     * @param table The JTable to be filled with reservation data
     */ 
    public void fillReservationTable(JTable table) {
            PreparedStatement pst; 
            ResultSet rs;
            String selectQuery = "SELECT * FROM `reservations`";
        
            try {
                pst = my_db.mycon().prepareStatement(selectQuery);
                pst = my_db.mycon().prepareCall(selectQuery);
                rs = pst.executeQuery();

                DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
                tableModel.setRowCount(0); // Clear existing rows
                Object[] row;

                while (rs.next()){

                    row = new Object[5];
                    row[0] = rs.getInt(1);
                    row[1] = rs.getString(2);
                    row[2] = rs.getInt(3);
                    row[3] = rs.getDate(4);
                    row[4] = rs.getDate(5);
                    tableModel.addRow(row);
                }

            } catch (SQLException e) {
            }
    }    
    /**
     * Adds a new reservation to the database.
     * 
     * @param studno The student number for the reservation
     * @param roomID The ID of the room being reserved
     * @param dateIn The start date of the reservation
     * @param dateOut The end date of the reservation
     * @return True if the reservation was added successfully, false otherwise
     */    
    public boolean addReservations(String studno, int roomID, Date dateIn, Date dateOut) {
        String addQuery = "INSERT INTO `reservations`(`studno`, `roomID`, `dateIn`, `dateOut`) VALUES (?, ?, ?, ?)";

        try (Connection con = my_db.mycon();
             PreparedStatement pst = con.prepareStatement(addQuery)) {

            pst.setString(1, studno);
            pst.setInt(2, roomID);
            pst.setDate(3, dateIn);
            pst.setDate(4, dateOut);

            int rowsAffected = pst.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            System.out.println("Error adding reservation: " + ex.getMessage());
            return false;
        }
    }

    /**
     * Edits an existing reservation in the database.
     * @param reservationID The ID of the reservation to edit
     * @param studno The student number for the reservation
     * @param roomID The ID of the room being reserved
     * @param dateIn The start date of the reservation
     * @param dateOut The end date of the reservation
     * @return True if the reservation was added successfully, false otherwise
     */
    
    public boolean editReservations(int reservationID, String studno, int roomID, Date dateIn, Date dateOut) {
        String editQuery = "UPDATE `reservations` SET `studno`=?, `roomID`=?, `dateIn`=?, `dateOut`=? WHERE `id` = ?";

        try (Connection con = my_db.mycon(); 
             PreparedStatement pst = con.prepareStatement(editQuery)) {

            pst.setString(1, studno);
            pst.setInt(2, roomID);
            pst.setDate(3, dateIn);
            pst.setDate(4, dateOut);
            pst.setInt(5, reservationID); // Use reservationID instead of roomNumber

            int rowsAffected = pst.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException ex) {
            System.out.println("Error editing reservation: " + ex.getMessage());
            return false;
        }
    }
   
/**
 * Removes a reservation from the database and updates the room's reserved status.
 * 
 * @param reservationId The ID of the reservation to remove
 * @param roomNumber The room number associated with the reservation (might be redundant based on reservationId)
 * @return True if the reservation was removed successfully, false otherwise
 */    
    public boolean removeReservation(int reservationId, int roomNumber) {
        String query = "DELETE FROM reservations WHERE id = ?";
        try (PreparedStatement ps = my_db.mycon().prepareStatement(query)) {
            ps.setInt(1, reservationId);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                // Update room reserved status
                updateRoomReservedStatus(roomNumber);
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }
/**
 * Checks if there are existing reservations for a room within a specified date range.
 * 
 * @param roomNumber The room number to check for reservations
 * @param date_In The start date of the date range
 * @param date_Out The end date of the date range
 * @return True if there are overlapping reservations, false otherwise
 */
    
    public boolean isReservationExistForDates(int roomNumber, java.sql.Date date_In, java.sql.Date date_Out) {
        String query = "SELECT COUNT(*) FROM reservations WHERE roomID = ? AND (? <= dateOut AND ? >= dateIn)";
        try (PreparedStatement ps = my_db.mycon().prepareStatement(query)) {
            ps.setInt(1, roomNumber);
            ps.setDate(2, date_In);  // Start date of new reservation
            ps.setDate(3, date_Out); // End date of new reservation
            System.out.println("Executing query: " + ps.toString());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    System.out.println("Overlapping reservations count: " + count);
                    return count > 0;
                }
            }
        } catch (SQLException e) {
        }
        return false;
    }
    /**
    * Updates the reserved status of a room based on the number of reservations it has.
    * 
    * @param roomNumber The room number to update the reserved status for
    */   
    public void updateRoomReservedStatus(int roomNumber) {
        String query = "SELECT COUNT(*) FROM reservations WHERE roomID = ?";
        try (PreparedStatement ps = my_db.mycon().prepareStatement(query)) {
            ps.setInt(1, roomNumber);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    System.out.println("Number of reservations for room " + roomNumber + ": " + count);

                    String updateQuery = "UPDATE rooms SET reserved = ? WHERE roomID = ?";
                    try (PreparedStatement updatePs = my_db.mycon().prepareStatement(updateQuery)) {
                        updatePs.setString(1, count > 0 ? "Yes" : "No");
                        updatePs.setInt(2, roomNumber);
                        int rowsUpdated = updatePs.executeUpdate();
                        if (rowsUpdated > 0) {
                            System.out.println("Room " + roomNumber + " reserved status updated successfully.");
                        } else {
                            System.out.println("Failed to update reserved status for room " + roomNumber);
                        }
                    }
                }
            }
        } catch (SQLException e) {
        }
    }
    /**
     * Fills a JComboBox with reservation IDs for a specific student number.
     * @param reservationComboBox
     * @param studno
     */
    public void fillReservationBox(JComboBox reservationComboBox, String studno) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        String selectQuery = "SELECT id FROM reservations WHERE studno = ?";

        try {
            pst = my_db.mycon().prepareStatement(selectQuery);
            pst.setString(1, studno); // Set the student number parameter

            rs = pst.executeQuery();

            while (rs.next()) {
                int reservationID = rs.getInt("id");
                reservationComboBox.addItem(reservationID);
            }

        } catch (SQLException e) {
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
            } catch (SQLException ex) {
            }
        }
    }
    /**
     * Fills the provided JTable with data from the `reservations` table in the database, 
     * filtered by a specific student number. This table is intended for displaying reservations 
     * a student wants to cancel.
     */
public boolean fillCancelTable(JTable table, String studNum) {
    PreparedStatement pst;
    ResultSet rs;
    String selectQuery = "SELECT * FROM `reservations` WHERE studno = ?";

    try {
        pst = my_db.mycon().prepareStatement(selectQuery);
        pst.setString(1, studNum);  // Set the student number in the prepared statement
        rs = pst.executeQuery();

        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        // Clear existing rows in the table (if any)
        tableModel.setRowCount(0);

        if (!rs.isBeforeFirst()) { // Check if the ResultSet is empty
            return false; // No reservations found
        }

        Object[] row;

        while (rs.next()) {
            row = new Object[5];
            row[0] = rs.getInt(1);       // Assuming rs.getInt(1) is the reservation ID
            row[1] = rs.getString(2);    // Assuming rs.getString(2) is the reservation description or name
            row[2] = rs.getInt(3);       // Assuming rs.getInt(3) is some numeric data related to reservation
            row[3] = rs.getDate(4);      // Assuming rs.getDate(4) is the start date of the reservation
            row[4] = rs.getDate(5);      // Assuming rs.getDate(5) is the end date of the reservation
            tableModel.addRow(row);
        }
        
        return true; // Reservations found and added

    } catch (SQLException e) {
        e.printStackTrace();
        return false; // In case of error, return false
    }
}

  
    public void fillViewTable(JTable table) {
            PreparedStatement pst; 
            ResultSet rs;
            String selectQuery = "SELECT roomID, dateIn, dateOut FROM `reservations`";
        
            try {
                pst = my_db.mycon().prepareStatement(selectQuery);
                pst = my_db.mycon().prepareCall(selectQuery);
                rs = pst.executeQuery();

                DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
                tableModel.setRowCount(0); // Clear existing rows
                Object[] row;

                while (rs.next()){

                    row = new Object[3];
                    row[0] = rs.getInt(1);
                    row[1] = rs.getDate(2);
                    row[2] = rs.getDate(3);
                    tableModel.addRow(row);
                }

            } catch (SQLException e) {
            } 
    }  
   
}
