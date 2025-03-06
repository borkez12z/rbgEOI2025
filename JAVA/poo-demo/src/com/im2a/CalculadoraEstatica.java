package com.im2a;

public class CalculadoraEstatica {

    private static int numero1;
    private static int numero2;

    public static int suma(){
        return numero1 + numero2;
    }

    public static int resta(){
        return numero1 - numero2;
    }

    public static int getNumero1() {
        return numero1;
    }

    public static void setNumero1(int numero1) {
        numero1 = numero1;
    }

    public static int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        numero2 = numero2;
    }
}
