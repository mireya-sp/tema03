package com.mireyaserrano.tema03.bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique el número de intentos que quiere:");
        int intentos = Integer.parseInt(scanner.nextLine());

        System.out.println("Intenta adivinar el número aleatorio:");
        int num = Integer.parseInt(scanner.nextLine());
        intentos = intentos - 1;

        Random random = new Random();
        int intRandom = random.nextInt(1, 101);

        for (int i = 0; intentos > 0; intentos--){
            if (num == intRandom) {
                System.out.println("CORRECTO");
            } else if (num > intRandom) {
                System.out.println("Error, has intoducido un número mayor. Inténtalo de nuevo:");
                num = Integer.parseInt(scanner.nextLine());
            } else {
                System.out.println("Error, has intoducido un número menor. Inténtalo de nuevo:");
                num = Integer.parseInt(scanner.nextLine());
            }
        }
        if (num != intRandom){
            System.out.println("INTENTOS MALGASTADOR. El núero secreto era " + intRandom + ". Vuelve a intentarlos más tarde.");
        }
    }
}