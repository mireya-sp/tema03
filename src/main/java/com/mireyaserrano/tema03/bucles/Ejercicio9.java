package com.mireyaserrano.tema03.bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número y le digo si es primo o no");
        int num = Integer.parseInt(scanner.nextLine());
        scanner.close();

        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                System.out.println("El número " + num + " no es primo");
            }else {
                System.out.println("El número " + num + " es primo");
            }
        }
    }
}
