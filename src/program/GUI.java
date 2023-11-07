package program;

import java.awt.*;
import java.io.*;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SzabóRoland(SZOFT_20
 */
public class GUI extends javax.swing.JFrame {

    String[][][] pizza;
    String[][][] osszetevok; 
    String ercheck;
    String eredmeny;
    
    ButtonGroup[] pizzaBtG;
    JCheckBox[] chk;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        initKomp();
        try {
            tablaFeltoltes();
        } catch (FileNotFoundException ex) {          
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
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

        BtG_Vastagsag = new javax.swing.ButtonGroup();
        BtG_Alap = new javax.swing.ButtonGroup();
        BtG_Atmero = new javax.swing.ButtonGroup();
        BtG_Osszetevok = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Sp_PizzaSzam = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pn_Pizza = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Pn_Osszetevo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CbKosar = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Sp_PizzaSzam.setValue(1);

        jLabel6.setText("Pizzák száma:");

        javax.swing.GroupLayout Pn_PizzaLayout = new javax.swing.GroupLayout(Pn_Pizza);
        Pn_Pizza.setLayout(Pn_PizzaLayout);
        Pn_PizzaLayout.setHorizontalGroup(
            Pn_PizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        Pn_PizzaLayout.setVerticalGroup(
            Pn_PizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(Pn_Pizza);

        javax.swing.GroupLayout Pn_OsszetevoLayout = new javax.swing.GroupLayout(Pn_Osszetevo);
        Pn_Osszetevo.setLayout(Pn_OsszetevoLayout);
        Pn_OsszetevoLayout.setHorizontalGroup(
            Pn_OsszetevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );
        Pn_OsszetevoLayout.setVerticalGroup(
            Pn_OsszetevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(Pn_Osszetevo);

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

        jLabel9.setText("Kosár:");

        CbKosar.setMinimumSize(new java.awt.Dimension(132, 22));
        CbKosar.setPreferredSize(new java.awt.Dimension(172, 22));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CbKosar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbKosar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Hozzáadás a kosárhoz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Java with Ant");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sp_PizzaSzam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Sp_PizzaSzam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Megrendelés elküldése");
        jButton2.setMaximumSize(new java.awt.Dimension(169, 45));
        jButton2.setMinimumSize(new java.awt.Dimension(169, 45));
        jButton2.setPreferredSize(new java.awt.Dimension(169, 45));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        jCheckBox1.setText("jCheckBox1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jRadioButton1)
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void initKomp(){
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
    }
    
    private void tablaFeltoltes() throws FileNotFoundException{
        pizza = Rendeles.FileReadn("pizza.txt");
        osszetevok = Rendeles.FileReadn("osszetevok.txt");
        
        int pizzaHossz = 1;
        
        // Pizza változók
        GridLayout pizzaGL = new GridLayout(1, 1);
        pizzaBtG = new ButtonGroup[pizza.length+1];
        
        // Pizza algoritmus
        for (int i = 0; i < pizza.length; i++) {
            
            pizzaHossz += pizza[i].length;
            pizzaGL.setRows(pizzaHossz);
            Pn_Pizza.setLayout(pizzaGL);
            
            JLabel jl = new JLabel(pizza[i][0][0]+":");
            
            
            Pn_Pizza.add(jl);
            //System.out.println(pizza[i][0] +" "+i);
            pizzaBtG[i] = new ButtonGroup();
            for (int j = 1; j < pizza[i].length; j++) {
                JRadioButton jr = new JRadioButton(pizza[i][j][0]);
                pizzaBtG[i].add(jr);
                Pn_Pizza.add(jr);
            }
        }
        // Összetevő mezo hozzaad
        
            pizzaHossz += osszetevok.length;
            pizzaGL.setRows(pizzaHossz);
            Pn_Pizza.setLayout(pizzaGL);
            
            JLabel jl = new JLabel("Összetevők" +":");
            
            
            Pn_Pizza.add(jl);
            //System.out.println(pizza[i][0] +" "+i);
            pizzaBtG[pizza.length] = new ButtonGroup();
            for (int j = 0; j < osszetevok.length; j++) {
                JRadioButton jr = new JRadioButton(osszetevok[j][0][0]);
                jr.addItemListener(new java.awt.event.ItemListener() {
                    public void itemStateChanged(java.awt.event.ItemEvent evt) {
                        jChkItemStateChange(evt);
                    }
                });
                pizzaBtG[pizza.length].add(jr);
                // jr.setSelected(true);
                Pn_Pizza.add(jr);
            }
        
          // Összetevő választás[BÉTA]
          
            //getOssz(1);
        
        
        // Pizza Eredmény
        
        for (int i = 0; i < pizzaBtG.length; i++) {
            //getSelectedButtonText(pizzaBtG[i]);
            //System.out.println(pizzaBtG[i].getSelection());
        }
        
        // Összetevő eredmény
    }
    
    public void getOssz(int valaszt){
        
        int osszHossz = 1;
        Pn_Osszetevo.removeAll();
        chk = new JCheckBox[osszetevok[valaszt].length-1];
        GridLayout osszGL = new GridLayout(1, 2);
        
        osszHossz += osszetevok[valaszt].length;
        osszGL.setRows(osszHossz);
        Pn_Osszetevo.setLayout(osszGL);
            
        Pn_Osszetevo.add(new JLabel(osszetevok[valaszt][0][0]+":"));
        for (int j = 1; j < osszetevok[valaszt].length; j++) {
            chk[j-1] = new  JCheckBox(osszetevok[valaszt][j][0]);
            Pn_Osszetevo.add(chk[j-1]);
        }
        Pn_Osszetevo.updateUI();
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return "null";
    }
    
    private void jChkItemStateChange(java.awt.event.ItemEvent evt) {
        int valaszt = 0;
        //System.out.println(evt.getID());
        JRadioButton jch = (JRadioButton)evt.getSource();
        if (jch.isSelected()) {
            for (int i = 0; i < osszetevok.length; i++) {
                //System.out.println(osszetevok[i][0][0]);
                //System.out.println(jch.getText());
                if (osszetevok[i][0][0] == jch.getText()) {
                    valaszt=i;
                    break;
                }
            }
        }
        //System.out.println(valaszt);
       // jch.get
        getOssz(valaszt);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //JOptionPane.showMessageDialog(this, "1500 Ft");
        String karakterlanc = "";
        boolean nullCheck = false;
        for (int i = 0; i < pizzaBtG.length; i++) {
            if(getSelectedButtonText(pizzaBtG[i]) == "null") nullCheck = true;
            karakterlanc+= getSelectedButtonText(pizzaBtG[i])+", ";
        }
        karakterlanc += "\\\\";
        System.out.println(karakterlanc);
        for (int i = 0; i < chk.length; i++) {
            //System.out.println("Chk: " + i);
            //System.out.println(chk[i]);
            if(/*chk[i] != null &&*/ chk[i].isSelected()){
                karakterlanc += chk[i].getText()+", ";
            } 
        }
        if(!nullCheck ||  (Integer)Sp_PizzaSzam.getValue() < 0){
            CbKosar.addItem(karakterlanc);
            CbKosar.updateUI();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Jelöld ki az összes mezőt!");
        }
        System.out.println(karakterlanc);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ItemStateChanged
    
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtG_Alap;
    private javax.swing.ButtonGroup BtG_Atmero;
    private javax.swing.ButtonGroup BtG_Osszetevok;
    private javax.swing.ButtonGroup BtG_Vastagsag;
    private javax.swing.JComboBox<String> CbKosar;
    private javax.swing.JPanel Pn_Osszetevo;
    private javax.swing.JPanel Pn_Pizza;
    private javax.swing.JSpinner Sp_PizzaSzam;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
