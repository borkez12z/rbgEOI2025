package JuegoAdivinarNumero;

public class GameLauncher {
    public static void main(String[] args) {

        GuessGame guessGame=new GuessGame(new player(), new player(),new player());
        guessGame.startGame();

    }
}
