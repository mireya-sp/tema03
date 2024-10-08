package com.mireyaserrano.tema03.bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        float total = 0, num, media;
        int cuenta = 0;

        do{
            System.out.println("Introduce un número: ");
            num = Float.parseFloat(scanner.nextLine());
            if (num >= 0) {
                cuenta += 1;
                total += num;
            }
        }while (num >= 0);
        media = total / cuenta;
        System.out.println("El resultado de la media hasta el número negativo es: " + media);
    }
}
