package com.mireyaserrano.tema03.bucles;

import java.util.Random;

public class Ejercicio13 {
    public static void main(String args[]){
        Random random = new Random();
        float cara = 0;
        float cruz = 0;
        float totalCaras, totalCruces;
        int tiros = 1000000;
        for (int i = 1; i <= tiros; i++){
            int intRandom = random.nextInt(1, 3);
            if (intRandom == 1){
                cara += 1;
            }else {
                cruz += 1;
            }
        }
        totalCaras = cara * 100 / tiros;
        System.out.println("Han salido un " + totalCaras + "% de caras.");
        totalCruces = cruz * 100 / tiros;
        System.out.println("Han salido un " + totalCruces + "% de cruces.");
    }
}