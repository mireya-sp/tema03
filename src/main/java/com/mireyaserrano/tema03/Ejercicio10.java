package com.mireyaserrano.tema03;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String args[]){
        String anio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un anio");
        int year = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if (year % 400 == 0){
            System.out.println("El anio " + year + " es bisiesto.");
        }else if(year % 4 == 0 && year % 100 != 0){
            System.out.println("El anio " + year + " es bisiesto.");
        }else {
            System.out.println("El anio " + year + " no es bisiesto.");
        }
    }
}
