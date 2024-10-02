package com.mireyaserrano.tema03;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = Integer.parseInt(scanner.nextLine());
        int cuotaInicial;
        float descuento, cuotaFinal;

        cuotaInicial = 500;
        if (edad > 65){
            descuento = cuotaInicial * 50 / 100;
            cuotaFinal = cuotaInicial - descuento;
        }
        if (edad<18){
            System.out.println("Padres socios? (0=no, 1=si)");
            int socios = Integer.parseInt(scanner.nextLine());
            if (socios == 0){
                descuento = cuotaInicial * 25 / 100;
                cuotaFinal = cuotaInicial - descuento;
            }else{
                descuento = cuotaInicial * 35 / 100;
                cuotaFinal = cuotaInicial - descuento;
            }
        }else{
            cuotaFinal = cuotaInicial;
        }
        System.out.println("La cuota ha pagar es de: " + cuotaFinal + " euros.");
    }
}
