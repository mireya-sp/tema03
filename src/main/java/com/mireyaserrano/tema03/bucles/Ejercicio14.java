package com.mireyaserrano.tema03.bucles;

import java.util.Random;

public class Ejercicio14 {
    public static void main(String args[]) {
        Random random = new Random();
        int elUno=0, elDos=0, elTres=0, elCuatro=0, elCinco=0, elSeis=0;
        int tiros = 1000000;
        for (int i = 1; i <= tiros; i++) {
            int aleatorio = random.nextInt(1, 7);
            switch (aleatorio) {
                case 1 -> elUno += 1;
                case 2 -> elDos += 1;
                case 3 -> elTres += 1;
                case 4 -> elCuatro += 1;
                case 5 -> elCinco += 1;
                case 6 -> elSeis += 1;
                default -> System.out.println("Tete, te ha' equivocao'");
            }
        }
        System.out.println("El 1 ha salido " + elUno + " veces, y representa el " + ((float)elUno * 100 / tiros) + "% del total.");
        System.out.println("El 2 ha salido " + elDos + " veces, y representa el " + ((float)elDos * 100 / tiros) + "% del total.");
        System.out.println("El 3 ha salido " + elTres + " veces, y representa el " + ((float)elTres * 100 / tiros) + "% del total.");
        System.out.println("El 4 ha salido " + elCuatro + " veces, y representa el " + ((float)elCuatro * 100 / tiros) + "% del total.");
        System.out.println("El 5 ha salido " + elCinco + " veces, y representa el " + ((float)elCinco * 100 / tiros) + "% del total.");
        System.out.println("El 6 ha salido " + elSeis + " veces, y representa el " + ((float)elSeis * 100 / tiros) + "% del total.");
    }
}
