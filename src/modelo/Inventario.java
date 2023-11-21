package modelo;

/**
 *
 * @author andre
 */
public class Inventario {

    private int id_inventario, numero_serie, nus;
    private String ubicacion, descripcion;

    public Inventario() {
    }

    public Inventario(int id_inventario, int numero_serie, int nus, String ubicacion, String descripcion) {
        this.id_inventario = id_inventario;
        this.numero_serie = numero_serie;
        this.nus = nus;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public int getNus() {
        return nus;
    }

    public void setNus(int nus) {
        this.nus = nus;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Inventario{" + "id_inventario=" + id_inventario + ", numero_serie=" + numero_serie + ", nus=" + nus + ", ubicacion=" + ubicacion + ", descripcion=" + descripcion + '}';
    }

}
