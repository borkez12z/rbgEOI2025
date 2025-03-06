package ejercicioModelizacionPOO;

public class Main {
    public static void main(String[] args) {

        Apartestudios apartestudios= new Apartestudios(1,10,"Vivaldi",4,1,350000);
        CasaRural casaRural=new CasaRural(2,30,"SADDSAD",4,2,2,150,20);
        ApartamentoFamiliar apartamentoFamiliar=new ApartamentoFamiliar(3,20,"dsaodasda",4,2,321123);
        LocalComercial localComercial= new LocalComercial(4,30,"dfadsds","fdsfsd","dfsdf");
        Oficina oficina= new Oficina(5,12,"dfdsfsd","dsadsa",true);

        System.out.println(apartestudios.idinmueble + " Area: " + apartestudios.area + " Numero Habitaciones: " + apartestudios.numHabitaciones+ " Valor Compra: " + apartestudios.valorcompra());

    }
}
