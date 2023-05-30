package EjerciciosGuia7;

import java.util.Scanner;

public class Ejercicio8longitudPalabra {
/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java. */
    
public static void main (String[]args){
    //Creamos las variables
    String frase;
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos al usuario que ingrese el numero
    System.out.println("Ingrese una frase o palabra (solo debe ser de 8 caracteres)");
    //Guardamos el dato en la variable
    frase = leer.next();
    //Cerramos el objeto Scanner
    leer.close();
    //Llamamos a la funcion  
    validarLongitud(frase);
 }
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static void validarLongitud(String frase) {        
        // Función para validar la longitud de una frase o palabra
        if (frase.length()==8) {
            System.out.println("Correcto");
        } else{ 
            System.out.println("Incorrecto");
        }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
   }
}