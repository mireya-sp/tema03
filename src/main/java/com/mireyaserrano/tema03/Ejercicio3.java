package com.mireyaserrano.tema03;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su edad:");
        int edad = Integer.parseInt(scanner.nextLine());
        scanner.close();

        if (edad<18){
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Eres mayor de edad");
        }
    }
}
