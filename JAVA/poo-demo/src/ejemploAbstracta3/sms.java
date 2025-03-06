package ejemploAbstracta3;

public class sms extends Mensaje{


    public sms(String receptor, String emisor, String mensaje) {
        super(receptor, emisor, mensaje);
    }

    @Override
    void enviarMensaje() {
        System.out.println("Enviando sms de:"+ Emisor + "a" + Receptor + "Mensaje: " + mensaje);
    }
}
