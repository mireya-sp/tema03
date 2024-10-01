package com.mireyaserrano.tema03;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        float num1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Introduzca otro número");
        float num2 = Float.parseFloat(scanner.nextLine());
        scanner.close();

        if (num1>num2){
            System.out.println(num1 + " es mayor que " + num2);
        }else{
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
}
