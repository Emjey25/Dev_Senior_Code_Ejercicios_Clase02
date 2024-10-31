package Ejercicios;

import java.util.Scanner;

/*Ejercicio 10: Media Aritmética
Crea un programa que calcule la media aritmética de tres números introducidos por el usuario. */

public class MediaAritemtica10 {
    public static void main(String[] args) {
        System.out.println("**** Calculando la media Aritmetica **** \n");

        var scanner = new Scanner(System.in);

        //Ingreso de datos
        System.out.print("Digita el primero numero: ");
        var number1 = scanner.nextDouble();
        System.out.print("Digita el segundo numero: ");
        var number2 = scanner.nextDouble();
        System.out.print("Digita el tercer numero: ");
        var number3 = scanner.nextDouble();

        //Hallando la media
        var suma = number1 + number2 + number3;
        var mediaAritmetica = suma / 3;

        //Impresion por consola
        System.out.println("La media aritmetica de los tres es: " + mediaAritmetica);

        scanner.close();

    }
    
}
