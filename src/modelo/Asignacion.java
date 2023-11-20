
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author andre
 */
public class Asignacion {
    
    private int id_asignacion;
    private Date fecha_asignacion;
    private String firma;

    public Asignacion(String firma) {
        this.firma = firma;
        this.fecha_asignacion = new Date();
    }

    public Asignacion(int id_asignacion, Date fecha_asignacion, String firma) {
        this.id_asignacion = id_asignacion;
        this.fecha_asignacion = fecha_asignacion;
        this.firma = firma;
    }

    public int getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(int id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public Date getFecha_asignacion() {
        return fecha_asignacion;
    }

    public void setFecha_asignacion(Date fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
    
    
    
    public String obtenerFechaFormateada(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return sdf.format(fecha_asignacion);
    }
    
    
    
    

    @Override
    public String toString() {
        return "Asignacion{" + "id_asignacion=" + id_asignacion + ", fecha_asignacion=" + fecha_asignacion + ", firma=" + firma + '}';
    }
    
    
    
    
    
}
