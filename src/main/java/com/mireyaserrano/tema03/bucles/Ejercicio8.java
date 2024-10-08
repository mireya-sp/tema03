package com.mireyaserrano.tema03.bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número y le devuelve el factorial: ");
        int num = Integer.parseInt(scanner.nextLine());
        int total = 1;
        scanner.close();

        for (int i = 1; i <= num; i++){
            total = total * i;
        }
        System.out.print("El factorial de " + num + " es " + total);
    }
}
