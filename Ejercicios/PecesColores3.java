package Ejercicios;

/*Ejercicio 3: ¿Cuántos peces hay en el acuario?
El agua de las granjas de Minnesota, Iowa, Illinois, Wisconsin, Missouri, Tennesse, Arkansas, Misssissipi y Louisiana 
desemboca en el Océano Atlántico produciendo un fenómeno llamado zona muerta. 
Debido a los altos niveles de nitrógeno y fósforo que traen estas aguas los peces mueren en grandes cantidades.

Para evitar que mueran cientos y cientos de peces, 
la ONG Salvemos los peces de colores ha decidido poner en cuarentena a 284 peces rojos 
y 163 peces azules en un gigantesco acuario, para devolverlos al mar cuando estén curados. 
¿Cuántos peces hay en total dentro del acuario? */

public class PecesColores3 {
    public static void main(String[] args) {
        
        System.out.println("*** Salvando a los peces de colores *** \n");

        //Difiniendo las variables de peces
        var pecesRojos = 284;
        var pecesAzules = 163;

        /*Se realiza la operación para sumar y 
        determinar el total de peces que hay en el acuaerio*/
        var totalPeces = pecesRojos + pecesAzules;

        //Al final se muestra por pantalla la cantidad
        System.out.println("La cantidad de peces de colores que que hay en el acuario son: " + totalPeces);
    }
    
}
