package com.mireyaserrano.tema03.bucles;

public class Ejercicio4 {
    public static void main(String args[]){
        int impares = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                impares = impares + 1;
            }
        }
        System.out.println("Hay " + impares + " numeros impares");
    }
}
