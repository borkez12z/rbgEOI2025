package ejercicioInterfaz7;

public class TestPlayable {
    public static void main(String[] args) {
        Football football=new Football();
        Basketball basketball=new Basketball();
        Volleyball volleyball=new Volleyball();

        Playable[] playables={football,basketball,volleyball};
        for(Playable playable:playables ){
            playable.play();
        }
    }
}
