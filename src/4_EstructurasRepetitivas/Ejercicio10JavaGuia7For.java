/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Ejercicio10JavaGuia7For {
     public static void main(String[] args) {
     /*            && AND
                   || OR
                   ! Operador Lógico de Negación.    
     
     Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
     ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
            5 *****
            3 ***
            11 ***********
            2 **
    */
     //Definimos la variables
     int numeros;
     //Creamos el objeto Scanner para leer los datos del usuario
     Scanner leer = new Scanner(System.in);
     //Iniciamos el ciclo para guardar los numeros
         for (int i = 0; i < 4; i++) {
             do{
                 //Solicitamos al usario que ingrese el numero
                 System.out.println("Ingrese un numero (comprendidos entre 1 y 20)");
                 numeros = leer.nextInt();
                 // Si el número está fuera del rango permitido, imprime un mensaje de error.
                 // Como estamos en un bucle do-while, se pedirá otro número.
                   if (numeros<1 || numeros>20){
                System.out.println("Numeros fuera de rango, ingrese los numeros nuevamente");
                    }
             } while (numeros<1 || numeros>20); // Repite el bucle si el número está fuera de rango
     // Imprimimos el número
            System.out.print(numeros + " ");
            // Imprimir los asteriscos
            for (int j = 0; j < numeros; j++) {
                System.out.print("*");
            }
            System.out.println(); // Saltar a la línea siguiente
        }
        leer.close();
    }
}
