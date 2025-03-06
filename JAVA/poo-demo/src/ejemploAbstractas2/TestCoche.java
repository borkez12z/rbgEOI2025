package ejemploAbstractas2;

public class TestCoche {
    public static void main(String[] args) {

        Deportivo Porsche911=new Deportivo("Porsche 911","Plata",250);
        Electrico EV4=new Electrico("EV4","Platinum",230);
        Familiar SeatLeon= new Familiar("Seat Leon","Azul",180);

        System.out.print(Porsche911.Model+" "+ Porsche911.Color+" "+Porsche911.getMaxSpeed()+" ");
        Porsche911.acelerar();
        System.out.print(EV4.Model+" "+ EV4.Color+" "+EV4.getMaxSpeed()+" ");
        EV4.frenar();
        System.out.print(SeatLeon.Model+" "+ SeatLeon.Color+" "+SeatLeon.getMaxSpeed()+" ");
        SeatLeon.acelerar();
    }
}