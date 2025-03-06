package Listas;
//Dadas las notas de un alumno, quiero que me digáis cual es la nota media de dicho alumno

import java.util.ArrayList;
import java.util.List;

public class ListasArray {
    public static void main(String[] args) {
        // Crear una lista de tipo String
        List<String> clientes = new ArrayList<>();
        List<String> idClientes = new ArrayList<>();
        List<Double> base = new ArrayList<>();

        clientes.add("Alex");
        idClientes.add("1_0001");
        base.add(500.25);

        clientes.add("Bob");
        idClientes.add("1_0002");
        base.add(600.60);

        clientes.add("Carlos");
        idClientes.add("2_0003");
        base.add(1100.0);

        for (int i = 0; i < clientes.size(); i++) {
            if(idClientes.get(i).startsWith("1")){
                base.set(i,base.get(i)-100);
            }else{
                base.set(i,base.get(i)-200);
            }
        }
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("El cliente: " + clientes.get(i) + "paga: " + base.get(i));
        }
    }
}
