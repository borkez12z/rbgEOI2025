package Composicion.Ejercicio1;

public class Biblioteca {
    public static void main(String[] args) {
        Autor autor1= new Autor("Pepe","mdsamdsam@sdasa.com", 'H');
        Libros libro1= new Libros("Prueba",autor1,20);
        System.out.println(libro1);

    }
}
