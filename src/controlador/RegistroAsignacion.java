package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Asignacion;

/**
 *
 * @author andre
 */
public class RegistroAsignacion {

    public boolean asignarEquipo(Asignacion asignacion) {

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO asignacion(firma, id_inventario, id_usuario) VALUES (?,?,?)";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, asignacion.getFirma());
            stmt.setInt(2, asignacion.getId_inventario());
            stmt.setInt(3, asignacion.getId_usuario());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();;
            return true;

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL asignar equipo: " + e.getMessage());
            return false;
        }
    }

}
