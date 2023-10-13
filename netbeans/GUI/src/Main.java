
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author sdariza
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    String columnNames[] = {"Primer Apellido", "Primer Nombre", "Edad"};
    String Data[][] = new String[100][columnNames.length];
    int numUsers = 0;

    public void populateTable() {
        String TempData[][] = new String[numUsers][columnNames.length];
        for (int i = 0; i < numUsers; i++) {
            for (int j = 0; j < columnNames.length; j++) {
                TempData[i][j] = Data[i][j];
            }
        }
        DefaultTableModel model = new DefaultTableModel(TempData, columnNames);
        jTableM.setModel(model);
    }

    public Main() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBg = new javax.swing.JPanel();
        jPanelMatrix = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableM = new javax.swing.JTable();
        jPanelInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButtonAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBg.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableM.setBackground(new java.awt.Color(204, 204, 204));
        jTableM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableM);

        javax.swing.GroupLayout jPanelMatrixLayout = new javax.swing.GroupLayout(jPanelMatrix);
        jPanelMatrix.setLayout(jPanelMatrixLayout);
        jPanelMatrixLayout.setHorizontalGroup(
            jPanelMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMatrixLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelMatrixLayout.setVerticalGroup(
            jPanelMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        jPanelBg.add(jPanelMatrix, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 530));

        jPanelInput.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Usuarios");

        jTextFieldLName.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldLName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldLName.setText("Escriba el primer apellido");
        jTextFieldLName.setBorder(null);
        jTextFieldLName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldLNameMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Primer Apellido");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Primer Nombre");

        jTextFieldFName.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldFName.setText("Escriba el primer nombre");
        jTextFieldFName.setBorder(null);
        jTextFieldFName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldFNameMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Edad");

        jTextFieldAge.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldAge.setText("Escriba la edad");
        jTextFieldAge.setBorder(null);
        jTextFieldAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldAgeMousePressed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jButtonAdd.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAdd.setText("Añadir");
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAddMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInputLayout = new javax.swing.GroupLayout(jPanelInput);
        jPanelInput.setLayout(jPanelInputLayout);
        jPanelInputLayout.setHorizontalGroup(
            jPanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInputLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldLName, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInputLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(70, 70, 70))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInputLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldFName, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInputLayout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addGap(138, 138, 138))))
        );
        jPanelInputLayout.setVerticalGroup(
            jPanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAdd)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jPanelBg.add(jPanelInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 360, 530));

        getContentPane().add(jPanelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMousePressed

        String fName = jTextFieldFName.getText();
        String lName = jTextFieldLName.getText();
        String age = jTextFieldAge.getText();

        //validations...
        Data[numUsers][0] = lName;
        Data[numUsers][1] = fName;
        Data[numUsers][2] = age;
        numUsers++;
        populateTable();

    }//GEN-LAST:event_jButtonAddMousePressed

    private void jTextFieldLNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldLNameMousePressed
        jTextFieldLName.setText("");
        jTextFieldLName.setForeground(Color.black);
    }//GEN-LAST:event_jTextFieldLNameMousePressed

    private void jTextFieldFNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldFNameMousePressed
        jTextFieldFName.setText("");
        jTextFieldFName.setForeground(Color.black);

    }//GEN-LAST:event_jTextFieldFNameMousePressed

    private void jTextFieldAgeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAgeMousePressed
        jTextFieldAge.setText("");
        jTextFieldAge.setForeground(Color.black);

    }//GEN-LAST:event_jTextFieldAgeMousePressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelBg;
    private javax.swing.JPanel jPanelInput;
    private javax.swing.JPanel jPanelMatrix;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableM;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldFName;
    private javax.swing.JTextField jTextFieldLName;
    // End of variables declaration//GEN-END:variables
}