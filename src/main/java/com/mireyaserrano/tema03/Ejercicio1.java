package com.mireyaserrano.tema03;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int num = Integer.parseInt(scanner.nextLine());
        scanner.close();

        if (num % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
}
