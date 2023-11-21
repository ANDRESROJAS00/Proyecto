package controlador;

import bd.Conexion;
import java.util.ArrayList;
import java.util.List;
import modelo.Asignacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Inventario;
import modelo.Usuario;


/**
 *
 * @author andre
 */
public class RegistroTarjetaCustodia {
    
    
    
    // Método para obtener la lista de asignaciones
    public List<Asignacion> obtenerAsignaciones() {
        List<Asignacion> asignaciones = new ArrayList<>();

        try {
            // Obtener la conexión
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            // Consulta SQL para obtener la lista de asignaciones
            String query = "SELECT * FROM asignacion";
            PreparedStatement stmt = cnx.prepareStatement(query);

            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery();

            // Recorrer los resultados y mapear a objetos Asignacion
            while (rs.next()) {
                Asignacion asignacion = new Asignacion();
                asignacion.setId_asignacion(rs.getInt("id_asignacion"));
                asignacion.setId_inventario(rs.getInt("id_inventario"));
                asignacion.setId_usuario(rs.getInt("id_usuario"));
                asignacion.setFirma(rs.getString("firma"));

                asignaciones.add(asignacion);
            }

            // Cerrar recursos
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al obtener las asignaciones: " + e.getMessage());
        }

        return asignaciones;
    }

    // Método para obtener la información de un usuario por su ID
    public Usuario obtenerUsuario(int idUsuario) {
        Usuario usuario = null;

        try {
            // Obtener la conexión
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            // Consulta SQL para obtener la información del usuario por su ID
            String query = "SELECT * FROM usuario WHERE id_usuario = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idUsuario);

            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery();

            // Verificar si se encontró el usuario
            if (rs.next()) {
                // Mapear los resultados a un objeto Usuario
                usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNpi(rs.getInt("npi"));
                usuario.setPnombre(rs.getString("pnombre"));
                usuario.setSnombre(rs.getString("snombre"));
                usuario.setAppaterno(rs.getString("appaterno"));
                usuario.setApmaterno(rs.getString("apmaterno"));
            }

            // Cerrar recursos
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al obtener el usuario: " + e.getMessage());
        }

        return usuario;
    }

    // Método para obtener la información de un inventario por su ID
    public Inventario obtenerInventario(int idInventario) {
        Inventario inventario = null;

        try {
            // Obtener la conexión
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            // Consulta SQL para obtener la información del inventario por su ID
            String query = "SELECT * FROM inventario WHERE id_inventario = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idInventario);

            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery();

            // Verificar si se encontró el inventario
            if (rs.next()) {
                // Mapear los resultados a un objeto Inventario
                inventario = new Inventario();
                inventario.setId_inventario(rs.getInt("id_inventario"));
                inventario.setNumero_serie(rs.getInt("numero_serie"));
                inventario.setNus(rs.getInt("nus"));
                inventario.setUbicacion(rs.getString("ubicacion"));
                inventario.setDescripcion(rs.getString("descripcion"));
            }

            // Cerrar recursos
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error al obtener el inventario: " + e.getMessage());
        }

        return inventario;
    }
    
    
    
    
    
}
