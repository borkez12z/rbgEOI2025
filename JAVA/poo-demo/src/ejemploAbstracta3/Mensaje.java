package ejemploAbstracta3;

public abstract class Mensaje {

    String Receptor;
    String Emisor;
    String mensaje;

    public Mensaje(String receptor, String emisor, String mensaje) {
        Receptor = receptor;
        Emisor = emisor;
        this.mensaje = mensaje;
    }

    public String getReceptor() {
        return Receptor;
    }

    public String getEmisor() {
        return Emisor;
    }

    public String getMensaje() {
        return mensaje;
    }

    abstract void enviarMensaje();
}
