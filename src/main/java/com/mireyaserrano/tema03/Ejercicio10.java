package com.mireyaserrano.tema03;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String args[]){
        int bi;
        String anio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un anio");
        int year = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if (year % 400 == 0){
            bi = 1;
        }else if(year % 4 == 0 && year % 100 != 0){
            bi = 1;
        }else {
            bi = 0;
        }
        anio = switch (bi){
            case 0 -> "no es bisiesto";
            case 1 -> "es bisiesto";
            default -> "Pepa";
        };
        System.out.println("El anio " + anio);
    }
}
