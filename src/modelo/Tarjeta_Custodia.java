
package modelo;

/**
 *
 * @author andre
 */
public class Tarjeta_Custodia {
    
    private int id_tarjeta_custodia;

    public Tarjeta_Custodia() {
    }

    public Tarjeta_Custodia(int id_tarjeta_custodia) {
        this.id_tarjeta_custodia = id_tarjeta_custodia;
    }

    public int getId_tarjeta_custodia() {
        return id_tarjeta_custodia;
    }

    public void setId_tarjeta_custodia(int id_tarjeta_custodia) {
        this.id_tarjeta_custodia = id_tarjeta_custodia;
    }

    @Override
    public String toString() {
        return "Tarjeta_Custodia{" + "id_tarjeta_custodia=" + id_tarjeta_custodia + '}';
    }
    
    
    
}
