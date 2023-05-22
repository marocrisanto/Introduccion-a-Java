/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicial;

import java.util.Scanner;

/* Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables
por pantalla. */

/**
 *
 * @author maroc
 */
public class Ejercicio4JavaGuia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable Scanner para leer los datos del usuario
        Scanner leer = new Scanner(System.in);
        //Definimos las variables
        String nombre;
        Byte edad;
        //Solicitamos que el usuario ingrese su nombre
        System.out.println("Ingresa tu nombre");
        //Guardamos los datos en la variable
        nombre = leer.next();
        System.out.println("Ingresa tu edad");
        //Guardamos los datos en la variable
        edad = leer.nextByte();
        //Mostramos el resultado
        System.out.println("Tu nombre es "+ nombre +" y tu edad es " + edad);
    }   
}
