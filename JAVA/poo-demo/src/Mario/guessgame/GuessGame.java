package com.lm2a.guessgame;

public class GuessGame {

    private Player p1;
    private Player p2;
    private Player p3;

    public GuessGame(Player p1, Player p2, Player p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void startGame(){
        int guess1;
        int guess2;
        int guess3;

        int numberToGuess = (int) (Math.random() * 10);

        p1.guess();
        guess1 = p1.getNumber();

        p2.guess();
        guess2 = p2.getNumber();

        p3.guess();
        guess3 = p3.getNumber();

        if(guess1==numberToGuess){
            System.out.println("Player1 guessed the number:"+"p1 = "+guess1);
        }else if(guess2==numberToGuess){
            System.out.println("Player2 guessed the number:"+"p2 = "+guess2);
        }else if(guess3==numberToGuess){
            System.out.println("Player3 guessed the number:"+"p3 = "+guess3);
        }else{
            System.out.println("Nobody guessed the number");
        }


    }
}
