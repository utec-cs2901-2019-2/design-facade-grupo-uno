package com.company.facade.system;

public class Resta {
    private float a;
    private float b;

    public Resta(float a, float b){
        this.a=a;
        this.b=b;

    }

    public float exec(){
        return a-b;
    }

}
