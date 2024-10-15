package com.mireyaserrano.tema03.anexo2;

public class Ejercicio5 {
    public static void main(String args[]){
        String cadena = "";
        int color = 29;
        for (int i =1; i <= 9; i++){
            cadena = cadena + i;
            color += 1;
            if (i == 9){
                color = 30;
                System.out.printf("\u001B[0;" + color + "m" + "%9s\n" + "\u001B[0m", cadena);
            }else {
                System.out.printf("\u001B[0;" + color + "m" + "%9s\n" + "\u001B[0m", cadena);
            }
        }
    }
}
