package com.mireyaserrano.tema03.bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número y le digo si es primo o no");
        int num = Integer.parseInt(scanner.nextLine());
        float total = 0;
        int primo = 0, nprimo = 0;
        scanner.close();

        for (int i = 2; i < num; i++){
            total = (float)num / i;
            /*total = total;*/
            if (total == (int)total){
                nprimo = nprimo + 1;
            }else {
                primo = primo + 1;
            }
        }
        if (primo > nprimo){
            System.out.println("El número " + num + " es primo");
        }else {
            System.out.println("El número " + num + " no es primo");
        }
    }
}
