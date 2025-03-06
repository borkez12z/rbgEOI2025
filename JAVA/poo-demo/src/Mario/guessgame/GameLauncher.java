package com.lm2a.guessgame;

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame(new Player(), new Player(), new Player());
        guessGame.startGame();
    }
}
