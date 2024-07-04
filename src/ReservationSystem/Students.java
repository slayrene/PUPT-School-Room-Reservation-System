package ReservationSystem;


import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Students class handles student data interaction with the database in the reservation system.
 * It provides methods for adding, editing, removing, and fetching student information.
 */
public class Students {
    Connection con = null; 
    PreparedStatement pst = null;
    Reservations reservation = new Reservations ();
    Db my_db = new Db();

    /**
     * Adds a new student record to the database table `tblstudent`.
     */
    public boolean addStudents(String studno, String fname, String mname, String lname, String yrsec, String email, String password) {
        String addQuery = "INSERT INTO `tblstudent`(`studno`, `firstname`, `middlename`, `lastname`, `yrsec`, `email`, `password`) VALUES (?,?,?,?,?,?,?)";
        Connection con = null;
        PreparedStatement pst = null;
        
        try {
            con = my_db.mycon();
            pst = con.prepareStatement(addQuery);
            
            pst.setString(1, studno);
            pst.setString(2, fname);
            pst.setString(3, mname);
            pst.setString(4, lname);
            pst.setString(5, yrsec);
            pst.setString(6, email);
            pst.setString(7, password);
            
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Edits an existing student record in the database table `tblstudent`.
     */
    public boolean editStudent(String studno, String fname, String mname, String lname, String yrsec, String email, String password) {
        String editQuery = "UPDATE `tblstudent` SET `firstname`=?,`middlename`=?,`lastname`=?,`yrsec`=?,`email`=?,`password`=? WHERE `studno` = ?";
        Connection con = null;
        PreparedStatement pst = null;
        
        try {
            con = my_db.mycon();
            pst = con.prepareStatement(editQuery);
            
            pst.setString(1, fname);
            pst.setString(2, mname);
            pst.setString(3, lname);
            pst.setString(4, yrsec);
            pst.setString(5, email);
            pst.setString(6, password);
            pst.setString(7, studno);
            
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Removes a student record from the database table `tblstudent`.
     */
public boolean removeStudent(String studno) {
        String revQuery = "DELETE FROM tblstudent WHERE studno =?";
        Connection con = null;
        PreparedStatement pst = null;
        
        try {
            con = my_db.mycon();
            pst = con.prepareStatement(revQuery);
            
            pst.setString(1, studno);
            
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * Fills a JTable with student data from the database table `tblstudent`.
     */
    public void fillStudentTable(JTable table) {
        String selectQuery = "SELECT * FROM `tblstudent`";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            con = my_db.mycon();
            pst = con.prepareStatement(selectQuery);
            rs = pst.executeQuery();

            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
            Object[] row;

            while (rs.next()) {
                row = new Object[7];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);

                tableModel.addRow(row);
            }
        } catch (SQLException e) {
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
            }
        }
    }
}
