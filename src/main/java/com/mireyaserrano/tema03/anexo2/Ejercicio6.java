package com.mireyaserrano.tema03.anexo2;

public class Ejercicio6 {
    public static void main(String args[]){
        String cadena = "";
        for (int i =1; i <= 9; i++){
            cadena = cadena + i;
            System.out.printf("%9s%s\n",cadena, cadena);
        }
    }
}
