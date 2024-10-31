package Ejercicios;

/*Ejercicio 2: ¿Ves algún error en el precio?

En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen. 
Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€. 
¿Crees que es correcto el precio?

En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto. */

public class PrecioPernilIberic2 {
    public static void main(String[] args) {
        System.out.println("Creando programa para calcular le precio por Kilo real \n");

        //Se definen las varibales del precio del pernil y la porción
        var precioPernil100g = 5.95;
        var kilo = 1000; 

        //Aquí se crea una variable donde se multiplica el precio del pernil de 100g por la equivalnecia de una kilo osea 1000g
        var precioCorrecto = precioPernil100g * kilo;

        System.out.println("El precio correcto del kilo de Pernil Iberic D'Engreix Llen.Azuaga, es de: " + precioCorrecto);
        
    }
    
}
