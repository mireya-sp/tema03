package com.mireyaserrano.tema03.bucles;

public class Ejercicio5 {
    public static void main(String args[]){
        int impares = 0;
        int pares = 0;
        int mult = 0;
        int paresSuma = 0;
        int imparesSuma = 0;
        int multiSuma = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i % 5 == 0){
                mult = mult + 1;
                multiSuma = multiSuma + i;
                if (i % 2 == 0){
                    System.out.println("->Es Par y multiplo de 5.");
                    pares = pares + 1;
                    paresSuma = paresSuma + i;
                }else{
                    System.out.println("->Es Impar, y multiplo de 5.");
                    impares = impares + 1;
                    imparesSuma = imparesSuma + i;
                }
            }else {
                if (i % 2 == 0){
                    System.out.println("->Es Par.");
                    pares = pares + 1;
                    paresSuma = paresSuma + i;
                }else{
                    System.out.println("->Es Impar.");
                    impares = impares + 1;
                    imparesSuma = imparesSuma + i;
                }
            }
        }
        System.out.println("Hay " + pares + " numeros pares.");
        System.out.println("La suma de los pares es: " + paresSuma);
        System.out.println("Hay " + impares + " numeros impares.");
        System.out.println("La suma de los impares es: " + imparesSuma);
        System.out.println("Hay " + mult + " numeros multiplos de 5.");
        System.out.println("La suma de los multiplos de 5 es: " + multiSuma);
    }
}
