package com.mireyaserrano.tema03;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = Integer.parseInt(scanner.nextLine());
        int cuota_inicial;
        float descuento, cuota_final;

        cuota_inicial = 500;
        if (edad > 65){
            descuento = cuota_inicial * 50 / 100;
            cuota_final = cuota_inicial - descuento;
        }
        if (edad<18){
            System.out.println("Padres socios? (0=no, 1=si)");
            int socios = Integer.parseInt(scanner.nextLine());
            if (socios == 0){
                descuento = cuota_inicial * 25 / 100;
                cuota_final = cuota_inicial - descuento;
            }else{
                descuento = cuota_inicial * 35 / 100;
                cuota_final = cuota_inicial - descuento;
            }
        }else{
            cuota_final = cuota_inicial;
        }
        System.out.println("La cuota ha pagar es de: " + cuota_final + " euros.");
    }
}
