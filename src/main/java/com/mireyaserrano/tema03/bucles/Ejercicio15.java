package com.mireyaserrano.tema03.bucles;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        int h = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce los minutos: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce los segundos: ");
        int s = Integer.parseInt(scanner.nextLine());
        int aux1, aux2, aux3;
        scanner.close();

        if (h <= 23 && h >= 0){
            aux1 = 0;
        }else {
            aux1 = 1;
        }
        if (m <= 60 && m >= 0){
            aux2 = 0;
        }else {
            aux2 = 1;
        }
        if (s <= 60 && s >= 0){
            aux3 = 0;
        }else {
            aux3 = 1;
        }
        if (aux1 == 0 && aux2 == 0 && aux3 == 0){
            System.out.println("La hora " + h + ":" + m + "," + s + " es válida.");
        } else if (aux1 == 0 && aux2 == 0 && aux3 == 1) {
            System.out.println("La hora " + h + ":" + m + "," + s + " no es válida porque los segundos no están en el formao correcto.");
        } else if (aux1 == 0 && aux2 == 1 && aux3 == 0) {
            System.out.println("La hora " + h + ":" + m + "," + s + " no es válida porque los minutos no están en el formao correcto.");
        } else if (aux1 == 0 && aux2 == 1 && aux3 == 1) {
            System.out.println("La hora " + h + ":" + m + "," + s + " no es válida porque tanto los minutos como los segundos no están en el formato correcto.");
        } else if (aux1 == 1 && aux2 == 0 && aux3 == 0) {
            System.out.println("La hora " + h + ":" + m + "," + s + " no es válida porque la hora no está en el formato correcto.");
        } else if (aux1 == 1 && aux2 == 0 && aux3 == 1) {
            System.out.println("La hora " + h + ":" + m + "," + s + " no es válida porque tanto la hora como los segundos no están en el formato correcto.");
        } else if (aux1 == 1 && aux2 == 1 && aux3 == 0) {
            System.out.println("La hora " + h + ":" + m + "," + s + " no es válida porque tanto la hora como los minutos no están en el formato correcto.");
        } else {
            System.out.println("La hora " + h + ":" + m + "," + s + " no es válida porque tanto la hora como los minutos y los segundos no están en el formato correcto.");
        }
    }
}
