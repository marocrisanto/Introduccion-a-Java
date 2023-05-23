/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.EstructurasCondicionales;


import java.util.Scanner;

public class Ejercicio6JavaGuia7IfElse {
    public static void main(String[] args) {
        
   //Implementar un programa que le pida dos números enteros a usuario y determine si ambos o alguno de ellos es mayor a 25.
   
    //Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.  
         byte num1;
         byte num2;
         
        //Creamos el objeto Scanner para leer los datos del usuario
        Scanner leer = new Scanner(System.in);
        
        //Solicitamos que el usuario ingrese el primer numero
        System.out.println("Ingresa el primer numero");
        //Guardamos los datos en la variable
        num1 = leer.nextByte();
        
        //Solicitamos que el usuario ingrese el segundo numero
        System.out.println("Ingresa el segundo numero");
        num2 = leer.nextByte();
        
        // Cerramos el objeto para evitar problemas de memoria
        leer.close();
        
        //Evaluamos los numeros con la condicion if else
        if (num1> 25 && num2 >25) {
            System.out.println("Los dos numeros son mayores a 25");
            }
        else if (num1> 25) {
            System.out.println("El primer numero es mayor a 25");
            } 
        else if (num2> 25) {
            System.out.println("El segundo numero es mayor a 25");
            } 
        else {
            System.out.println("Ninguno de los dos numeros es mayor a 25");
            } 
      }
 }