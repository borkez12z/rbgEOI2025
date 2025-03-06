package game;
import java.util.Scanner;
public class Entorno {

    Bambi bambi;
    LoboFeroz loboFeroz;
    Conejo conejo;
    Hiena hiena;

    public Entorno() {
        bambi = new Bambi();
        loboFeroz = new LoboFeroz();
        conejo = new Conejo();
        hiena = new Hiena();
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese del jugador1: Bambi o Conejo: ");
        String jugador1 = scanner.nextLine();
        System.out.println("Ingrese del jugador2: Lobo o Hiena: ");
        String jugador2 = scanner.nextLine();

        int deselance= (int) (Math.random()*10+1);
        System.out.println(deselance);

        if(jugador1.equals("Bambi") && deselance<5) {
            bambi.escapar();
        }else if(jugador2.equals("Lobo") && deselance>5) {
            loboFeroz.atacar();
        }else if(jugador1.equals("Conejo") && deselance<5) {
            conejo.escapar();
        }else if(jugador2.equals("Hiena") && deselance>5) {
            hiena.atacar();
        }else {
            System.out.println("fallo");
       }
    }
}
