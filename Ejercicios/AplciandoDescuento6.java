package Ejercicios;

/*Ejercicio 6: ¿Qué precio tenían antes del descuento?
En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de enero y finalizan a final de marzo.
Por otro lado, las rebajas de verano empiezan durante la primera semana del mes de julio 
y finalizan durante el mes de septiembre.

Para aprovechar la temporada de rebajas he salido de compras. 
He pagado 34€ por unos pantalones que tenían un descuento del 15%. 
¿Qué precio tenían antes de aplicar el descuento? */

public class AplciandoDescuento6 {
    public static void main(String[] args) {
        System.out.println("****Aprovechando la temporada de rebajas y descuentos**** \n");


        //Definiendo las variables
        var precioConDescuento = 34;
        var descuento = 15.0;

        //Calculando el precio original
        var precioOriginal = precioConDescuento / (1 - descuento / 100);

        //Impresión por pantalla
        System.out.println("El precio de los pantalones antes de aplicar el descuento es de: " + precioOriginal);


        /*double precioConDescuento = 34.0; // Precio después del descuento
        double descuento = 15.0; // Descuento en porcentaje

        // Calcular el precio original
        double precioOriginal = precioConDescuento / (1 - descuento / 100);

        System.out.printf("El precio original era: %.2f€%n", precioOriginal);*/
    }
    
}
