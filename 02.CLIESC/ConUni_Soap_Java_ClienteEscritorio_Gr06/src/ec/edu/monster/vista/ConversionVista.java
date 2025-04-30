package ec.edu.monster.vista;

import ec.edu.monster.controlador.ConversionUnidadesControlador;
import javax.swing.JOptionPane;

public class ConversionVista extends javax.swing.JFrame {

    public ConversionVista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCentimetros = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPulgadas = new javax.swing.JTextField();
        btnCMtoIn = new javax.swing.JButton();
        btnINtoCM = new javax.swing.JButton();
        btnLimpiarCM = new javax.swing.JButton();
        btnLimpiarIN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("CONVERSIÓN DE UNIDADES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Centímetros a Pulgadas:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Pulgadas a Centímetros:");

        jLabel4.setText("Ingrese unidades en centímetros:");

        txtCentimetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCentimetrosActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingrese unidades en pulgadas:");

        btnCMtoIn.setBackground(new java.awt.Color(204, 204, 255));
        btnCMtoIn.setText("Convertir");
        btnCMtoIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCMtoInActionPerformed(evt);
            }
        });

        btnINtoCM.setBackground(new java.awt.Color(204, 204, 255));
        btnINtoCM.setText("Converitr");
        btnINtoCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINtoCMActionPerformed(evt);
            }
        });

        btnLimpiarCM.setBackground(new java.awt.Color(204, 204, 255));
        btnLimpiarCM.setText("Limpiar");
        btnLimpiarCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCMActionPerformed(evt);
            }
        });

        btnLimpiarIN.setBackground(new java.awt.Color(204, 204, 255));
        btnLimpiarIN.setText("Limpiar");
        btnLimpiarIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarINActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/monster/imagenes/monster3.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCMtoIn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiarCM, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCentimetros, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnINtoCM, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiarIN, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel3)))
                .addGap(192, 192, 192))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCentimetros, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCMtoIn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnLimpiarCM, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnINtoCM, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiarIN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCMtoInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCMtoInActionPerformed
        // Datos
        String input = txtCentimetros.getText().trim();

        //Aceptar solo números decimales con punto o coma
        if (input.matches("[+-]?\\d*[.,]?\\d+")) {
            double cm = Double.parseDouble(input.replace(",", ".")); // Reemplaza coma por punto para parsear

            ConversionUnidadesControlador control = new ConversionUnidadesControlador();
            double conversion = control.centimetrosAPulgadas(cm);

            String repo = "La conversión es: " + conversion + " pulgadas";
            JOptionPane.showMessageDialog(rootPane, repo);
            txtCentimetros.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese un número decimal válido.");
        }
    }//GEN-LAST:event_btnCMtoInActionPerformed

    private void btnINtoCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINtoCMActionPerformed
        // Datos
        String input = txtPulgadas.getText().trim();

        //Aceptar solo números decimales con punto o coma
        if (input.matches("[+-]?\\d*[.,]?\\d+")) {
            double in = Double.parseDouble(input.replace(",", ".")); // Reemplaza coma por punto para parsear

            ConversionUnidadesControlador control = new ConversionUnidadesControlador();
            double conversion2 = control.pulgadasACentimetros(in);

            String repo = "La conversión es: " + conversion2 + " cm";
            JOptionPane.showMessageDialog(rootPane, repo);
            txtPulgadas.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese un número decimal válido.");
        }
    }//GEN-LAST:event_btnINtoCMActionPerformed

    private void btnLimpiarCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCMActionPerformed
        txtCentimetros.setText("");
    }//GEN-LAST:event_btnLimpiarCMActionPerformed

    private void btnLimpiarINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarINActionPerformed
        txtPulgadas.setText("");
    }//GEN-LAST:event_btnLimpiarINActionPerformed

    private void txtCentimetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCentimetrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCentimetrosActionPerformed


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
            java.util.logging.Logger.getLogger(ConversionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversionVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCMtoIn;
    private javax.swing.JButton btnINtoCM;
    private javax.swing.JButton btnLimpiarCM;
    private javax.swing.JButton btnLimpiarIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCentimetros;
    private javax.swing.JTextField txtPulgadas;
    // End of variables declaration//GEN-END:variables
}
