package EjerciciosGuia7;

import java.util.Scanner;

public class Ejercicio7fraseEureka {
//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto
//sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 public static void main (String[]args){
    //Creamos las variables
    String frase;
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos al usuario que ingrese el numero
    System.out.println("Ingrese la frase que desea validar");
    //Guardamos el dato en la variable
    frase = leer.next();
    //Cerramos el objeto Scanner
    leer.close();
    //Llamamos a la funcion  
    validarFrase(frase);
 }
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static void validarFrase(String frase) {        
        // Función para validar una frase
        if ("eureka".equals(frase)) {
            System.out.println("Correcto");
        } else{ 
            System.out.println("Incorrecto");
        }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
   }
}


