package Ejercicios;

/*Ejercicio 5: ¿Cuánto te ha costado el ordenador?
El videojuego en el ordenador está viviendo una nueva época de oro con un montón de juegos exclusivos. 
Para comprarte un PC Gamer deberás fijarte principalmente en el procesador, la tarjeta gráfica, la memoria RAM...
pero sobre todo en los accesorios como el teclado y ratón.

Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta 660€ con todos los accesorios incluidos. 
Sin embargo, el vendedor te descuenta el 10% por pronto pago 
¿Cuánto tienes que pagar en total por el ordenador con todos los accesorios? */

public class PcGamerEjercicio5 {
    public static void main(String[] args) {
        System.out.println("****Hallando el valor de la PC Gamer con todos los accesorios**** \n");

        //Definiendo variables
        var valorPcGamer = 660;
        var descuento = valorPcGamer * 0.1;

        //operando
        var totalPagar = valorPcGamer - descuento;

        //Imprimiendo
        System.out.println("El valor total a pagar por la PC gamer aplicando el descuento por pronto pago es de: " 
                            + totalPagar + " Euros");
        
    }
    
}
