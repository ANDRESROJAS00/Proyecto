package modelo;

/**
 *
 * @author andre
 */
public class Inventario {
    
    private int id_inventario, numero_serie;
    private String ubicacion;

    public Inventario() {
    }

    public Inventario(int id_inventario, int numero_serie, String ubicacion) {
        this.id_inventario = id_inventario;
        this.numero_serie = numero_serie;
        this.ubicacion = ubicacion;
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Inventario{" + "id_inventario=" + id_inventario + ", numero_serie=" + numero_serie + ", ubicacion=" + ubicacion + '}';
    }
    
    
    
    
}
