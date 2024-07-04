
package ReservationSystem;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 * CancelReservation class represents the functionality for cancelling a reservation.
 * It extends the JFrame class and includes various UI components for user interaction
 * and performing cancellation operations.
 *
 * 
 */
public class CancelReservation extends javax.swing.JFrame {
    Reservations reservation = new Reservations();
    Rooms room = new Rooms();
    private User user;
    private JFrame previousFrame;      

    /**
     * Creates a new CancelReservation form.
     */    
    public CancelReservation() {
        initComponents();
        room.fillRoomCombo(roomComboBox);   
        reservationNumber.setEditable(false);
        // Make JDateChooser non-editable
        dateChooser.getDateEditor().setEnabled(false);
        dateChooser.getCalendarButton().setEnabled(false);
    }

    /**
     * Creates a new CancelReservation form with an initialized user and reference to the previous JFrame.
     *
     * @param user The user object representing the current user
     * @param previousFrame A reference to the JFrame that was previously displayed
     */    
    CancelReservation(User user, JFrame previousFrame) {
        initComponents();
        this.user = user;
        this.previousFrame = previousFrame;        
        username.setText(user.getUsername());
        room.fillRoomCombo(roomComboBox);
        reservationNumber.setEditable(false);
        roomComboBox.setEditable(false);
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel5 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        prof = new javax.swing.JLabel();
        viewRoomsButton = new javax.swing.JButton();
        addReservationbutton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        reservationIDLabel = new javax.swing.JLabel();
        cancelReservationButton = new javax.swing.JButton();
        roomTypeLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        roomComboBox = new javax.swing.JComboBox<>();
        reservationDateOut = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        dateChooser2 = new com.toedter.calendar.JDateChooser();
        reservationDateIn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cancelTable = new javax.swing.JTable();
        searchButton1 = new javax.swing.JButton();
        reservationNumber = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(92, 6, 1));
        jPanel5.setPreferredSize(new java.awt.Dimension(150, 620));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButton.setBackground(new java.awt.Color(125, 10, 10));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(254, 221, 11));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setBorder(null);
        logoutButton.setBorderPainted(false);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.setFocusPainted(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel5.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 459, 150, 51));

        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(254, 221, 11));
        username.setText("0");
        jPanel5.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 120, -1));

        prof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/prof.png"))); // NOI18N
        jPanel5.add(prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        viewRoomsButton.setBackground(new java.awt.Color(125, 10, 10));
        viewRoomsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewRoomsButton.setForeground(new java.awt.Color(254, 221, 11));
        viewRoomsButton.setText("View All Reservations");
        viewRoomsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        viewRoomsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewRoomsButton.setPreferredSize(new java.awt.Dimension(93, 35));
        viewRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRoomsButtonActionPerformed(evt);
            }
        });
        jPanel5.add(viewRoomsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 126, 150, 45));

        addReservationbutton.setBackground(new java.awt.Color(125, 10, 10));
        addReservationbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addReservationbutton.setForeground(new java.awt.Color(254, 221, 11));
        addReservationbutton.setText("Add Reservation");
        addReservationbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        addReservationbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addReservationbutton.setPreferredSize(new java.awt.Dimension(93, 35));
        addReservationbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addReservationbuttonActionPerformed(evt);
            }
        });
        jPanel5.add(addReservationbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 177, 150, 45));

        homeButton.setBackground(new java.awt.Color(255, 174, 69));
        homeButton.setForeground(new java.awt.Color(0, 0, 51));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Home.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel5.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, -1));

        cancelButton.setBackground(new java.awt.Color(125, 10, 10));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(254, 221, 11));
        cancelButton.setText("Cancel Reservation");
        cancelButton.setBorder(null);
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.setPreferredSize(new java.awt.Dimension(93, 35));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel5.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 150, 40));

        jPanel1.setBackground(new java.awt.Color(125, 10, 10));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 174, 69));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reservationIDLabel.setText("Reservation ID:");
        jPanel2.add(reservationIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        cancelReservationButton.setBackground(new java.awt.Color(255, 143, 44));
        cancelReservationButton.setText("Cancel Reservation");
        cancelReservationButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
        cancelReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservationButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cancelReservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 380, 30));

        roomTypeLabel.setText("Room Type:");
        jPanel2.add(roomTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 74, -1));

        clearButton.setBackground(new java.awt.Color(255, 143, 44));
        clearButton.setText("Clear Fields");
        clearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 380, 30));

        jPanel2.add(roomComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 230, 30));

        reservationDateOut.setText("Reservation Date Out:");
        jPanel2.add(reservationDateOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        dateChooser.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 230, 30));

        dateChooser2.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(dateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 230, 30));

        reservationDateIn.setText("Reservation Date In:");
        jPanel2.add(reservationDateIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 20));

        cancelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RID", "Student Number", "Room Type", "Date In", "Date Out",
            }
        )

        {public boolean isCellEditable(int row, int column) {
            return false;
        }}

    );
    cancelTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            cancelTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(cancelTable);

    jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 430, 360));

    searchButton1.setBackground(new java.awt.Color(255, 143, 44));
    searchButton1.setText("Click here to view your reservations");
    searchButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
    searchButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    searchButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchButton1ActionPerformed(evt);
        }
    });
    jPanel2.add(searchButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 430, 30));

    reservationNumber.setBackground(new java.awt.Color(255, 174, 69));
    reservationNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
    reservationNumber.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            reservationNumberActionPerformed(evt);
        }
    });
    jPanel2.add(reservationNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 230, 30));

    refreshButton.setBackground(new java.awt.Color(255, 143, 44));
    refreshButton.setText("Refresh");
    refreshButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
    refreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    refreshButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            refreshButtonActionPerformed(evt);
        }
    });
    jPanel2.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 430, 30));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 950, 480));

    backButton.setBackground(new java.awt.Color(255, 174, 69));
    backButton.setForeground(new java.awt.Color(0, 0, 51));
    backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backkk.png"))); // NOI18N
    backButton.setBorder(null);
    backButton.setBorderPainted(false);
    backButton.setContentAreaFilled(false);
    backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    backButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            backButtonActionPerformed(evt);
        }
    });
    jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 42, -1));

    title.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
    title.setForeground(new java.awt.Color(254, 221, 11));
    title.setText("  CANCEL RESERVATION");
    title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 221, 11), 2));
    title.setPreferredSize(new java.awt.Dimension(150, 50));
    jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 210, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * This method handles the action event triggered when the "Logout" button is clicked.
     * It displays a confirmation dialog asking the user if they want to logout.
     * If the user confirms, it creates a new instance of the `MainPage` class, sets its visibility to true,
     *  packs and centers the frame on the screen, and then disposes of the current `CancelReservation` frame.
     *
     * @param evt The `ActionEvent` object generated by the button click.
     */
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        int a = jOptionPane1.showConfirmDialog(null, "Are you sure you want to logout?", "Select", jOptionPane1.YES_NO_OPTION);
        if (a == 0) {
            MainPage mainFrame = new MainPage ();

            mainFrame.setVisible(true);
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(null);
            this.dispose();
        } else {

        }
    }//GEN-LAST:event_logoutButtonActionPerformed
    /**
     * This method handles the action event triggered when the "View Rooms" button is clicked.
     * It creates a new instance of the `RoomsType` class, sets its visibility to true, packs and centers the frame on the screen, and sets the default close operation to `DISPOSE_ON_CLOSE`.
     *
     * @param evt The `ActionEvent` object generated by the button click.
     */
    private void viewRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRoomsButtonActionPerformed
        View viewFrame = new View(user, this);
        
        viewFrame.setVisible(true);
        viewFrame.pack();
        viewFrame.setLocationRelativeTo(null);
        this.setVisible(false);  
    }//GEN-LAST:event_viewRoomsButtonActionPerformed
    /**
     * This method handles the action event triggered when the "Add Reservation" button is clicked.
     * It creates a new instance of the `UsersReservation` class, passing the current user and a reference to this frame as arguments. 
     * It then sets the new frame's visibility to true, packs and centers it on the screen, and hides the current `CancelReservation` frame.
     *
     * @param evt The `ActionEvent` object generated by the button click.
     */
    private void addReservationbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReservationbuttonActionPerformed
        UsersReservation userReservePageFrame = new UsersReservation(user, this);

        userReservePageFrame.setVisible(true);
        userReservePageFrame.pack();
        userReservePageFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_addReservationbuttonActionPerformed
    /**
     * This method handles the action event triggered when the "Home" button is clicked.
     * It creates a new instance of the `UserHome` class, passing the current user and a reference to this frame as arguments. 
     * It then sets the new frame's visibility to true, packs and centers it on the screen, and hides the current `CancelReservation` frame.
     *
     * @param evt The `ActionEvent` object generated by the button click.
     */
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        UserHome userHomePageFrame = new UserHome(user, this);

        userHomePageFrame.setVisible(true);
        userHomePageFrame.pack();
        userHomePageFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed
    /**
     * This method handles the action event triggered when the "Cancel Reservation" button is clicked.
     * It prompts the user for confirmation with a dialog box. If confirmed, it retrieves the reservation ID from the text field and the
     * selected room type from the combo box. It then calls the `removeReservation` method of the `reservation` object to attempt cancellation.
     *  - If successful, a success message is displayed using a JOptionPane dialog.
     *  - If unsuccessful, a failure message is displayed using a JOptionPane dialog.
     *
     * @param evt The `ActionEvent` object generated by the button click.
     */
    private void cancelReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReservationButtonActionPerformed

        try {
            String studno = username.getText();
            
            // Create a User object with the logged-in student number
            User loggedInUser = new User(studno);
            // Check if the provided student number matches the logged-in user's student number
            if (!studno.equals(loggedInUser.getUsername())) {
                jOptionPane1.showMessageDialog(this, "You can only make reservations for your own student number.", "Error", jOptionPane1.ERROR_MESSAGE);
            return;
            }    
            int a = jOptionPane1.showConfirmDialog(null, "Are you sure you want to cancel a reservation", "Select", jOptionPane1.YES_NO_OPTION);
                if (a == 0) {
                    int reservationID = Integer.parseInt(reservationNumber.getText());
                    int roomType = (int) roomComboBox.getSelectedItem();

                    if (reservation.removeReservation(reservationID, roomType)) {
                        jOptionPane1.showMessageDialog(rootPane, "Successfully cancelled a reservation!", "Cancel reservation", jOptionPane1.INFORMATION_MESSAGE);
                    } else {
                        jOptionPane1.showMessageDialog(rootPane, "Failed to cancelled a reservation!", "Cancel reservation", jOptionPane1.ERROR_MESSAGE);
                    }
                } else {

                }               
        } catch (HeadlessException | NumberFormatException e){
            System.out.println("Error canceling reservation: " + e.getMessage());
            jOptionPane1.showMessageDialog(this, "Error canceling reservation. Please try again.", "Error", jOptionPane1.ERROR_MESSAGE);
        }  

    }//GEN-LAST:event_cancelReservationButtonActionPerformed
    /**
     * This method handles the action event triggered when the "Clear" button is clicked.
     * It clears the text fields (`reservationNumber` and `searchStudentNum`) and sets the date pickers (`dateChooser` and `dateChooser2`) to null values.
     *
     * @param evt The `ActionEvent` object generated by the button click.
     */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        reservationNumber.setText("");
        dateChooser.setDate(null);
        dateChooser2.setDate(null);
    }//GEN-LAST:event_clearButtonActionPerformed
    /**
     * This method handles the action event triggered when the "Back" button is clicked.
     * It shows the previously displayed frame (`previousFrame`) and hides the current `CancelReservation` frame.
     *
     * @param evt The `ActionEvent` object generated by the button click.
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        previousFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        String studNum = username.getText(); 
        boolean hasReservations = reservation.fillCancelTable(cancelTable, studNum);            

        if (!hasReservations) {
            jOptionPane1.showMessageDialog(this, "You don't have any reserved rooms.", "Information", jOptionPane1.INFORMATION_MESSAGE);
        }         
    }//GEN-LAST:event_searchButton1ActionPerformed

   /**
     * This method handles the mouse click event on the `jTable1` (reservations table).
     * When a row is clicked, it retrieves the selected row index and populates the corresponding UI elements with the reservation details from the table model.
     * - `reservationNumber` text field is set with the reservation ID.
     * - `searchStudentNum` text field is set with the student number.
     * - `roomComboBox` is set with the selected room type.
     * - `dateChooser` and `dateChooser2` are set with the parsed date in and date out values from the table.
     * In case of parsing errors, it logs the exception using a Logger.
     *
     * @param evt The `MouseEvent` object generated by the mouse click on the table.
     */
    private void cancelTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelTableMouseClicked

        DefaultTableModel model = (DefaultTableModel)cancelTable.getModel();

        int rIndex = cancelTable.getSelectedRow();

        reservationNumber.setText(model.getValueAt(rIndex, 0).toString());
        roomComboBox.setSelectedItem(model.getValueAt(rIndex, 2));
        try {
            Date dateIn = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex,3).toString());
            dateChooser.setDate(dateIn);
            Date dateOut = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex,4).toString());
            dateChooser2.setDate(dateOut);
            
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cancelTableMouseClicked
    /**
     * This method handles the action event triggered when the "Refresh" button is clicked.
     * It clears the existing table model for `jTable1` and creates a new one with the desired column headers ("RID", "Student Number", "Room Type", "Date In", "Date Out").
     * It then retrieves the student number from the `searchStudentNum` text field and calls the `fillCancelTable` method of the `reservation` object to populate the table with reservations for that student.
     *
     * @param evt The `ActionEvent` object generated by the button click.
     */
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        cancelTable.setModel(new DefaultTableModel(null, new Object[]{"RID", "Student Number", "Room Type", "Date In", "Date Out"}));
        String studNum = username.getText();
        reservation.fillCancelTable(cancelTable, studNum);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void reservationNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservationNumberActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CancelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CancelReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addReservationbutton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelReservationButton;
    private javax.swing.JTable cancelTable;
    private javax.swing.JButton clearButton;
    private com.toedter.calendar.JDateChooser dateChooser;
    private com.toedter.calendar.JDateChooser dateChooser2;
    private javax.swing.JButton homeButton;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel prof;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel reservationDateIn;
    private javax.swing.JLabel reservationDateOut;
    private javax.swing.JLabel reservationIDLabel;
    private javax.swing.JTextField reservationNumber;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JLabel roomTypeLabel;
    private javax.swing.JButton searchButton1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel username;
    private javax.swing.JButton viewRoomsButton;
    // End of variables declaration//GEN-END:variables
}
