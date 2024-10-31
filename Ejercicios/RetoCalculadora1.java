package Ejercicios;

/* En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" 
utilizando las instrucciones necesarias.

¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
Explique por que la otra calculadora genera un resultado diferente.*/

public class RetoCalculadora1 {
    public static void main(String[] args) {

        System.out.println("Resolviendo el reto de la calculadora \"6 / 2 ( 1 + 2 )\" \n ");

        var operacion = 6 / 2 * (1+2);
        System.out.println("El resultado de la operacion es: " + operacion + "\n");
        
        //Explique por que la otra calculadora genera un resultado diferente.
        String mensaje = "La segunda calculadora muestra una respuesta errónea ya que puede darse\r\n" + //
                        "debido a como funcione el sistema de la calculadora ya que en algunos casos puede estar \r\n" + //
                        "faltando el signo * entre el 2 y el parentesis y por ello se puede generar el error";
        System.out.println(mensaje);
        
    }
}
