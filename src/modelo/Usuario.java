package modelo;

/**
 *
 * @author andre
 */
public class Usuario {

    private int id_usuario, npi;
    private String pnombre, snombre, appaterno, apmaterno;

    public Usuario() {
    }

    public Usuario(int id_usuario, int npi, String pnombre, String snombre, String appaterno, String apmaterno) {
        this.id_usuario = id_usuario;
        this.npi = npi;
        this.pnombre = pnombre;
        this.snombre = snombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getNpi() {
        return npi;
    }

    public void setNpi(int npi) {
        this.npi = npi;
    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", npi=" + npi + ", pnombre=" + pnombre + ", snombre=" + snombre + ", appaterno=" + appaterno + ", apmaterno=" + apmaterno + '}';
    }

}
