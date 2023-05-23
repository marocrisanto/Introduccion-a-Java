/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author maroc
 */
public class Ejercicio5Java {
     public static void main(String[] args) {
       //Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.  
         boolean soltero;
         double estatura;
         char inicialNombre;
         
        //Creamos el objeto Scanner para leer los datos del usuario
        Scanner leer = new Scanner(System.in);
        
        //Solicitamos que el usuario ingrese el valor del boolean
        System.out.println("Ingresa false o true para el boolean");
        //Guardamos los datos en la variable
        soltero = leer.nextBoolean();
        //Solicitamos que el usuario ingrese el valor del boolean
        System.out.println("Ingresa tu altura");
        estatura = leer.nextDouble();
        //Solicitamos que el usuario ingrese el valor del boolean
        System.out.println("Ingresa la inicial de tu nombre");
        inicialNombre = leer.next().charAt(0);
  
        // Cerramos el objeto para evitar problemas de memoria
        leer.close();
    }
}
