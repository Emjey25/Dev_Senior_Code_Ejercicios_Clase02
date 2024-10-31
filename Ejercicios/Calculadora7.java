package Ejercicios;

import java.util.Scanner;

/*Ejercicio 7: Calculadora Básica
Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, 
resta, multiplicación y división con esos números.
Muestra los resultados en la consola.*/

public class Calculadora7 {
    public static void main(String[] args) {
        System.out.println("*-*-* Bienvenido a la Calculadora Básica *-*-* \n");

        var scanner = new Scanner(System.in);

        //Solicitando al ususrio los numero para operar
        System.out.print("Digita el priemro numero: ");
        var number1 = scanner.nextInt();

        System.out.print("Digita el segundo numero: ");
        var number2 = scanner.nextInt();
        System.out.println();

        //Realizando las operaciones
        var suma = number1 + number2;
        var resta = number1 - number2;
        var multiplicacion = number1 * number2;
        double division = number1 / number2;

        //Imprimiendo los resultados
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);

        scanner.close();
    }
    
}
