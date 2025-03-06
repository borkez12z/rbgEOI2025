package Mario.game;

public class Entorno {
    Presa presa;
    Depredador depredador;

    public Entorno(Depredador depredador, Presa presa) {
        this.depredador = depredador;
        this.presa = presa;
    }

    public void jugar(){
        presa.pasear();
        depredador.acechar();
        presa.pasear();
        depredador.acechar();
        presa.pasear();
        depredador.acechar();
        presa.comer();
        depredador.atacar();
        int desenlace = (int)(Math.random()*10+1);

        if(desenlace > 5){
            presa.escapar();
        }else{
            depredador.comer();
        }
    }
}
