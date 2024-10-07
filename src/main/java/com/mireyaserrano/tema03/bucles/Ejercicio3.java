package com.mireyaserrano.tema03.bucles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce el segundo número");
        int num2 = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int signoA, signoB;
        scanner.close();

        signoA = num < 0 ? -1 : 1;
        num *= signoA;
        signoB = num2 < 0 ? -1 : 1;
        num2 *= signoB;
        for (int i = 1; i <= num2; i++){
            total = total + num;
        }
        total = total * signoA * signoB;
        System.out.println(total);
    }
}
