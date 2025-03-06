package ejemploAbstracta3;

public class email extends Mensaje{


    public email(String receptor, String emisor, String mensaje) {
        super(receptor, emisor, mensaje);
    }

    @Override
    void enviarMensaje() {
        System.out.println("Enviando email de: "+ Emisor + " a " + Receptor + " Mensaje: " + mensaje);
    }
}
