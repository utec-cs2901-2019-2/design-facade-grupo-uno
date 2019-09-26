package com.company.facade.system;

public class Multiplicar {
    private float a;
    private float b;

    public Multiplicar(float a, float b){
        this.a = a;
        this.b = b;
    }

    public int exec(){
        return a*b;
    }
}
