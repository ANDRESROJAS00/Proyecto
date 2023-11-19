
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author andre
 */
public class RegistroUsuario {
    
    
    public boolean agregarUsuario(Usuario usuario) {
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO usuario(pnombre, snombre, appaterno, apmaterno, npi) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, usuario.getPnombre());
            stmt.setString(2, usuario.getSnombre());
            stmt.setString(3, usuario.getAppaterno());
            stmt.setString(4, usuario.getApmaterno());
            stmt.setInt(5, usuario.getNpi());
            

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL agregar, " + e.getMessage());
            return false;
        }

    }
    
    
    public boolean eliminarUsuario(int idUsuario) {

        boolean flag = false;
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM usuario WHERE id_usuario = ?";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setInt(1, idUsuario);

            int resp = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar?", "Eliminar Usuario", 1);
            if (resp == 0) {
                stmt.executeUpdate();
                stmt.close();
                cnx.close();
                flag = true;
            }

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL eliminar, " + e.getMessage());
            flag = false;
        }
        return flag;

    }
    
    
    public boolean actualizarCarrera(String nombre, String nombreNew) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE carrera SET nombre = ? WHERE nombre = ?";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, nombreNew);
            stmt.setString(2, nombre);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL actualizar, " + e.getMessage());
            return false;
        }

    }
    
}
