package JuegoAdivinarNumero;

public class player {

    private int number;

    public void guess(){
        number=(int)(Math.random()*10);
    }

    public int getNumber() {
        return number;
    }
}

