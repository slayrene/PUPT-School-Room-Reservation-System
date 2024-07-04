
package ReservationSystem;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * ManageRoom class represents the window for managing rooms.
 * This class extends javax.swing.JFrame and provides functionality to display and manage rooms in a GUI.
 */

public class ManageRoom extends javax.swing.JFrame {
    private User user;
    private JFrame previousFrame; 
    Rooms room = new Rooms(); // Instance of Rooms class for room management
    
    /*
        Creates a new ManageRoom window with specified user information and previous frame.
        Initializes the components of the ManageRoom GUI, sets the username label, and fills the room table.
    */    
    
    public ManageRoom() {
        initComponents();
        room.fillRoomTable(roomTable);    
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);        
    }

    ManageRoom(User user, JFrame previousFrame) {
    //    throw new UnsupportedOperationException("Not supported yet.");
        initComponents();
        this.user = user;
        this.previousFrame = previousFrame;
        username.setText(user.getUsername());
        room.fillRoomTable(roomTable);    
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        roomID.setEditable(false);
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        roomID = new javax.swing.JTextField();
        roomType = new javax.swing.JTextField();
        roomLocation = new javax.swing.JTextField();
        roomFloor = new javax.swing.JTextField();
        roomIDLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        roomTypeLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        floorLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        locationLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        userPic = new javax.swing.JLabel();
        manageStudentButton = new javax.swing.JButton();
        manageRoomButton = new javax.swing.JButton();
        manageReservationButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(125, 10, 10));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 174, 69));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roomID.setBackground(new java.awt.Color(255, 174, 69));
        roomID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        jPanel2.add(roomID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 237, 30));

        roomType.setBackground(new java.awt.Color(255, 174, 69));
        roomType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        jPanel2.add(roomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 237, 30));

        roomLocation.setBackground(new java.awt.Color(255, 174, 69));
        roomLocation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        jPanel2.add(roomLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 146, 237, 30));

        roomFloor.setBackground(new java.awt.Color(255, 174, 69));
        roomFloor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        jPanel2.add(roomFloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 237, 30));

        roomIDLabel.setText("Room ID:");
        jPanel2.add(roomIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        addButton.setBackground(new java.awt.Color(255, 143, 44));
        addButton.setText("Add Room");
        addButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 100, 30));

        editButton.setBackground(new java.awt.Color(255, 143, 44));
        editButton.setText("Edit Room");
        editButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel2.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, 30));

        removeButton.setBackground(new java.awt.Color(255, 143, 44));
        removeButton.setText("Remove Room");
        removeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        removeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 114, 30));

        roomTypeLabel.setText("Room Name:");
        jPanel2.add(roomTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        clearButton.setBackground(new java.awt.Color(255, 143, 44));
        clearButton.setText("Clear Fields");
        clearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 340, 30));

        roomTable.setBackground(new java.awt.Color(249, 214, 137));
        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Room Name", "Location", "Floor","Reserved"
            }
        )

        {public boolean isCellEditable(int row, int column) {
            return false;
        }}

    );
    roomTable.setSelectionBackground(new java.awt.Color(125, 10, 10));
    roomTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
    roomTable.getTableHeader().setReorderingAllowed(false);
    roomTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            roomTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(roomTable);

    jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 53, -1, 364));

    refreshButton.setBackground(new java.awt.Color(255, 143, 44));
    refreshButton.setText("Refresh");
    refreshButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));
    refreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    refreshButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            refreshButtonActionPerformed(evt);
        }
    });
    jPanel2.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 429, 452, 30));

    floorLabel.setText("Floor:");
    jPanel2.add(floorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 40, -1));

    statusLabel.setText("Status:");
    jPanel2.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 63, -1));

    jPanel3.setBackground(new java.awt.Color(255, 174, 69));
    jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 10, 10)));

    jRadioButton1.setBackground(new java.awt.Color(255, 174, 69));
    jRadioButton1.setText("Yes");
    jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButton1ActionPerformed(evt);
        }
    });

    jRadioButton2.setBackground(new java.awt.Color(255, 174, 69));
    jRadioButton2.setText("No");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addComponent(jRadioButton1)
            .addGap(43, 43, 43)
            .addComponent(jRadioButton2)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButton1)
                .addComponent(jRadioButton2))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 237, -1));

    locationLabel.setText("Location:");
    jPanel2.add(locationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 63, -1));

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
    jPanel2.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 113, 30));

    searchLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    searchLabel.setText("Search:");
    jPanel2.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 890, 490));

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
    title.setText("         MANAGE ROOMS");
    title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 221, 11), 2));
    title.setPreferredSize(new java.awt.Dimension(150, 50));
    jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 15, 223, -1));

    jPanel4.setBackground(new java.awt.Color(92, 6, 1));
    jPanel4.setPreferredSize(new java.awt.Dimension(150, 620));
    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
    jPanel4.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 489, 150, 51));

    username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    username.setForeground(new java.awt.Color(254, 221, 11));
    username.setText("0");
    jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 450, 60, -1));

    userPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/prof.png"))); // NOI18N
    jPanel4.add(userPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 386, -1, -1));

    manageStudentButton.setBackground(new java.awt.Color(125, 10, 10));
    manageStudentButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    manageStudentButton.setForeground(new java.awt.Color(254, 221, 11));
    manageStudentButton.setText("Manage Students");
    manageStudentButton.setBorder(null);
    manageStudentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    manageStudentButton.setPreferredSize(new java.awt.Dimension(93, 35));
    manageStudentButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            manageStudentButtonActionPerformed(evt);
        }
    });
    jPanel4.add(manageStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 143, 150, 43));

    manageRoomButton.setBackground(new java.awt.Color(125, 10, 10));
    manageRoomButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    manageRoomButton.setForeground(new java.awt.Color(254, 221, 11));
    manageRoomButton.setText("Manage Rooms");
    manageRoomButton.setBorder(null);
    manageRoomButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    manageRoomButton.setPreferredSize(new java.awt.Dimension(93, 35));
    manageRoomButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            manageRoomButtonActionPerformed(evt);
        }
    });
    jPanel4.add(manageRoomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 150, 45));

    manageReservationButton.setBackground(new java.awt.Color(125, 10, 10));
    manageReservationButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    manageReservationButton.setForeground(new java.awt.Color(254, 221, 11));
    manageReservationButton.setText("Manage Reservations");
    manageReservationButton.setBorder(null);
    manageReservationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    manageReservationButton.setPreferredSize(new java.awt.Dimension(93, 35));
    manageReservationButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            manageReservationButtonActionPerformed(evt);
        }
    });
    jPanel4.add(manageReservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 150, 45));

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
    jPanel4.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
        Action performed when the Add button is clicked.
        Validates input fields and adds a new room if validation passes.
        Shows appropriate message dialogs on success or failure.    
    */ 
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        if ("".equals(roomType.getText())){
            jOptionPane1.showMessageDialog(this, "Room Type is required");
        } else if ("".equals(roomLocation.getText())){
            jOptionPane1.showMessageDialog(this, "Room Location is required");
        } else if ("".equals(roomFloor.getText())){
            jOptionPane1.showMessageDialog(this, "Room Floor is required");
        } else {

                String rType = roomType.getText();
                String rlocation = roomLocation.getText();
                String rFloor = roomFloor.getText();
            
                if (room.addRoom(rType, rlocation, rFloor)){
                    jOptionPane1.showMessageDialog(rootPane, "Successfully added a room!", "Add Room", jOptionPane1.INFORMATION_MESSAGE);
                } else {
                    jOptionPane1.showMessageDialog(rootPane, "Failed to add a room!", "Add Room", jOptionPane1.ERROR_MESSAGE);   
                }
      
        }
        
    }//GEN-LAST:event_addButtonActionPerformed
  /**
   * Attempts to edit an existing room. Validates user input for required fields (room type, 
   * location, and floor), parses the room ID as an integer, and retrieves the reservation status. 
   * Calls the `room.editRoom` method to update the room data in the system. Displays informative 
   * messages to the user based on the outcome.
   * 
   * @param evt The ActionEvent object.
   */
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
           
        if ("".equals(roomType.getText())){
            jOptionPane1.showMessageDialog(this, "Room Type is required");
        } else if ("".equals(roomLocation.getText())){
            jOptionPane1.showMessageDialog(this, "Room Location is required");
        } else if ("".equals(roomFloor.getText())){
            jOptionPane1.showMessageDialog(this, "Room Floor is required");
        } else {
            try {
                int roomNumber = Integer.parseInt(roomID.getText());
                String rType = roomType.getText();
                String rlocation = roomLocation.getText();
                String rFloor = roomFloor.getText();                
                String isReserved = "No";

                if (jRadioButton1.isSelected()) {
                  isReserved = "Yes";
                }

                if (room.editRoom(roomNumber, rType, rlocation, rFloor, isReserved)) {
                  jOptionPane1.showMessageDialog(rootPane, "Successfully edited a room!", "Edit Room", jOptionPane1.INFORMATION_MESSAGE);
                } else {
                  jOptionPane1.showMessageDialog(rootPane, "Failed to edit a room!", "Edit Room", jOptionPane1.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                jOptionPane1.showMessageDialog(this, "Invalid room ID format. Please enter an integer.", "Edit Room", jOptionPane1.ERROR_MESSAGE);
            } catch (Exception e) {
                System.out.println("Error editing room: " + e.getMessage());
                // Consider more specific exception handling here (e.g., for missing room ID)
            }
        }         
    }//GEN-LAST:event_editButtonActionPerformed
  /**
   * Prompts the user for confirmation before deleting a room. If confirmed, removes the room 
   * from the system and displays a success/failure message.
   * 
   * @param evt The ActionEvent object.
   */
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed

        int a = jOptionPane1.showConfirmDialog(null, "Are you sure you want to delete a room?", "Select", jOptionPane1.YES_NO_OPTION);
        if (a == 0) {
            int roomNumber = Integer.parseInt(roomID.getText());

            if (room.removeRoom(roomNumber)) 
                {
                    jOptionPane1.showMessageDialog(rootPane, "Successfully deleted a room!", "Delete room", jOptionPane1.INFORMATION_MESSAGE);
                } else {
                    jOptionPane1.showMessageDialog(rootPane, "Failed to delete a room!", "Delete room", jOptionPane1.ERROR_MESSAGE);   
                }           
        } else {
           
        }          
        
    }//GEN-LAST:event_removeButtonActionPerformed
  /**
   * Clears all room data input fields and sets the "No" radio button for the reservation status.
   * 
   * @param evt The ActionEvent object.
   */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        roomID.setText("");
        roomType.setText("");
        roomLocation.setText("");
        roomFloor.setText("");
        jRadioButton2.setSelected(true);
    }//GEN-LAST:event_clearButtonActionPerformed
  /**
   * Populates the room data input fields and reservation status radio buttons based on the 
   * currently selected row in the room table.
   * 
   * @param evt The MouseEvent object triggered when a table row is clicked.
   */
    private void roomTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)roomTable.getModel();
        
        int rIndex = roomTable.getSelectedRow();
        
        roomID.setText(model.getValueAt(rIndex, 0).toString());
        roomType.setText(model.getValueAt(rIndex, 1).toString());
        roomLocation.setText(model.getValueAt(rIndex, 2).toString());        
        roomFloor.setText(model.getValueAt(rIndex, 3).toString());     
        
        String isReserved = (String) model.getValueAt(rIndex, 4);
        
        if (isReserved.equals("Yes")){
            jRadioButton1.setSelected(true);
        } else {
            jRadioButton2.setSelected(true);
        }
        
    }//GEN-LAST:event_roomTableMouseClicked
  /**
   * Refreshes the room table by clearing the existing data model and then calling 
   * the `room.fillRoomTable` method to populate the table with fresh data.
   * 
   * @param evt The ActionEvent object.
   */
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed

        roomTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Room Name", "Location", "Floor", "Reserved"}));

        room.fillRoomTable(roomTable);
    }//GEN-LAST:event_refreshButtonActionPerformed
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
   * Prompts the user for confirmation before logging out. If confirmed, creates a new instance 
   * of the MainPage class, sets it visible, and disposes of the current frame.
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
   * Opens the ManageStudents frame for managing student data. Passes the current user object 
   * and a reference to this frame to the new frame.
   * 
   * @param evt The ActionEvent object.
   */
    private void manageStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStudentButtonActionPerformed
        ManageStudents manageStudentsFrame = new ManageStudents (user, this);

        manageStudentsFrame.setVisible(true);
        manageStudentsFrame.pack();
        manageStudentsFrame.setLocationRelativeTo(null);
        this.setVisible(false);   
    }//GEN-LAST:event_manageStudentButtonActionPerformed
 /**
   * Opens the ManageRoom frame for managing rooms data. Passes the current user object 
   * and a reference to this frame to the new frame.
   * 
   * @param evt The ActionEvent object.
   */
    private void manageRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRoomButtonActionPerformed
        ManageRoom manageRoomFrame = new ManageRoom (user, this);

        manageRoomFrame.setVisible(true);
        manageRoomFrame.pack();
        manageRoomFrame.setLocationRelativeTo(null);
        this.setVisible(false);   
    }//GEN-LAST:event_manageRoomButtonActionPerformed
 /**
   * Opens the ManageReservations frame for managing reservations data. Passes the current user object 
   * and a reference to this frame to the new frame.
   * 
   * @param evt The ActionEvent object.
   */
    private void manageReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageReservationButtonActionPerformed
        ManageReservations manageReservationsFrame = new ManageReservations (user, this);

        manageReservationsFrame.setVisible(true);
        manageReservationsFrame.pack();
        manageReservationsFrame.setLocationRelativeTo(null);
        this.setVisible(false);   
    }//GEN-LAST:event_manageReservationButtonActionPerformed
  /**
   * Placeholder for handling actions triggered when the user presses Enter in the search field.
   * 
   * @param evt The ActionEvent object.
   */
    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        DefaultTableModel obj = (DefaultTableModel) roomTable.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter(obj);
        roomTable.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(searchField.getText()));
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed
  /**
   * Opens the AdminHomePage frame, passing the current user object and a reference to this 
   * frame to the new frame.
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
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel floorLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageReservationButton;
    private javax.swing.JButton manageRoomButton;
    private javax.swing.JButton manageStudentButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField roomFloor;
    private javax.swing.JTextField roomID;
    private javax.swing.JLabel roomIDLabel;
    private javax.swing.JTextField roomLocation;
    private javax.swing.JTable roomTable;
    private javax.swing.JTextField roomType;
    private javax.swing.JLabel roomTypeLabel;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userPic;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
