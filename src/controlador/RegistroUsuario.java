package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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

    public boolean eliminarUsuario(int npi) {
        boolean flag = false;

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM usuario WHERE npi = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, npi);

            int resp = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar?", "Eliminar Usuario", JOptionPane.YES_NO_OPTION);

            if (resp == JOptionPane.YES_OPTION) {
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

    public boolean actualizarUsuario(String idUsuario, String nuevoNombre) {

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE usuario SET nombre = ? WHERE id_usuario = ?";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, nuevoNombre);
            stmt.setString(2, idUsuario);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL actualizar, " + e.getMessage());
            return false;
        }

    }

    public Usuario buscarPorNombre(String nombre) {

        Usuario usuario = new Usuario();

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM usuario WHERE nombre = ?";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, nombre);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNpi(rs.getInt("npi"));
                usuario.setPnombre(rs.getString("pnombre"));
                usuario.setSnombre(rs.getString("snombre"));
                usuario.setAppaterno(rs.getString("appaterno"));
                usuario.setApmaterno(rs.getString("apmaterno"));
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL buscar por nombre, " + e.getMessage());

        }
        return usuario;

    }

    public List<Usuario> buscarTodos() {

        List<Usuario> lista = new ArrayList<>();

        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM usuario";
            PreparedStatement stmt = cnx.prepareCall(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNpi(rs.getInt("npi"));
                usuario.setPnombre(rs.getString("pnombre"));
                usuario.setSnombre(rs.getString("snombre"));
                usuario.setAppaterno(rs.getString("appaterno"));
                usuario.setApmaterno(rs.getString("apmaterno"));

                lista.add(usuario);
            }

            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL consultar todos los datos, " + e.getMessage());

        }
        return lista;
    }

    

    

}
