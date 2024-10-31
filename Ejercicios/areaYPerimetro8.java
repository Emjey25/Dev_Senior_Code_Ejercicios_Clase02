package Ejercicios;

import java.util.Scanner;

/*Ejercicio 8: Área y Perímetro de un Rectángulo
Crea un programa que calcule el área y el perímetro de un rectángulo. 
Solicita al usuario la longitud y el ancho del rectángulo. */

public class areaYPerimetro8 {
    public static void main(String[] args) {
        System.out.println("[*] Area y perímetro de una Rectangulo [*] \n");

        var scanner = new Scanner(System.in);

        //Solicitud de datos al usuario
        System.out.print("Digita la medida del ancho del rectangulo: ");
        var ancho = scanner.nextDouble();
        System.out.print("Digita el largo del rectangulo: ");
        var largo = scanner.nextDouble();

        //Realizando las operaciones
        var area = ancho * largo;
        var perimetro = (ancho * 2) + (largo * 2);
        
        //Impresion por consola
        System.out.println("El perimetro del rectangulo es de: " + perimetro);
        System.out.println("El area del rectangulo es de: " + area);

        scanner.close();

    }
}
