package com.mireyaserrano.tema03.anexo2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int cViento, cTemp, cLluvia, cUvi;
        int vViento, lluvia, uvi, d, mes, a, h, min, s;
        int dmax, correcto=0, bisiesto;
        String porcent = "%";

        //Ciudad
        System.out.println("Introduce el nombre de la ciudad");
        String ciudad = scanner.nextLine();
        System.out.println();

        //Fecha
        do{
            System.out.println("Introduce el día");
            d = Integer.parseInt(scanner.nextLine());
            System.out.println("Introduce el mes");
            mes = Integer.parseInt(scanner.nextLine());
            System.out.println("Introduce el año");
            a = Integer.parseInt(scanner.nextLine());

            if (a % 400 == 0){
                bisiesto = 1;
            }else if(a % 4 == 0 && a % 100 != 0){
                bisiesto = 1;
            }else {
                bisiesto = 0;
            }

            if (mes>0 && mes<13){
                dmax = switch (mes){
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 2 -> 28;
                    case 4, 6, 9, 11 -> 30;
                    default -> -1;
                };
                if (mes == 2 && bisiesto == 1){
                    dmax = 29;
                }
                if (d>0 && d<=dmax){
                    correcto = 1;
                }else{
                    System.err.println("ERROR, LOS DÍAS DEL MES " + mes + " DEBEN ESTAR COMPRENDIDIOS ENTRE 0 Y " + dmax);
                }
            }
        }while (correcto == 0);

        //Hora
        do {
            System.out.println("Introduce la hora");
            h = Integer.parseInt(scanner.nextLine());
            if (h<0 || h>23){
                System.err.println("LA HORA DEBE ESTAR ENTRE 0 Y 23. Prueba otra vez.");
            }
        }while (h<0  || h>23);
        do {
            System.out.println("Introdce los minutos");
            min = Integer.parseInt(scanner.nextLine());
            if (min<0 || min>=60){
                System.err.println("LOS MINUTOS DEBEN ESTAR ENTRE 0 Y 59. Prueba otra vez.");
            }
        }while (min<0 || min>=60);
        do {
            System.out.println("Introduce los segundos");
            s = Integer.parseInt(scanner.nextLine());
            if (s<0 || s>=60){
                System.err.println("LOS SEGUNDOS DEBEN ESTAR ENTRE 0 Y 59. Prueba otra vez.");
            }
        }while (s<0 || s>=60);

        //Velocidad del viento
        do {
            System.out.println("Introduce la velocidad del viento en km/h");
            vViento = Integer.parseInt(scanner.nextLine());
            if (vViento < 0){
                System.err.println("LA VELOCIDAD DEL VIENTO NO PUEDE SER INFERIOR A 0 KM/H. Prueba otra vez.");
            }
        }while (vViento < 0);

        //Temperatura
        System.out.println("Introduce la temperatura en celsius");
        float temp = Float.parseFloat(scanner.nextLine());

        //Presión atmosférica
        System.out.println("Introduce la presión atmosférica en hectoPascales");
        float pas = Float.parseFloat(scanner.nextLine());

        //Probabilidad de lluvia
        do {
            System.out.println("Introduce la probabilidad de lluvia con un número de 0 a 100");
            lluvia = Integer.parseInt(scanner.nextLine());
            if (lluvia<0){
                System.err.println("LA PROBABILIDAD DE LLUVIA NO PUEDE SER INFERIOR A 0 %. Prueba otra vez.");
            }
        }while(lluvia < 0);

        //índice ultravioleta
        do {
            System.out.println("Introduce el índice de radiación ultravioleta");
            uvi = Integer.parseInt(scanner.nextLine());
            if (uvi < 0){
                System.err.println("EL ÍNDICE ULTRAVIOLETA NO PUEDE SER INFERIOR A 0 %. Prueba otra vez.");
            }
        }while (uvi < 0);

        scanner.close();
        //25
        //Ciudad
        System.out.printf("Ciudad: %24s\n", ciudad);

        //Fecha
        System.out.printf("Fecha:                    %02d" + "/" + "%02d" + "/" + "%04d\n", d, mes, a);

        //Hora
        System.out.printf("Hora de la medida:        %02d:" + "%02d:" + "%02d\n", h, min, s);

        //velocidad viento
        if (vViento < 30){
            cViento = 32;
        }else if (vViento <= 60){
            cViento = 33;
        } else {
            cViento = 31;
        }
        System.out.printf("Velocidad viento: " + "\u001B[0;" + cViento + "m" + "%10d km/h\n" + "\u001B[0m", vViento);

        //temperatura
        if (temp < 22){
            cTemp = 36;
        } else if (temp <= 27) {
            cTemp = 32;
        } else if (temp <= 35) {
            cTemp = 33;
        }else {
            cTemp = 31;
        }
        System.out.printf("Temperatura: " + "\u001B[0;" + cTemp + "m" + "%18.2f Cº\n" + "\u001B[0m", temp);

        //Presión atmosférica
        System.out.printf("Presión atmosférica: %9.1f hPa\n", pas);

        //Probabilidad de lluvia
        if (lluvia < 35){
            cLluvia = 32;
        }else if (lluvia <= 70){
            cLluvia = 33;
        } else {
            cLluvia = 31;
        }
        System.out.printf("Probabilidad lluvia: " + "\u001B[0;" + cLluvia + "m" + "%7d %s\n" + "\u001B[0m", lluvia, porcent);

        //índice de radiación ultravioleta
        if (uvi <= 2){
            cUvi = 32;
        } else if (uvi <= 5) {
            cUvi = 36;
        } else if (uvi <= 7) {
            cUvi = 33;
        }else if (uvi <= 10){
            cUvi = 31;
        }else {
            cUvi = 35;
        }
        System.out.printf("UVI: " + "\u001B[0;" + cUvi + "m" + "%23d" + "\u001B[0m", uvi);

    }
}
