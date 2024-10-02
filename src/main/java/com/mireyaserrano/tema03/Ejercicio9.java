package com.mireyaserrano.tema03;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int tipo = -1;
        String triangulo;
        System.out.println("Introduce la medida de un lado de un lado del triangulo");
        float lado1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Introduce la medida de otro lado del triangulo");
        float lado2 = Float.parseFloat(scanner.nextLine());
        System.out.println("Introduce la medida de el ultimo lado del triangulo");
        float lado3 = Float.parseFloat(scanner.nextLine());
        scanner.close();

        if (lado1 == lado2 && lado2 == lado3){
            tipo = 1;
        }
        if ( (lado1 == lado2 && lado2 != lado3) || (lado1 != lado2 && lado2 == lado3) || (lado1 != lado2 && lado1 == lado3) ){
            tipo = 2;
        }
        if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3 ){
            tipo = 3;
        }
        triangulo = switch (tipo){
            case 1 -> "Equilatero";
            case 2 -> "Isosceles";
            case 3 -> "Escaleno";
            default -> "Pepa";
        };
        System.out.println("El triangulo es " + triangulo );
    }
}
