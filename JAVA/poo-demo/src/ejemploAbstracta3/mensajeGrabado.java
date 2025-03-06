package ejemploAbstracta3;

public class mensajeGrabado extends Mensaje {


    public mensajeGrabado(String receptor, String emisor, String mensaje) {
        super(receptor, emisor, mensaje);
    }

    @Override
    void enviarMensaje() {
        System.out.println("Enviando mensaje gradabo de: "+ Emisor + "a" + Receptor + "Mensaje: " + mensaje);
    }
}
