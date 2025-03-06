package com.im2a;

public class CalculadoraTest {
    public static void main(String[] args) {

        CalculadoraEstatica.setNumero1(5);
        CalculadoraEstatica.setNumero1(6);

        System.out.print("Resultado: "+ CalculadoraEstatica.suma());

    }
}
