package com.im2a;

public class Calculadora {

    private int numero1;
    private int numero2;

    public static void main(String[] args) {
        Calculadora calculadora= new Calculadora();

        calculadora.setNumero1(5);
        calculadora.setNumero1(6);

        System.out.print("Resultado: "+ calculadora.suma());

    }

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora() {
    }

    public int suma(){
        return numero1 + numero2;
    }

    public int resta(){
        return numero1 - numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
