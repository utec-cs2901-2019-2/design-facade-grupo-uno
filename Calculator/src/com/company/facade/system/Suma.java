package com.company.facade.system;

public class Suma {
    private float a;
    private float b;

    public Suma(float a, float b){
        this.a = a;
        this.b = b;
    }

    public float exec(){
        return a+b;
    }
}
