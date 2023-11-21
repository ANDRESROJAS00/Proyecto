package vista;

import controlador.RegistroAsignacion;
import controlador.RegistroTarjetaCustodia;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Asignacion;
import modelo.Inventario;
import modelo.Usuario;



/**
 *
 * @author andre
 */
public class Form_TarjetaCustodia extends javax.swing.JFrame {
    
    RegistroAsignacion re = new RegistroAsignacion();
    
    /**
     * Creates new form TarjetaCustodia
     */
    public Form_TarjetaCustodia() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_tarjetacustodia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbtn_listar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jtbl_tarjetacustodia.setBackground(new java.awt.Color(51, 51, 255));
        jtbl_tarjetacustodia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Ubicacion"
            }
        ));
        jScrollPane1.setViewportView(jtbl_tarjetacustodia);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TARJETA DE CUSTODIA");

        jbtn_listar.setText("Listar");
        jbtn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_listarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(132, 132, 132)
                .addComponent(jbtn_listar)
                .addGap(263, 263, 263))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_listar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_listarActionPerformed
        
        // Declarar variables para almacenar la información necesaria
    String nombreUsuario, descripcionInventario, ubicacionInventario;

    // Crear una instancia del RegistroTarjetaCustodia
    RegistroTarjetaCustodia rtc = new RegistroTarjetaCustodia();

    // Obtener la lista de asignaciones desde el RegistroTarjetaCustodia
    List<Asignacion> asignaciones = rtc.obtenerAsignaciones();

    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) this.jtbl_tarjetacustodia.getModel();

    // Limpiar las filas existentes en la tabla
    modelo.setRowCount(0);

    // Iterar sobre la lista de asignaciones
    for (Asignacion asignacion : asignaciones) {
        // Obtener información necesaria
        int idUsuario = asignacion.getId_usuario();
        int idInventario = asignacion.getId_inventario();

        // Obtener el nombre del usuario
        Usuario usuario = rtc.obtenerUsuario(idUsuario);
        nombreUsuario = usuario.getPnombre() + " " + usuario.getAppaterno();

        // Obtener la descripción y ubicación del inventario
        Inventario inventario = rtc.obtenerInventario(idInventario);
        descripcionInventario = inventario.getDescripcion();
        ubicacionInventario = inventario.getUbicacion();

        // Agregar una fila con la información a la tabla
        modelo.addRow(new Object[]{nombreUsuario, descripcionInventario, ubicacionInventario});
    }
        
        
    
    }//GEN-LAST:event_jbtn_listarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    

    
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
            java.util.logging.Logger.getLogger(Form_TarjetaCustodia.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_TarjetaCustodia.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_TarjetaCustodia.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_TarjetaCustodia.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_TarjetaCustodia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_listar;
    private javax.swing.JTable jtbl_tarjetacustodia;
    // End of variables declaration//GEN-END:variables
}
