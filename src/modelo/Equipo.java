package modelo;

/**
 *
 * @author andre
 */
public class Equipo {
    
    private int id_equipo, nus;
    private String descripcion;

    public Equipo() {
    }

    public Equipo(int id_equipo, int nus, String descripcion) {
        this.id_equipo = id_equipo;
        this.nus = nus;
        this.descripcion = descripcion;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getNus() {
        return nus;
    }

    public void setNus(int nus) {
        this.nus = nus;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id_equipo=" + id_equipo + ", nus=" + nus + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
}
