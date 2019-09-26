package com.company.facade.system;

public class Dividir {

    private float dividiendo;
    private float divisor;

    public Dividir(float dividiendo,float divisor){
        this.dividiendo=dividiendo;
        this.divisor=divisor;
    }

    public float exec(){
        return dividiendo/divisor;
    }
}
