/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Auditor;
import model.Branch;
import model.Materials;
import service.AuditorService;
import service.BranchService;
import service.MaterialService;

/**
 *
 * @author Celia
 */
public class RegisterAuditor extends javax.swing.JFrame {
    DefaultTableModel tableModel = new DefaultTableModel(); 
  private DefaultListModel listModel = new DefaultListModel<>();

    /**
     * Creates new form RegisterAuditor
     */
    public RegisterAuditor() {
        initComponents();
        addBranchItemCombo();
        addMaterialItemList();
        //addData();
        
    }
    
    
    public void addBranchItemCombo(){
       try {
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
           BranchService service =   (BranchService) theRegistry.lookup("branch");
           List<Branch> branches = service.allBranch();
           for(Branch brObj: branches){
           branchCombo.addItem(brObj);
           }
           
       } catch (Exception ex) {
           ex.printStackTrace();
       
       }  
   }
    
public void addMaterialItemList(){
       try{
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            MaterialService service = (MaterialService) theRegistry.lookup("material");
            List<Materials> mat = service.allMaterial();
            
            for(Materials matObj : mat){
                listModel.addElement(matObj);
            }
            materialsList.setModel(listModel);
        }catch(Exception ex){
            ex.printStackTrace();
        } 
   }

//private void addRoleItemOnList(){
//        try{
//            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
//            RolesService service = (RolesService) theRegistry.lookup("role");
//            List<Roles> roles = service.allRolesList();
//            for(Roles role : roles){
//                listModel.addElement(role.getRoleId()+"-"+role.getName());
//            }
//            rolesList.setModel(listModel);
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//    }

public void addData(){
         try {
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
           AuditorService service = (AuditorService) theRegistry.lookup("auditor");
            Auditor theAuditor = new Auditor();
            DefaultTableModel tm=(DefaultTableModel)auditorTable.getModel();
            List<Auditor> audObj = service.allAuditor();
              tableModel.setRowCount(0);
              if(audObj!=null){
           for(Auditor theAud: audObj){
              Object data[]={
                  String.valueOf(theAud.getId()),
                  theAud.getFullnames(),
                  theAud.getGender(),
                  theAud.getBirth_date(),
                  theAud.getPhoneNumber(),
                  theAud.getBranch(),
                  //theAud.getMaterials(),
                  theAud.getStartedDate()
              };
              tm.addRow(data);
              
           }}else{
                  JOptionPane.showMessageDialog(this, "no data found");
              }
              
         } catch (Exception e) {
             e.printStackTrace();
         }
     }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        namesTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        GenderCombo = new javax.swing.JComboBox<>();
        dobTxt = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        phonenbrTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        branchCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        materialsList = new javax.swing.JList<>();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        recordBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        searchIdTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        auditorTable = new javax.swing.JTable();
        printBtn = new javax.swing.JButton();
        previousPgeLink = new javax.swing.JLabel();
        logoutLink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setText("Register Auditor");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel2.setText("Auditor ID:");

        idTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        namesTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel5.setText("Full Names:");

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel6.setText("Gender:");

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel7.setText("Date of Birth:");

        GenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        GenderCombo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel8.setText("Phone Number:");

        phonenbrTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel9.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel9.setText("Branch:");

        branchCombo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel10.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel10.setText("Materials:");

        jScrollPane1.setViewportView(materialsList);

        updateBtn.setBackground(new java.awt.Color(0, 153, 0));
        updateBtn.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 153, 0));
        deleteBtn.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        recordBtn.setBackground(new java.awt.Color(0, 153, 0));
        recordBtn.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        recordBtn.setText("Record");
        recordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dobTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(GenderCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namesTxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(branchCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phonenbrTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(recordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(namesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(phonenbrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(branchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(GenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchIdTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        jLabel11.setText("Search for the Auditor by ID:");

        searchBtn.setBackground(new java.awt.Color(0, 153, 0));
        searchBtn.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        auditorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Auditor ID", "Auditor Name", "Gender", "Date of Birth", "Phone Number", "Branch Name", "Started Date"
            }
        ));
        jScrollPane2.setViewportView(auditorTable);
        if (auditorTable.getColumnModel().getColumnCount() > 0) {
            auditorTable.getColumnModel().getColumn(5).setResizable(false);
        }

        printBtn.setBackground(new java.awt.Color(0, 153, 0));
        printBtn.setFont(new java.awt.Font("Mongolian Baiti", 1, 20)); // NOI18N
        printBtn.setText("Print");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        previousPgeLink.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        previousPgeLink.setForeground(new java.awt.Color(51, 51, 255));
        previousPgeLink.setText("<Go to previous page");
        previousPgeLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousPgeLinkMouseClicked(evt);
            }
        });

        logoutLink.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        logoutLink.setForeground(new java.awt.Color(51, 51, 255));
        logoutLink.setText("Logout");
        logoutLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLinkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel11)
                        .addGap(27, 27, 27)
                        .addComponent(searchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(previousPgeLink)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutLink))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousPgeLink)
                    .addComponent(logoutLink))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordBtnActionPerformed
        if (idTxt.getText().trim().isEmpty() || namesTxt.getText().trim().isEmpty()||branchCombo.getSelectedItem().toString().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fieds are required", "Mandatory Fields", JOptionPane.WARNING_MESSAGE);
    }else if(phonenbrTxt.getText().trim().length()!=10){
         JOptionPane.showMessageDialog(null, "Phone Number Must Be 10 Integers", "Information Message",JOptionPane.INFORMATION_MESSAGE);
        }else if(!phonenbrTxt.getText().trim().startsWith("07")){
         JOptionPane.showMessageDialog(null, "Phone Number Must Be Start With 07 ", "Information Message",JOptionPane.INFORMATION_MESSAGE);
        }else{
        
        try {
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            AuditorService service = (AuditorService) theRegistry.lookup("auditor");
            Auditor theAuditor = new Auditor();
            theAuditor.setId(Integer.parseInt(idTxt.getText()));
            theAuditor.setFullnames(namesTxt.getText());
            theAuditor.setBranch((Branch) branchCombo.getSelectedItem());
            
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date= sdf.format(dobTxt.getDate());
            Date selectedDate = dobTxt.getDate();
            
            Date currentDate = new Date();
            if (selectedDate.after(currentDate)) {
                JOptionPane.showMessageDialog(this, "Birth date cannot be a future date");
                return; 
            }
            theAuditor.setBirth_date(date);
            theAuditor.setGender((String) GenderCombo.getSelectedItem());
            theAuditor.setPhoneNumber(phonenbrTxt.getText());
            Set<Materials> mat = new HashSet<>();
            List<Materials> materialList = materialsList.getSelectedValuesList();
            for(Materials theObj: materialList){
                mat.add(theObj);
            }
            theAuditor.setMaterials(mat);
            Auditor audObj = service.recordAuditor(theAuditor);
            if(audObj!=null){
                JOptionPane.showMessageDialog(this, "Data saved");
            }else{
                JOptionPane.showMessageDialog(this, "Data not saved");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        addData();
        idTxt.setText(""); 
        namesTxt.setText("");
        branchCombo.setSelectedItem("");
        dobTxt.setDateFormatString("");
        phonenbrTxt.setText("");
        GenderCombo.setSelectedItem("");
        }
    }//GEN-LAST:event_recordBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        
        try {

            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            AuditorService service =(AuditorService) theRegistry.lookup("auditor");
            Auditor theAuditor = new Auditor();
            theAuditor.setId(Integer.parseInt(searchIdTxt.getText()));
            Auditor audObj = service.searchAuditor(theAuditor);
            if (audObj != null) {
                idTxt.setText(String.valueOf(audObj.getId()));
                namesTxt.setText(audObj.getFullnames());
                branchCombo.setSelectedItem(audObj.getBranch());
                GenderCombo.setSelectedItem(audObj.getGender());
                phonenbrTxt.setText(audObj.getPhoneNumber());
                //dobTxt.setDate(audObj.getBirth_date());
                
                //dobTxt.setDateFormatString(audObj.getBirth_date());
             
               // materialList.setSelectedValue(theObj.getStock());
            } else {
                JOptionPane.showMessageDialog(this, "Data not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        
        try{
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            AuditorService service =(AuditorService) theRegistry.lookup("auditor");
            Auditor theAuditor = new Auditor();
            theAuditor.setId(Integer.parseInt(searchIdTxt.getText()));
            //theAuditor.setId(Integer.parseInt(searchIdTxt.getText()));
             theAuditor.setFullnames(namesTxt.getText());
            theAuditor.setBranch((Branch) branchCombo.getSelectedItem());
            
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date= sdf.format(dobTxt.getDate());
            theAuditor.setBirth_date(date);
            theAuditor.setGender((String) GenderCombo.getSelectedItem());
            theAuditor.setPhoneNumber(phonenbrTxt.getText());
            Set<Materials> mat = new HashSet<>();
            List<Materials> materialList = materialsList.getSelectedValuesList();
            for(Materials theObj: materialList){
                mat.add(theObj);
            }
            theAuditor.setMaterials(mat);
            Auditor audObj = service.recordAuditor(theAuditor);
            if(audObj!=null){
                JOptionPane.showMessageDialog(this, "Data Updated");
            }else{
                JOptionPane.showMessageDialog(this, "Data not updated");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
        try {
            MessageFormat header = new MessageFormat("Auditors list");
            MessageFormat footer = new MessageFormat("0,number,interger");
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.PORTRAIT);
            auditorTable.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
            JOptionPane.showMessageDialog(null, "\n" + "Printed!");
        } catch (Exception e) {
            e.printStackTrace();
      }
    }//GEN-LAST:event_printBtnActionPerformed

    private void previousPgeLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousPgeLinkMouseClicked
        // TODO add your handling code here:
        ManagerDashboard dash = new ManagerDashboard();
            dash.show();
            this.hide();
    }//GEN-LAST:event_previousPgeLinkMouseClicked

    private void logoutLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLinkMouseClicked
        LoginForm dash = new LoginForm();
            dash.show();
            this.hide();
    }//GEN-LAST:event_logoutLinkMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete the selected record", "Confirm", JOptionPane.YES_NO_OPTION);
       if(response==JOptionPane.YES_OPTION){
        
        
        try{
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",6000);
            AuditorService service =(AuditorService) theRegistry.lookup("auditor");
            Auditor theAuditor = new Auditor();
            theAuditor.setId(Integer.parseInt(searchIdTxt.getText()));

            Auditor theObj = service.deleteAuditor(theAuditor);
            if(theObj!=null){
                JOptionPane.showMessageDialog(this, "Auditor Deleted Successfully");
            }else{
                JOptionPane.showMessageDialog(this, "Auditor not deleted");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }}
        idTxt.setText(""); 
        namesTxt.setText("");
        branchCombo.setSelectedItem("");
        dobTxt.setDateFormatString("");
        phonenbrTxt.setText("");
        GenderCombo.setSelectedItem("");
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterAuditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAuditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAuditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAuditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAuditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GenderCombo;
    private javax.swing.JTable auditorTable;
    private javax.swing.JComboBox<Branch> branchCombo;
    private javax.swing.JButton deleteBtn;
    private com.toedter.calendar.JDateChooser dobTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoutLink;
    private javax.swing.JList<Materials> materialsList;
    private javax.swing.JTextField namesTxt;
    private javax.swing.JTextField phonenbrTxt;
    private javax.swing.JLabel previousPgeLink;
    private javax.swing.JButton printBtn;
    private javax.swing.JButton recordBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchIdTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
