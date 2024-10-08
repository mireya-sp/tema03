package com.mireyaserrano.tema03.bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        float total = 1;
        System.out.println("Introduzca la base: ");
        float numa = Float.parseFloat(scanner.nextLine());
        System.out.println("Introduzca el exponente entero: ");
        int numb = Integer.parseInt(scanner.nextLine());
        scanner.close();

        if (numb < 0) {
            numb = numb * (-1);
            for (int i = 1; i <= numb; i++){
                total = (1 / numa) * total;
            }
        }else if (numb > 0){
            for (int i = 1; i <= numb; i++) {
                total = total * numa;
            }
        } else if (numb == 0) {
            total = 1;
        }
        System.out.println("El resultado de la operación es: " + total);
    }
}
