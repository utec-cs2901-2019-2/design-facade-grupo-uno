package com.company;

import com.company.facade.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calculator;
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        while(exit != 5) {
            System.out.println("Ingresa la operación que desear usar :" +
                    "\n 1 . Suma" +
                    "\n 2 . Resta" +
                    "\n 3 . Divide" +
                    "\n 4 . Multiplica" +
                    "\n 5. Exit");
            exit = scanner.nextInt();
            if( exit == 1) {
                System.out.println("Ingresa 2 numeros : ");
                float a = scanner.nextFloat();
                float b = scanner.nextFloat();
                calculator = new Calculator(a, b);

                System.out.println("Respuesta "+calculator.suma.exec());
            }
            if( exit == 2) {
                System.out.println("Ingresa 2 numeros : ");
                float a = scanner.nextFloat();
                float b = scanner.nextFloat();
                calculator = new Calculator(a, b);
                System.out.println("Respuesta "+calculator.resta.exec());
            }
            if( exit == 3) {
                System.out.println("Ingresa 2 numeros : ");
                float a = scanner.nextFloat();
                float b = scanner.nextFloat();
                calculator = new Calculator(a, b);
                System.out.println("Respuesta "+calculator.dividir.exec());
            }
            if( exit == 4) {
                System.out.println("Ingresa 2 numeros : ");
                float a = scanner.nextFloat();
                float b = scanner.nextFloat();
                calculator = new Calculator(a, b);
                System.out.println("Respuesta "+calculator.multiplicar.exec());
            }
        }
    }
}
