package com.mireyaserrano.tema03.anexo2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int h, m, s;
        boolean pepa = true;//me gusta llamar a mi variable auxiliar pepa, se que seria mejor llamrla valido.
        do {
            System.out.println("Introduzca las horas:");
            h = Integer.parseInt(scanner.nextLine());
            System.out.println("Introduzca los minutos:");
             m = Integer.parseInt(scanner.nextLine());
            System.out.println("Introduzca los segundos:");
            s = Integer.parseInt(scanner.nextLine());
            if (h < 24 && h > -1 && m < 61 && m > -1 && s < 61 && s > -1) {
                System.out.printf("Las horas, minutos y segundos en formato hh:mm:ss son -> %02d:%02d:%02d", h, m, s);
                pepa = true;
            }else {
                System.err.println("ERROR. Introduzca valores adecuados para horas, minutos y segundos.");
                pepa = false;
            }
        }while (!pepa);
    }
}
