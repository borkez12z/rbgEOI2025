package com.lm2a.guessgame;

public class Player {

    private int number;

    public void guess(){
        number = (int) (Math.random() * 10);
    }

    public int getNumber() {
        return number;
    }

}
