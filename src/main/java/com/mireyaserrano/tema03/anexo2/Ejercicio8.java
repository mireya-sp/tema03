package com.mireyaserrano.tema03.anexo2;

public class Ejercicio8 {
    public static void main(String args[]){
        int colorl = 30;
        int colorf = 40;
        int intensidad = 0;
        String cadena;
        for (int k = 1; k <= 2; k++){
            for (int j = 1; j <= 8; j++) {
                colorf = 40;
                for (int i = 1; i <= 8; i++) {
                    cadena = intensidad + ";" + colorl + ";" + colorf;
                    System.out.printf("\u001B[" + intensidad + ";" + colorl + ";" + colorf + "m" + " %s " + "\u001B[0m", cadena);
                    colorf += 1;
                }
                System.out.println();
                colorl += 1;
            }
            colorl = 30;
            intensidad += 1;
        }
    }
}
