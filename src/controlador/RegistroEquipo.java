/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Inventario;

/**
 *
 * @author andre
 */
public class RegistroEquipo {
    
    
    
     public boolean agregarEquipo(Inventario inventario) {
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO inventario(numero_serie, nus, ubicacion, descripcion) VALUES (?,?,?,?)";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setInt(1, inventario.getNumero_serie());
            stmt.setInt(2, inventario.getNus());
            stmt.setString(3, inventario.getUbicacion());
            stmt.setString(4, inventario.getDescripcion());
            

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL agregar, " + e.getMessage());
            return false;
        }

    }
    
}
