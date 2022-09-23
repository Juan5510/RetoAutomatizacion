package model;

public class InfoRegistroProductStore {

    private String strNombre;
    private String strPassword;

    public InfoRegistroProductStore(String strNombre, String strPassword) {
        this.strNombre = strNombre;
        this.strPassword = strPassword;
    }

    public String getStrNombre() {
        return strNombre;
    }



    public String getStrContrasena() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
}
}
