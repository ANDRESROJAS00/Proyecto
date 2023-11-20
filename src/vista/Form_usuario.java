/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.RegistroUsuario;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author andre
 */
public class Form_usuario extends javax.swing.JFrame {

    /**
     * Creates new form Form_usuario
     */
    public Form_usuario() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxt_primernombre = new javax.swing.JTextField();
        jtxt_segundonombre = new javax.swing.JTextField();
        jtxt_apellidopaterno = new javax.swing.JTextField();
        jtxt_apellidomaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxt_npi = new javax.swing.JTextField();
        jbtn_ingresar = new javax.swing.JButton();
        jbtn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("USUARIO");

        jLabel2.setText("Primer Nombre:");

        jLabel3.setText("Segudo Nombre:");

        jLabel4.setText("Apellido Paterno:");

        jLabel5.setText("Apellido Materno:");

        jtxt_primernombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_primernombreActionPerformed(evt);
            }
        });

        jtxt_segundonombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_segundonombreActionPerformed(evt);
            }
        });

        jtxt_apellidopaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_apellidopaternoActionPerformed(evt);
            }
        });

        jtxt_apellidomaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_apellidomaternoActionPerformed(evt);
            }
        });

        jLabel6.setText("NPI:");

        jtxt_npi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_npiActionPerformed(evt);
            }
        });

        jbtn_ingresar.setText("Ingresar");
        jbtn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ingresarActionPerformed(evt);
            }
        });

        jbtn_salir.setText("Salir");
        jbtn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_primernombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_segundonombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_salir)
                                .addGap(43, 43, 43)
                                .addComponent(jbtn_ingresar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxt_npi)
                                .addComponent(jtxt_apellidopaterno)
                                .addComponent(jtxt_apellidomaterno)))))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_primernombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_segundonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_apellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxt_apellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxt_npi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_ingresar)
                    .addComponent(jbtn_salir))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_primernombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_primernombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_primernombreActionPerformed

    private void jtxt_segundonombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_segundonombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_segundonombreActionPerformed

    private void jtxt_apellidopaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_apellidopaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_apellidopaternoActionPerformed

    private void jtxt_apellidomaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_apellidomaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_apellidomaternoActionPerformed

    private void jtxt_npiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_npiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_npiActionPerformed

    private void jbtn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ingresarActionPerformed

        String primerNombre = jtxt_primernombre.getText();
        String segundoNombre = jtxt_segundonombre.getText();
        String apellidoPaterno = jtxt_apellidopaterno.getText();
        String apellidoMaterno = jtxt_apellidomaterno.getText();
        String npi = jtxt_npi.getText();

        // Crear un objeto Usuario con los datos ingresados
        Usuario usuario = new Usuario();
        usuario.setPnombre(primerNombre);
        usuario.setSnombre(segundoNombre);
        usuario.setAppaterno(apellidoPaterno);
        usuario.setApmaterno(apellidoMaterno);

        // Manejar la conversión de String a int para el NPI (asumiendo que el NPI es un número)
        try {
            usuario.setNpi(Integer.parseInt(npi));
        } catch (NumberFormatException e) {
            // Manejar la excepción si la conversión no es exitosa (por ejemplo, mostrar un mensaje al usuario)
            System.out.println("Error al convertir el NPI a un número");
            return;
        }

        RegistroUsuario ru = new RegistroUsuario();

        // Insertar el usuario en la base de datos
        if (ru.agregarUsuario(usuario)) {
            JOptionPane.showMessageDialog(null, "Usuario ingresado correctamente");
            // Puedes agregar aquí cualquier lógica adicional que desees después de insertar el usuario
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar el usuario");
        }
    }//GEN-LAST:event_jbtn_ingresarActionPerformed

    private void jbtn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Form_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtn_ingresar;
    private javax.swing.JButton jbtn_salir;
    private javax.swing.JTextField jtxt_apellidomaterno;
    private javax.swing.JTextField jtxt_apellidopaterno;
    private javax.swing.JTextField jtxt_npi;
    private javax.swing.JTextField jtxt_primernombre;
    private javax.swing.JTextField jtxt_segundonombre;
    // End of variables declaration//GEN-END:variables
}
