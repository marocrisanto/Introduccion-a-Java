/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEntradaySalidaInfo;

import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Ejercicio5JavaDetecciondeerrores {
    
    
/*Arreglar la siguiente porción de codigo.
public static void main(String[] args) {
Scanner leer = new Scanner();
System.out.println("Ingresa tu edad");
String nombre = leer.nextInt();

System.out.println("Ingresa tu nombre");
int edad = leer.next();
*/

    public static void main(String[] args) {
        //Creamos el objeto Scanner para leer los datos del usuario
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();

        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();

    }
}    
    
    
