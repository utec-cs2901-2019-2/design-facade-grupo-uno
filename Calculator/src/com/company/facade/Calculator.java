package com.company.facade;

import com.company.facade.system.Dividir;
import com.company.facade.system.Multiplicar;
import com.company.facade.system.Resta;
import com.company.facade.system.Suma;

public class Calculator {

public    float a;
public    float b;

public    Suma suma;
public    Resta resta;
    public    Dividir dividir;
    public Multiplicar multiplicar;

    public Calculator(float a, float b) {
        this.a = a;
        this.b = b;
        this.suma = new Suma(a,b);
        this.resta = new Resta(a,b);
        this.dividir = new Dividir(a,b);
        this.multiplicar = new Multiplicar(a,b);
    }


}
