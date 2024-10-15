package com.mireyaserrano.tema03.anexo2;

public class Ejercicio7 {
    public static void main(String args[]){
        String cadena = "";
        String cadena2 = "";
        for (int i =1; i <= 9; i++){
            cadena = cadena + i;
            for (int j = 1; j <= 1; j++){
                cadena2 = i + cadena2;
            }
            System.out.printf("%9s%s\n", cadena, cadena2);
        }
    }
}
