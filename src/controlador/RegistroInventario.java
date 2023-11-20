
package controlador;

import bd.Conexion;
import java.util.ArrayList;
import java.util.List;
import modelo.Equipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author andre
 */
public class RegistroInventario {
    
    
    public class RegistroEquipo{
        
        public List<Equipo> obtenerEquiposDisponibles(){
            List<Equipo> listaEquipos = new ArrayList<>();
            
            try {
                Conexion con = new Conexion();
                Connection cnx = con.obtenerConexion();
                
                String query = "SELECT * FROM equipo WHERE id_equipo NOT IN (SELECT equipo_id FROM asignacion) ";
                PreparedStatement stmt = cnx.prepareCall(query);
                
                ResultSet rs = stmt.executeQuery();
                
                while (rs.next()){
                    Equipo equipo = new Equipo();
                    equipo.setId_equipo(rs.getInt("id_equipo"));
                    equipo.setNus(rs.getInt("nus"));
                    equipo.setDescripcion(rs.getString("descripcion"));
                    
                    listaEquipos.add(equipo);
                    
                    rs.close();
                    stmt.close();
                    cnx.close();
                }
            } catch (SQLException e) {
                System.out.println("Error en la consulta SQL al obtener equipos disponibles: " + e.getMessage());
            }
            return listaEquipos;
        }
        
    }
    
}
