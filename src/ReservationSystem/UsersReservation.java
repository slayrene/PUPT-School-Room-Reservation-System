
package ReservationSystem;

import javax.swing.JFrame;
/**
 * This class represents the UsersReservation frame. It allows users to reserve rooms.
 * 
 */
public class UsersReservation extends javax.swing.JFrame {
    Reservations reservation = new Reservations();
    Rooms room = new Rooms();
    private User user;
    private JFrame previousFrame;      
    
    /**
     * Creates new form UsersReservation
     */
    public UsersReservation() {
        initComponents();
        room.fillRoomCombo(roomComboBox);        
    }
    /**
     * This constructor creates a new UsersReservation frame and sets the user and previous frame.
     * 
     * @param user The user who is making the reservation.
     * @param previousFrame The previous frame that the user was on.
     */
    UsersReservation(User user, JFrame previousFrame) {
    //    throw new UnsupportedOperationException("Not supported yet.");
        initComponents();
        this.user = user;
        this.previousFrame = previousFrame;        
        username.setText(user.getUsername());
        room.fillRoomCombo(roomComboBox);
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
        timePicker1 = new com.raven.swing.TimePicker();
        timePicker2 = new com.raven.swing.TimePicker();
        jPanel5 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        viewRoomsButton = new javax.swing.JButton();
        reservationButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addReservationButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        roomComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        roomTypesButton = new javax.swing.JButton();
        dateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

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

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/prof.png"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        viewRoomsButton.setBackground(new java.awt.Color(125, 10, 10));
        viewRoomsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewRoomsButton.setForeground(new java.awt.Color(254, 221, 11));
        viewRoomsButton.setText("View Overall Reservations");
        viewRoomsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        viewRoomsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewRoomsButton.setPreferredSize(new java.awt.Dimension(93, 35));
        viewRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRoomsButtonActionPerformed(evt);
            }
        });
        jPanel5.add(viewRoomsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 126, 150, 45));

        reservationButton.setBackground(new java.awt.Color(125, 10, 10));
        reservationButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reservationButton.setForeground(new java.awt.Color(254, 221, 11));
        reservationButton.setText("Add Reservation");
        reservationButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        reservationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservationButton.setPreferredSize(new java.awt.Dimension(93, 35));
        reservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationButtonActionPerformed(evt);
            }
        });
        jPanel5.add(reservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 177, 150, 45));

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

        addReservationButton.setBackground(new java.awt.Color(255, 143, 44));
        addReservationButton.setText("Add Reservation");
        addReservationButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
        addReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addReservationButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addReservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 380, 30));

        jLabel5.setText("Room Type:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 74, -1));

        clearButton.setBackground(new java.awt.Color(255, 143, 44));
        clearButton.setText("Clear Fields");
        clearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 380, 30));

        jPanel2.add(roomComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 117, 30));

        jLabel9.setText("Reservation Date Out:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        dateChooser.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 230, -1));

        roomTypesButton.setBackground(new java.awt.Color(255, 143, 44));
        roomTypesButton.setText("Room Types");
        roomTypesButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
        roomTypesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypesButtonActionPerformed(evt);
            }
        });
        jPanel2.add(roomTypesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 110, 30));

        dateChooser2.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(dateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 230, -1));

        jLabel10.setText("Reservation Date In:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 750, 460));

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

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(254, 221, 11));
        jLabel15.setText("      RESERVE A ROOM");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 221, 11), 2));
        jLabel15.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  /**
   * Prompts the user for confirmation before logging out. If confirmed, closes the current frame 
   * and shows the MainPage frame. 
   * 
   * @param evt The ActionEvent object.
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
   * Opens the the rooms type frame.
   * 
   */
    private void viewRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRoomsButtonActionPerformed
        View viewFrame = new View(user, this);
        
        viewFrame.setVisible(true);
        viewFrame.pack();
        viewFrame.setLocationRelativeTo(null);
        this.setVisible(false);      
    }//GEN-LAST:event_viewRoomsButtonActionPerformed
  /**
   * Attempts to add a new reservation. Validates user input, checks for student existence, 
   * verifies date validity, and checks for room availability. If successful, adds the 
   * reservation and updates the table. Displays informative messages to the user based 
   * on the outcome.
   */
    private void addReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReservationButtonActionPerformed
/*        if ("".equals(studentNumber.getText())) {
            jOptionPane1.showMessageDialog(this, "Student Number is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else */ if (roomComboBox.getSelectedItem() == null) {
            jOptionPane1.showMessageDialog(this, "Room Type is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else if (dateChooser.getDate() == null) {
            jOptionPane1.showMessageDialog(this, "Date is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else if (dateChooser2.getDate() == null) {
            jOptionPane1.showMessageDialog(this, "Date Out is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else {
            try {
//                String studno = studentNumber.getText();
                String student = username.getText();
                int roomType = (int) roomComboBox.getSelectedItem();
                java.util.Date dateInUtil = dateChooser.getDate();
                java.sql.Date date_In = new java.sql.Date(dateInUtil.getTime());
                java.sql.Date date_Out = new java.sql.Date(dateChooser2.getDate().getTime());
                
                    // Validate date
                   java.util.Date today = new java.util.Date();
                   if (date_In.before(today) || date_Out.before(today) || date_Out.before(date_In)) {
                       jOptionPane1.showMessageDialog(this, "Dates must be in the future, and the end date must be after the start date.", "Error", jOptionPane1.ERROR_MESSAGE);
                       return;
                   }

                    // Check if reservation exists for the given room and dates
                    if (reservation.isReservationExistForDates(roomType, date_In, date_Out)) {
                        jOptionPane1.showMessageDialog(this, "Room " + roomType + " is already reserved for the selected dates.", "Error", jOptionPane1.ERROR_MESSAGE);
                        return;
                    }

                    // Call addReservations method
                    if (reservation.addReservations(student, roomType, date_In, date_Out)) {
                        jOptionPane1.showMessageDialog(rootPane, "Successfully added a reservation!", "Success", jOptionPane1.INFORMATION_MESSAGE);
                        // Update room reserved status after adding reservation
                        reservation.updateRoomReservedStatus(roomType);
                    } else {
                        jOptionPane1.showMessageDialog(rootPane, "Failed to add a reservation!", "Error", jOptionPane1.ERROR_MESSAGE);
                    }   
                          
            } catch (Exception e) {
                System.out.println("Error adding reservation: " + e.getMessage());
                jOptionPane1.showMessageDialog(this, "Error adding a reservation. Please try again.", "Error", jOptionPane1.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_addReservationButtonActionPerformed
  /**
   * Clears the text fields and date pickers.
   */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
//        reservation_ID.setText("");
//        studentNumber.setText("");
        dateChooser.setDate(null);
        dateChooser2.setDate(null);
    }//GEN-LAST:event_clearButtonActionPerformed
  /**
   * Opens the the rooms type frame.
   * 
   */
    private void roomTypesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypesButtonActionPerformed
        RoomsType RoomsTypeFrame = new RoomsType ();

        RoomsTypeFrame.setVisible(true);
        RoomsTypeFrame.pack();
        RoomsTypeFrame.setLocationRelativeTo(null);
        RoomsTypeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_roomTypesButtonActionPerformed
    /**
   * Closes the current frame and shows the previous frame.
   */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        previousFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void reservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservationButtonActionPerformed
 /**
   * Closes the current frame and shows the AdminHomePage frame.
   * 
   * @param evt The ActionEvent object.
   */
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        UserHome userHomePageFrame = new UserHome(user, this);

        userHomePageFrame.setVisible(true);
        userHomePageFrame.pack();
        userHomePageFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed
  /**
   * Closes the current frame and shows the CancelReservations frame.
   * 
   * @param evt The ActionEvent object.
   */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        CancelReservation cancelPageFrame = new CancelReservation(user, this);

        cancelPageFrame.setVisible(true);
        cancelPageFrame.pack();
        cancelPageFrame.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UsersReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addReservationButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private com.toedter.calendar.JDateChooser dateChooser;
    private com.toedter.calendar.JDateChooser dateChooser2;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton reservationButton;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JButton roomTypesButton;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    private javax.swing.JLabel username;
    private javax.swing.JButton viewRoomsButton;
    // End of variables declaration//GEN-END:variables
}
