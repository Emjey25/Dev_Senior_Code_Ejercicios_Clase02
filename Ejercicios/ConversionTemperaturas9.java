package Ejercicios;

import java.util.Scanner;

/*Ejercicio 9: Conversión de Temperaturas
Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin. 
Usa las siguientes fórmulas:

Fahrenheit = Celsius * 9/5 + 32
Kelvin = Celsius + 273.15 */

public class ConversionTemperaturas9 {
    
    public static void main(String[] args) {
        System.out.println("Conversión de Celsius a Fahrenheit y Kelvin \n");

        var scanner = new Scanner(System.in);

        //Pidiendo los datos
        System.out.print("Digita la tempratura en Celsius: ");
        var tempCelsius = scanner.nextDouble();

        //Realizando las operaciones de conversion
        var tempFahrenheit = tempCelsius * 9/5 + 32;
        var tempKelvin = tempCelsius + 273.15;

        //Imprimiendo por pantalla
        System.out.println("La temperatura en grados Fahrenheit es de: " + tempFahrenheit);
        System.out.println("La temperatura en grados Kelvin es de: " + tempKelvin);

        scanner.close();
    }
}
