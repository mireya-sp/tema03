package com.mireyaserrano.tema03;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero en el que ha caido el dado: ");
        int num = Integer.parseInt(scanner.nextLine());
        int caraOpuesta = -1;
        scanner.close();

        if(num<1 || num>6){
            System.err.println("ERROR: Numero incorrecto");
            System.exit(-1);
        }
        caraOpuesta = switch (num){
            case 1 -> 6;
            case 2 -> 5;
            case 3 -> 4;
            case 4 -> 3;
            case 5 -> 2;
            case 6 -> 1;
            default -> -1;
        };
        System.out.println("La cara opuesta de " + num + " es " + caraOpuesta);

    }
}
