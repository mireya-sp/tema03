package com.mireyaserrano.tema03;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una nota:");
        int nota = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if (nota>=0 && nota<11){
            switch (nota){
                case 0: case 1: case 2: case 3: case 4:
                    System.out.println("INSUFICIENTE");
                    break;

                case 5:
                    System.out.println("SUFICIENTE");
                    break;

                case 6:
                    System.out.println("BIEN");
                    break;

                case 7: case 8:
                    System.out.println("NOTABLE");
                    break;


                case 9: case 10:
                    System.out.println("SOBRESALIENTE");


            }
        }else{
            System.out.println("ERROR");
        }
    }
}
