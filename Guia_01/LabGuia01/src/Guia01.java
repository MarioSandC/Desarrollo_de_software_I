/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
/**
 *
 * @author Humbertho
 */
public class Guia01 extends javax.swing.JFrame {
    String resultado = " ";
    String m1 = "seleccione la materia 1";
    String m2 = "seleccione la materia 2";
    String m3 = "seleccione la materia 3";
    String m4 = "seleccione la materia 4";
    String m5 = "seleccione la materia 5";
    String ciclo = "seleccione el ciclo ";
    String carrera = "seleccione la carrera ";
    String est1 = "aprobado";
    String est2 = "desaprobado";
    int cum;
    int res;
    /**
     * Creates new form Guia01
     */
    public Guia01() {
        initComponents();
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
        lbnombre = new javax.swing.JLabel();
        lbcarrera = new javax.swing.JLabel();
        lbciclo = new javax.swing.JLabel();
        lbcum = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfCum = new javax.swing.JTextField();
        cbCarrera = new javax.swing.JComboBox<>();
        cbCiclo = new javax.swing.JComboBox<>();
        lbmateria = new javax.swing.JLabel();
        cbMateria1 = new javax.swing.JComboBox<>();
        cbMateria2 = new javax.swing.JComboBox<>();
        cbMateria3 = new javax.swing.JComboBox<>();
        cbMateria4 = new javax.swing.JComboBox<>();
        cbMateria5 = new javax.swing.JComboBox<>();
        cbUV1 = new javax.swing.JComboBox<>();
        cbUV2 = new javax.swing.JComboBox<>();
        cbUV3 = new javax.swing.JComboBox<>();
        cbUV4 = new javax.swing.JComboBox<>();
        cbUV5 = new javax.swing.JComboBox<>();
        lbUV = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfMat1 = new javax.swing.JTextField();
        tfMat2 = new javax.swing.JTextField();
        tfMat3 = new javax.swing.JTextField();
        tfMat4 = new javax.swing.JTextField();
        tfMat5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lbEstado1 = new javax.swing.JLabel();
        lbEstado2 = new javax.swing.JLabel();
        lbEstado3 = new javax.swing.JLabel();
        lbEstado4 = new javax.swing.JLabel();
        lbEstado5 = new javax.swing.JLabel();
        lbMOSTRAR = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control de notas");

        lbnombre.setText("Nombre:");

        lbcarrera.setText("Carrera");

        lbciclo.setText("Ciclo");

        lbcum.setText("CUM");

        cbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Ing. Sistemas" }));

        cbCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "01", "02" }));

        lbmateria.setText("Materia");

        cbMateria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la materia", "Base de datos" }));

        cbMateria2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la materia", "Desarrollo de software" }));

        cbMateria3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la materia", "Electronica" }));

        cbMateria4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la materia", "Legislacion aplicada" }));

        cbMateria5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la materia", "Investigacion de operaciones" }));

        cbUV1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "4", "5" }));

        cbUV2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "4", "5" }));

        cbUV3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "4", "5" }));

        cbUV4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "4", "5" }));

        cbUV5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "4", "5" }));

        lbUV.setText("UV");

        jLabel8.setText("Nota");

        jLabel9.setText("Estado");

        lbEstado1.setText(".");

        lbEstado2.setText(".");

        lbEstado3.setText(".");

        lbEstado4.setText(".");

        lbEstado5.setText(".");

        lbMOSTRAR.setText("jLabel2");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lbnombre)
                .addGap(161, 161, 161)
                .addComponent(lbcarrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbciclo)
                .addGap(178, 178, 178)
                .addComponent(lbcum)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(lbmateria)
                        .addGap(141, 141, 141)
                        .addComponent(lbUV)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(67, 67, 67)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbUV2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbUV1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbUV3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbUV4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbUV5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(cbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel9)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMat2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMat3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMat4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMat5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbEstado2, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                                    .addComponent(lbEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEstado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbEstado5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfMat1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbEstado1)
                                .addGap(15, 15, 15))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfCum)
                        .addGap(15, 15, 15)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnCalcular)
                        .addGap(203, 203, 203)
                        .addComponent(lbMOSTRAR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnombre)
                    .addComponent(lbcarrera)
                    .addComponent(lbciclo)
                    .addComponent(lbcum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbmateria)
                    .addComponent(lbUV)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado2)
                    .addComponent(cbUV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUV3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUV4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUV5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbMOSTRAR)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        String CicloActual ="";
        String Carrera="";
        String Mat1 ="";
        String Mat2 ="";
        String Mat3 ="";
        String Mat4 ="";
        String Mat5 ="";
        
        String carreraSeleccionada = (String)this.cbCarrera.getSelectedItem();
        String cicloSeleccionado = (String)this.cbCiclo.getSelectedItem();
        String mat1 = (String)this.cbMateria1.getSelectedItem();
        String mat2 = (String)this.cbMateria2.getSelectedItem();
        String mat3 = (String)this.cbMateria3.getSelectedItem();
        String mat4 = (String)this.cbMateria4.getSelectedItem();
        String mat5 = (String)this.cbMateria5.getSelectedItem();
        
        ///validacion carrera
        if("Seleccione una opción".equals(carreraSeleccionada)){
            Carrera = "-1";
            lbMOSTRAR.setText(carrera);
        }
        ///validacion ciclo
        if("Seleccione una opción".equals(cicloSeleccionado)){
            CicloActual = "-1";
            lbMOSTRAR.setText(ciclo); 
        } 
       ///MATERIAS 
        if("Seleccione la materia".equals(mat1)){
            Mat1 = "-1";
            lbMOSTRAR.setText(m1); 
        }
        if("Seleccione la materia".equals(mat2)){
            Mat2 = "-1";
            lbMOSTRAR.setText(m2);
        }
         if("Seleccione la materia".equals(mat3)){
            Mat3 = "-1";
            lbMOSTRAR.setText(m3); 
        }
        if("Seleccione la materia".equals(mat4)){
            Mat4 = "-1";
            lbMOSTRAR.setText(m4);
        }
        if("Seleccione la materia".equals(mat5)){
            Mat5 = "-1";
            lbMOSTRAR.setText(m5);
        }
        ///SELECCIONAR UNIDADES VALORATIVAS
        int uv1 = (int)this.cbUV1.getSelectedItem();
        int uv2 = (int)this.cbUV2.getSelectedItem();
        int uv3 = (int)this.cbUV3.getSelectedItem();
        int uv4 = (int)this.cbUV4.getSelectedItem();
        int uv5 = (int)this.cbUV5.getSelectedItem();
        
        ///CALCULAR CUM
        int nota1 = Integer.parseInt(tfMat1.getText());
        int nota2 = Integer.parseInt(tfMat2.getText());
        int nota3 = Integer.parseInt(tfMat3.getText());
        int nota4 = Integer.parseInt(tfMat4.getText());
        int nota5 = Integer.parseInt(tfMat5.getText());
        
        cum = ((nota1*uv1)+(nota2*uv2)+(nota3+uv3)+(nota4+uv4)+(nota5*uv5));
        res = (cum/5);
        
        ///MOSTRAR CUM
        tfCum.setText(String.valueOf(res));
        ///MOSTRAR RESULTADO
        lbMOSTRAR.setText(this.tfNombre.getText());
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Guia01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guia01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guia01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guia01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cbCarrera;
    private javax.swing.JComboBox<String> cbCiclo;
    private javax.swing.JComboBox<String> cbMateria1;
    private javax.swing.JComboBox<String> cbMateria2;
    private javax.swing.JComboBox<String> cbMateria3;
    private javax.swing.JComboBox<String> cbMateria4;
    private javax.swing.JComboBox<String> cbMateria5;
    private javax.swing.JComboBox<String> cbUV1;
    private javax.swing.JComboBox<String> cbUV2;
    private javax.swing.JComboBox<String> cbUV3;
    private javax.swing.JComboBox<String> cbUV4;
    private javax.swing.JComboBox<String> cbUV5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbEstado1;
    private javax.swing.JLabel lbEstado2;
    private javax.swing.JLabel lbEstado3;
    private javax.swing.JLabel lbEstado4;
    private javax.swing.JLabel lbEstado5;
    private javax.swing.JLabel lbMOSTRAR;
    private javax.swing.JLabel lbUV;
    private javax.swing.JLabel lbcarrera;
    private javax.swing.JLabel lbciclo;
    private javax.swing.JLabel lbcum;
    private javax.swing.JLabel lbmateria;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JTextField tfCum;
    private javax.swing.JTextField tfMat1;
    private javax.swing.JTextField tfMat2;
    private javax.swing.JTextField tfMat3;
    private javax.swing.JTextField tfMat4;
    private javax.swing.JTextField tfMat5;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
