package JuegoAdivinarNumero;

public class GuessGame {
    player p1;
    player p2;
    player p3;

    public GuessGame(player p1, player p2, player p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void startGame(){

        int guess1;
        int guess2;
        int guess3;

        int numberToGuess= (int)(Math.random()*10);

        p1.guess();
        guess1=p1.getNumber();
        p2.guess();
        guess2=p2.getNumber();
        p3.guess();
        guess3=p3.getNumber();

        if(guess1==numberToGuess){
            System.out.println("Jugador 1 acertó el numero: "+guess1);
        }else if (guess2==numberToGuess){
            System.out.println("Jugador 1 acertó el numero: "+guess2);
        }else if(guess3==numberToGuess){
            System.out.println("Jugador 1 acertó el numero: "+guess3);
        }else{
            System.out.println("Ningun jugador acerto el numero");
        }

    }
}
