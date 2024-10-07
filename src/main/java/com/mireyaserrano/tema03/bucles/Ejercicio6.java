package com.mireyaserrano.tema03.bucles;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduzca un número para imprimir su tabla de multiplicar: ");
        int total = 0;
        boolean valido;
        int num;
        do{
            System.out.println("Indique un número del 1 al 10: ");
            num = Integer.parseInt(scanner.nextLine());
            valido = num >= 1 && num <= 10;
            if (valido == false) {
                System.err.println("Errror, el número introducido no es válido, pruebe de nuevo");
            }
        }while (valido == false);
        scanner.close();
        for (int i = 1; i <= 10; i++){
            total = i * num;
            System.out.println(num + " X " + i + " = " + total);
        }
    }
}
