package com.lm2a.herencia;

public class ClaseHija extends SuperClase {
    public float u;
    public double v;

//    public ClaseHija(String x, int y) {
//        super(x, y);
//    }
//
//    public ClaseHija(String x, int y, float u, double v) {
//        super(x, y);
//        this.u = u;
//        this.v = v;
//    }

    public void m3(){
        System.out.println("m3 haciendo algo");
    };

    public void m4(){
        System.out.println("m4 haciendo algo");
    };

    @Override
    public void m1() {
        System.out.println("m1 REDEFINIDO haciendo algo");
    }
}
