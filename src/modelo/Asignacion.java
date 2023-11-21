package modelo;

/**
 *
 * @author andre
 */
public class Asignacion {

    private int id_asignacion, id_inventario, id_usuario;
    private String firma;

    public Asignacion() {
    }

    public Asignacion(int id_asignacion, int id_inventario, int id_usuario, String firma) {
        this.id_asignacion = id_asignacion;
        this.id_inventario = id_inventario;
        this.id_usuario = id_usuario;
        this.firma = firma;
    }

    public int getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(int id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Asignacion{" + "id_asignacion=" + id_asignacion + ", id_inventario=" + id_inventario + ", id_usuario=" + id_usuario + ", firma=" + firma + '}';
    }

}
