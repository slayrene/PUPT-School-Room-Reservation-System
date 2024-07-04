
package ReservationSystem;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * This class represents the ManageReservations frame. 
 * It allows administrators to manage student room reservations.
 */
public class ManageReservations extends javax.swing.JFrame {
    Reservations reservation = new Reservations();
    Rooms room = new Rooms();
    Db my_db = new Db();  
    private User user;
    private JFrame previousFrame;    
    /**
     * Creates new form ManageReservations
     */    
    public ManageReservations() {       
        initComponents();
        room.fillRoomCombo(roomComboBox);
        reservation.fillReservationTable(reservationTable);    
    }
    /**
     * Constructor that takes a User object and a reference to the previous JFrame.
     * 
     * @param user The User object representing the logged-in user.
     * @param previousFrame A reference to the JFrame that was previously displayed.
     */    
    ManageReservations(User user, JFrame previousFrame) {
        initComponents();
        this.user = user;
        this.previousFrame = previousFrame;
        username.setText(user.getUsername());
        room.fillRoomCombo(roomComboBox);
        reservation.fillReservationTable(reservationTable);
        reservation_ID.setEditable(false);
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        timePicker1 = new com.raven.swing.TimePicker();
        timePicker2 = new com.raven.swing.TimePicker();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        reservation_ID = new javax.swing.JTextField();
        studentNumber = new javax.swing.JTextField();
        roomComboBox = new javax.swing.JComboBox<>();
        roomTypesButton = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        dateChooser2 = new com.toedter.calendar.JDateChooser();
        addReserveButton = new javax.swing.JButton();
        editReserveButton = new javax.swing.JButton();
        removeReserveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        reservationLabel = new javax.swing.JLabel();
        roomTypesLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTable = new javax.swing.JTable();
        labelStudNo = new javax.swing.JLabel();
        reservationDateOut = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        reservationDateIn = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        prof = new javax.swing.JLabel();
        manageStudentsButton = new javax.swing.JButton();
        manageRoomsButton = new javax.swing.JButton();
        manageReservationsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(125, 10, 10));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 174, 69));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reservation_ID.setBackground(new java.awt.Color(255, 174, 69));
        reservation_ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        jPanel2.add(reservation_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 237, 30));

        studentNumber.setBackground(new java.awt.Color(255, 174, 69));
        studentNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        jPanel2.add(studentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 237, 30));

        roomComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(roomComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 117, 30));

        roomTypesButton.setBackground(new java.awt.Color(255, 143, 44));
        roomTypesButton.setText("Room Types");
        roomTypesButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
        roomTypesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        roomTypesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypesButtonActionPerformed(evt);
            }
        });
        jPanel2.add(roomTypesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 120, 30));

        dateChooser.setBackground(new java.awt.Color(255, 143, 44));
        dateChooser.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 240, -1));

        dateChooser2.setBackground(new java.awt.Color(255, 143, 44));
        dateChooser2.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(dateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 240, -1));

        addReserveButton.setBackground(new java.awt.Color(255, 143, 44));
        addReserveButton.setText("Add Reservation");
        addReserveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
        addReserveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addReserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addReserveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addReserveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 340, 122, 30));

        editReserveButton.setBackground(new java.awt.Color(255, 143, 44));
        editReserveButton.setText("Edit Reservation");
        editReserveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
        editReserveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editReserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editReserveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(editReserveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 340, 121, 30));

        removeReserveButton.setBackground(new java.awt.Color(255, 143, 44));
        removeReserveButton.setText("Remove Reservation");
        removeReserveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
        removeReserveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeReserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeReserveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(removeReserveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 340, 130, 30));

        clearButton.setBackground(new java.awt.Color(255, 143, 44));
        clearButton.setText("Clear Fields");
        clearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 400, 30));

        refreshButton.setBackground(new java.awt.Color(255, 143, 44));
        refreshButton.setText("Refresh");
        refreshButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 6, 1)));
        refreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        jPanel2.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 452, 30));

        searchField.setBackground(new java.awt.Color(255, 174, 69));
        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel2.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 113, 30));

        reservationLabel.setText("Reservation ID:");
        jPanel2.add(reservationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        roomTypesLabel.setText("Room Type:");
        jPanel2.add(roomTypesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 74, -1));

        reservationTable.setBackground(new java.awt.Color(249, 214, 137));
        reservationTable.setModel(new javax.swing.table.DefaultTableModel(
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
    reservationTable.setSelectionBackground(new java.awt.Color(125, 10, 10));
    reservationTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
    reservationTable.getTableHeader().setReorderingAllowed(false);
    reservationTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            reservationTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(reservationTable);

    jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

    labelStudNo.setText("Student Number:");
    jPanel2.add(labelStudNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 99, -1));

    reservationDateOut.setText("Reservation Date Out:");
    jPanel2.add(reservationDateOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

    searchLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    searchLabel.setText("Search:");
    jPanel2.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, 30));

    reservationDateIn.setText("Reservation Date In:");
    jPanel2.add(reservationDateIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 960, 520));

    title.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
    title.setForeground(new java.awt.Color(254, 221, 11));
    title.setText("      MANAGE RESERVATIONS");
    title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 221, 11), 2));
    title.setPreferredSize(new java.awt.Dimension(150, 50));
    jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 260, -1));

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
    jPanel5.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 519, 150, 51));

    username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    username.setForeground(new java.awt.Color(254, 221, 11));
    username.setText("0");
    jPanel5.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 480, 50, -1));

    prof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/prof.png"))); // NOI18N
    jPanel5.add(prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 416, -1, -1));

    manageStudentsButton.setBackground(new java.awt.Color(125, 10, 10));
    manageStudentsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    manageStudentsButton.setForeground(new java.awt.Color(254, 221, 11));
    manageStudentsButton.setText("Manage Students");
    manageStudentsButton.setBorder(null);
    manageStudentsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    manageStudentsButton.setPreferredSize(new java.awt.Dimension(93, 35));
    manageStudentsButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            manageStudentsButtonActionPerformed(evt);
        }
    });
    jPanel5.add(manageStudentsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 143, 150, 43));

    manageRoomsButton.setBackground(new java.awt.Color(125, 10, 10));
    manageRoomsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    manageRoomsButton.setForeground(new java.awt.Color(254, 221, 11));
    manageRoomsButton.setText("Manage Rooms");
    manageRoomsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
    manageRoomsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    manageRoomsButton.setPreferredSize(new java.awt.Dimension(93, 35));
    manageRoomsButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            manageRoomsButtonActionPerformed(evt);
        }
    });
    jPanel5.add(manageRoomsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 150, 45));

    manageReservationsButton.setBackground(new java.awt.Color(125, 10, 10));
    manageReservationsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    manageReservationsButton.setForeground(new java.awt.Color(254, 221, 11));
    manageReservationsButton.setText("Manage Reservations");
    manageReservationsButton.setBorder(null);
    manageReservationsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    manageReservationsButton.setPreferredSize(new java.awt.Dimension(93, 35));
    manageReservationsButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            manageReservationsButtonActionPerformed(evt);
        }
    });
    jPanel5.add(manageReservationsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 150, 45));

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

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  /**
   * Closes the current frame and shows the AdminHomePage frame.
   * 
   * @param evt The ActionEvent object.
   */
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        AdminHomePage adminHomePageFrame = new AdminHomePage(user, this);

        adminHomePageFrame.setVisible(true);
        adminHomePageFrame.pack();
        adminHomePageFrame.setLocationRelativeTo(null);        
        this.setVisible(false);   
    }//GEN-LAST:event_homeButtonActionPerformed
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
   * Closes the current frame and shows the ManageStudents frame.
   * 
   * @param evt The ActionEvent object.
   */
    private void manageStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStudentsButtonActionPerformed
        ManageStudents manageStudentsFrame = new ManageStudents (user, this);

        manageStudentsFrame.setVisible(true);
        manageStudentsFrame.pack();
        manageStudentsFrame.setLocationRelativeTo(null);
        this.setVisible(false);   
    }//GEN-LAST:event_manageStudentsButtonActionPerformed
  /**
   * Closes the current frame and shows the ManageRooms frame.
   * 
   * @param evt The ActionEvent object.
   */
    private void manageRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRoomsButtonActionPerformed
        ManageRoom manageRoomFrame = new ManageRoom (user, this);

        manageRoomFrame.setVisible(true);
        manageRoomFrame.pack();
        manageRoomFrame.setLocationRelativeTo(null);
        this.setVisible(false);   
    }//GEN-LAST:event_manageRoomsButtonActionPerformed
  /**
   * Closes the current frame and shows the ManageReservations frame.
   * 
   * @param evt The ActionEvent object.
   */
    private void manageReservationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageReservationsButtonActionPerformed
        ManageReservations manageReservationsFrame = new ManageReservations (user, this);

        manageReservationsFrame.setVisible(true);
        manageReservationsFrame.pack();
        manageReservationsFrame.setLocationRelativeTo(null);
        this.setVisible(false);   
    }//GEN-LAST:event_manageReservationsButtonActionPerformed
  /**
   * Closes the current frame and shows the room types frame.
   * 
   * @param evt The ActionEvent object.
   */
    private void roomTypesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypesButtonActionPerformed
        RoomsType RoomsTypeFrame = new RoomsType ();

        RoomsTypeFrame.setVisible(true);
        RoomsTypeFrame.pack();
        RoomsTypeFrame.setLocationRelativeTo(null);
        RoomsTypeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_roomTypesButtonActionPerformed
  /**
   * Reloads the reservation table with all reservations.
   * 
   * @param evt The ActionEvent object.
   */
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        reservationTable.setModel(new DefaultTableModel(null, new Object[]{"RID", "Student Number", "Room Type", "Date In", "Date Out"}));

        reservation.fillReservationTable(reservationTable);
    }//GEN-LAST:event_refreshButtonActionPerformed
  /**
   * Populates the text fields and date pickers based on the selected row in the reservation table.
   * 
   * @param evt The MouseEvent object.
   */
    private void reservationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationTableMouseClicked

        DefaultTableModel model = (DefaultTableModel)reservationTable.getModel();

        int rIndex = reservationTable.getSelectedRow();

        reservation_ID.setText(model.getValueAt(rIndex, 0).toString());
        studentNumber.setText(model.getValueAt(rIndex, 1).toString());
        roomComboBox.setSelectedItem(model.getValueAt(rIndex, 2));
        try {
            Date dateIn = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex,3).toString());
            dateChooser.setDate(dateIn);
            Date dateOut = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex,4).toString());
            dateChooser2.setDate(dateOut);
            
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reservationTableMouseClicked
  /**
   * Clears the text fields and date pickers.
   * 
   * @param evt The ActionEvent object.
   */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        reservation_ID.setText("");
        studentNumber.setText("");
        dateChooser.setDate(null);
        dateChooser2.setDate(null);
    }//GEN-LAST:event_clearButtonActionPerformed
  /**
   * Prompts the user for confirmation before deleting a reservation. If confirmed, removes the reservation 
   * from the database and refreshes the reservation table.
   * 
   * @param evt The ActionEvent object.
   */
    private void removeReserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeReserveButtonActionPerformed

        int a = jOptionPane1.showConfirmDialog(null, "Are you sure you want to delete a reservation", "Select", jOptionPane1.YES_NO_OPTION);
        if (a == 0) {
            int reservationID = Integer.parseInt(reservation_ID.getText());
            int roomType = (int) roomComboBox.getSelectedItem();
            
            if (reservation.removeReservation(reservationID, roomType))
            {
                jOptionPane1.showMessageDialog(rootPane, "Successfully deleted a reservation!", "Delete reservation", jOptionPane1.INFORMATION_MESSAGE);
            } else {
                jOptionPane1.showMessageDialog(rootPane, "Failed to delete a reservation!", "Delete reservation", jOptionPane1.ERROR_MESSAGE);
            }
        } else {

        }

    }//GEN-LAST:event_removeReserveButtonActionPerformed
  /**
   * Attempts to edit a reservation. Validates user input, checks for student existence, 
   * verifies date validity, and checks for room availability. If edits are successful, 
   * updates the reservation and refreshes the table. Displays informative messages to the user 
   * based on the outcome.
   * 
   * @param evt The ActionEvent object.
   */
    private void editReserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editReserveButtonActionPerformed

         if ("".equals(studentNumber.getText())) {
            jOptionPane1.showMessageDialog(this, "Student Number is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else if (roomComboBox.getSelectedItem() == null) {
            jOptionPane1.showMessageDialog(this, "Room Type is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else if (dateChooser.getDate() == null) {
            jOptionPane1.showMessageDialog(this, "Date is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else if (dateChooser2.getDate() == null) {
            jOptionPane1.showMessageDialog(this, "Date Out is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else {
            try {
                int roomNumber = Integer.parseInt(reservation_ID.getText());
                String studno = studentNumber.getText();
                int roomType = (int) roomComboBox.getSelectedItem();
                java.util.Date dateInUtil = dateChooser.getDate();
                java.sql.Date date_In = new java.sql.Date(dateInUtil.getTime());
                java.sql.Date date_Out = new java.sql.Date(dateChooser2.getDate().getTime());
                
                // Check if student exists
                if (!my_db.isStudentExist(studno)) {
                    jOptionPane1.showMessageDialog(this, "Student with number " + studno + " does not exist.", "Error", jOptionPane1.ERROR_MESSAGE);
                    return; // Exit method if student does not exist
                }

                // Validate date
                java.util.Date today = new java.util.Date();
                if (date_In.before(today) || date_Out.before(today) || date_Out.before(date_In)) {
                    jOptionPane1.showMessageDialog(this, "Dates must be today or in the future, and the end date must be after the start date.", "Error", jOptionPane1.ERROR_MESSAGE);
                    return;
                }
                
                // Check if reservation exists for the given room and dates
                if (reservation.isReservationExistForDates(roomType, date_In, date_Out)) {
                    jOptionPane1.showMessageDialog(this, "Room " + roomType + " is already reserved for the selected dates.", "Error", jOptionPane1.ERROR_MESSAGE);
                    return;
                }

                // Call addReservations method
                if (reservation.editReservations(roomNumber, studno, roomType, date_In, date_Out)) {
                    jOptionPane1.showMessageDialog(rootPane, "Successfully edited a reservation!", "Success", jOptionPane1.INFORMATION_MESSAGE);
                    // Update room reserved status after adding reservation
                    reservation.updateRoomReservedStatus(roomType);
                } else {
                    jOptionPane1.showMessageDialog(rootPane, "Failed to edit a reservation!", "Error", jOptionPane1.ERROR_MESSAGE);
                }                
                    
            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("Error editing a reservation: " + e.getMessage());
                jOptionPane1.showMessageDialog(this, "Error editing a reservation. Please try again.", "Error", jOptionPane1.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_editReserveButtonActionPerformed
  /**
   * Attempts to add a new reservation. Validates user input, checks for student existence, 
   * verifies date validity, and checks for room availability. If successful, adds the 
   * reservation and updates the table. Displays informative messages to the user based 
   * on the outcome.
   * 
   * @param evt The ActionEvent object.
   */
    private void addReserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReserveButtonActionPerformed

        if ("".equals(studentNumber.getText())) {
            jOptionPane1.showMessageDialog(this, "Student Number is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else if (roomComboBox.getSelectedItem() == null) {
            jOptionPane1.showMessageDialog(this, "Room Type is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else if (dateChooser.getDate() == null) {
            jOptionPane1.showMessageDialog(this, "Date is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else if (dateChooser2.getDate() == null) {
            jOptionPane1.showMessageDialog(this, "Date Out is required", "Error", jOptionPane1.ERROR_MESSAGE);
        } else {
            try {
                String studno = studentNumber.getText();
                int roomType = (int) roomComboBox.getSelectedItem();
                java.util.Date dateInUtil = dateChooser.getDate();
                java.sql.Date date_In = new java.sql.Date(dateInUtil.getTime());
                java.sql.Date date_Out = new java.sql.Date(dateChooser2.getDate().getTime());
                
                // Check if student exists
                if (!my_db.isStudentExist(studno)) {
                    jOptionPane1.showMessageDialog(this, "Student with number " + studno + " does not exist.", "Error", jOptionPane1.ERROR_MESSAGE);
                    return; // Exit method if student does not exist
                }

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
                if (reservation.addReservations(studno, roomType, date_In, date_Out)) {
                    jOptionPane1.showMessageDialog(rootPane, "Successfully added a reservation!", "Success", jOptionPane1.INFORMATION_MESSAGE);
                    // Update room reserved status after adding reservation
                    reservation.updateRoomReservedStatus(roomType);
                } else {
                    jOptionPane1.showMessageDialog(rootPane, "Failed to add a reservation!", "Error", jOptionPane1.ERROR_MESSAGE);
                }                
                    
            } catch (HeadlessException e) {
                System.out.println("Error adding reservation: " + e.getMessage());
                jOptionPane1.showMessageDialog(this, "Error adding a reservation. Please try again.", "Error", jOptionPane1.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_addReserveButtonActionPerformed

  /**
   * Implements a live search functionality for the reservation table. As the user types 
   * in the search field, the table content is filtered based on a regular expression match 
   * against all table columns.
   * 
   * @param evt The KeyEvent object triggered when a key is released in the search field.
   */
    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        DefaultTableModel obj = (DefaultTableModel) reservationTable.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter(obj);
        reservationTable.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(searchField.getText()));
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed
  /**
   * Closes the current frame and shows the previous frame.
   * 
   * @param evt The ActionEvent object.
   */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        previousFrame.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(ManageReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReservations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addReserveButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private com.toedter.calendar.JDateChooser dateChooser;
    private com.toedter.calendar.JDateChooser dateChooser2;
    private javax.swing.JButton editReserveButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelStudNo;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageReservationsButton;
    private javax.swing.JButton manageRoomsButton;
    private javax.swing.JButton manageStudentsButton;
    private javax.swing.JLabel prof;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton removeReserveButton;
    private javax.swing.JLabel reservationDateIn;
    private javax.swing.JLabel reservationDateOut;
    private javax.swing.JLabel reservationLabel;
    private javax.swing.JTable reservationTable;
    private javax.swing.JTextField reservation_ID;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JButton roomTypesButton;
    private javax.swing.JLabel roomTypesLabel;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField studentNumber;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    private javax.swing.JLabel title;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
