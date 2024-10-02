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
                case 0, 1, 2, 3, 4-> System.out.println("INSUFICIENTE");


                case 5->System.out.println("SUFICIENTE");

                case 6->System.out.println("BIEN");

                case 7, 8->System.out.println("NOTABLE");


                case 9, 10->System.out.println("SOBRESALIENTE");


            }
        }else{
            System.out.println("ERROR");
        }
    }
}