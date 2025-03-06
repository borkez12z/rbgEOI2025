package game2;

public class Entorno {

    Presa presa;
    Depredador depredador;

    public Entorno(int presa, int depredador) {
        switch (presa) {
            case 1:
                this.presa = new Conejo();
                break;
            case 2:
                this.presa = new Bambi();
                break;
        }
        switch (depredador) {
            case 1:
                this.depredador = new Lobo();
                break;
            case 2:
                this.depredador = new Hiena();
                break;
        }
    }
    public void jugar(){
        presa.pasear();
        depredador.acechar();
        presa.pasear();
        depredador.acechar();

        int desenlace =(int) (Math.random()*10-1);

        if (desenlace >5){
            depredador.atacar();
        }else{
            presa.escapar();
        }
    }
}
