/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager;

/**
 *
 * @author JiaLenovo
 */
public class TaskAdder extends javax.swing.JFrame {

    /**
     * Creates new form TaskAdder
     */
    String list;

    public String getList() {
        return list;
    }

    public TaskAdder() {
        initComponents();
        list = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTaskLists = new javax.swing.JPanel();
        pnlListItems = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSelectedList = new javax.swing.JTextField();
        pnlListButtons = new javax.swing.JPanel();
        btnAddEditList = new javax.swing.JButton();
        btnDeleteList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTableNames = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Your Lists | Task Manager");
        setPreferredSize(new java.awt.Dimension(566, 370));

        pnlTaskLists.setAutoscrolls(true);
        pnlTaskLists.setMinimumSize(new java.awt.Dimension(546, 296));
        pnlTaskLists.setPreferredSize(new java.awt.Dimension(546, 350));
        pnlTaskLists.setLayout(new java.awt.GridLayout(3, 1, 5, 8));

        pnlListItems.setLayout(new java.awt.GridLayout(1, 2, 5, 0));

        jLabel1.setText("Selected Task List");
        jLabel1.setToolTipText("");
        pnlListItems.add(jLabel1);

        txtSelectedList.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSelectedList.setToolTipText("The currently selected list that will be edited.");
        pnlListItems.add(txtSelectedList);

        pnlTaskLists.add(pnlListItems);

        pnlListButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnAddEditList.setText("Add/Edit List");
        btnAddEditList.setToolTipText("Add or Edit the List");
        btnAddEditList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEditListActionPerformed(evt);
            }
        });
        pnlListButtons.add(btnAddEditList);

        btnDeleteList.setText("Delete List");
        btnDeleteList.setToolTipText("Delete the list! Warning! No undo!");
        btnDeleteList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteListActionPerformed(evt);
            }
        });
        pnlListButtons.add(btnDeleteList);

        pnlTaskLists.add(pnlListButtons);

        txtTableNames.setColumns(20);
        txtTableNames.setRows(5);
        txtTableNames.setToolTipText("The master list of all of your task lists.");
        txtTableNames.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtTableNames);

        pnlTaskLists.add(jScrollPane1);

        getContentPane().add(pnlTaskLists, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEditListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEditListActionPerformed
        list = txtSelectedList.getText();
        this.dispose();
    }//GEN-LAST:event_btnAddEditListActionPerformed

    private void btnDeleteListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteListActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskAdder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TaskAdder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEditList;
    private javax.swing.JButton btnDeleteList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlListButtons;
    private javax.swing.JPanel pnlListItems;
    private javax.swing.JPanel pnlTaskLists;
    public javax.swing.JTextField txtSelectedList;
    public javax.swing.JTextArea txtTableNames;
    // End of variables declaration//GEN-END:variables
}
