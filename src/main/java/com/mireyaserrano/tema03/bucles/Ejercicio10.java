package com.mireyaserrano.tema03.bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        float num = Float.parseFloat(scanner.nextLine());
        float total = 0;
        do {
            total = total + num;
            System.out.println("Introduce otro número: ");
            num = Float.parseFloat(scanner.nextLine());
        }while (num != 0);
        System.out.println("El resultado de la suma de los números hasta el 0 es: " + total);
    }
}
