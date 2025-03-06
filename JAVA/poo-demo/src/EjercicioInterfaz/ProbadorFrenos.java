package EjercicioInterfaz;

import java.sql.SQLOutput;

public class ProbadorFrenos {
    public static void main(String[] args) {

        Coche ford = new Coche();
        Bicicleta bmx = new Bicicleta();
        Bicicleta orbea= new Bicicleta();
        Coche ferrari = new Coche();

//        Frenable[] frenas = new Frenable[] {ford, bmx, orbea,ferrari};
//
//        for (Frenable f : frenas) {
//            f.frenar();
//        }

        ford.soltarFreno();
        bmx.frenar();
        bmx.subirMarcha();
        orbea.frenar();
        ferrari.soltarFreno();
    }
}
