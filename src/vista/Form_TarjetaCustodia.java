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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_tarjetacustodia = new javax.swing.JTable();
        jbtn_listar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtbl_tarjetacustodia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Equipo", "Ubicacion"
            }
        ));
        jScrollPane1.setViewportView(jtbl_tarjetacustodia);

        jbtn_listar.setText("Listar");
        jbtn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_listarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jbtn_listar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_listar)
                .addGap(0, 15, Short.MAX_VALUE))
        );

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_listar;
    private javax.swing.JTable jtbl_tarjetacustodia;
    // End of variables declaration//GEN-END:variables
}
