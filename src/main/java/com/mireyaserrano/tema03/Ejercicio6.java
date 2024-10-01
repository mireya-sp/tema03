package com.mireyaserrano.tema03;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un valor real:");
        float valor = Float.parseFloat(scanner.nextLine());
        scanner.close();

        int moneda2, moneda1, moneda50, moneda20, moneda10, moneda5, moneda02, moneda01;
        float resto;
        moneda2 = (int) (valor / 2);
        resto = valor % 2;

        moneda1 = (int) (resto / 1);
        resto = resto % 1;

        resto = resto * 100;

        moneda50 = (int) resto / 50;
        resto = resto % 50;

        moneda20 = (int) resto / 20;
        resto = resto % 20;

        moneda10 = (int) resto / 10;
        resto = resto % 10;

        moneda5 = (int) resto / 5;
        resto = resto % 5;

        moneda02 = (int) resto / 2;
        resto = resto % 2;

        moneda01 = (int) resto / 1;

        System.out.print("Hay " + moneda2 + " monedas de dos euros, " + moneda1 + " monedas de un euro, " + moneda50 + " monedas de 50 centimos, " + moneda20 + "monedas de 20 centimos, " + moneda10 + " monedas de diez centimos, " + moneda5 + " monedas de cinco centimos, " + moneda02 + " monedas de dos centimos, " + moneda01 + " monedas de un centimo." );
    }
}
