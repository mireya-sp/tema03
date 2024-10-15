package com.mireyaserrano.tema03.anexo2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número real");
        double num = Double.parseDouble(scanner.nextLine());
        scanner.close();

        System.out.printf("El númereo en formato dos decimal es = %1.2f %n", num);
    }
}
