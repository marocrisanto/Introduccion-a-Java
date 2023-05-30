/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subprogramas;

import static Subprogramas.Ejercicio11JavaGuia7Funciones.codificar;
import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Ejercicio12JavaGuia7Esmultiplo {
    /*
    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario 
    validando que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del segundo, 
    sino informe que no lo son.
    */
    
     public static void main(String[] args){
         
         //Definimos las variables
         int num1;
         int num2;
         //Creamos el objeto Scanner para leer los datos del usuario
         Scanner leer = new Scanner(System.in);
         //Solicitamos al usuario que ingrese los numeros
         System.out.println("Ingrese los numeros para validar si son multiplos");
         //Guardamos el dato en la variable de num1 
         num1 = leer.nextInt();
         num2 = leer.nextInt();
         //Cerramos el objeto Scanner
         leer.close();
         //Llamamos a la funcion creando una variable y asignandole lo que devuelve la funcion
          EsMultiplo(num1, num2);
         
     }
    //Creamos la funcion 
    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1+" es un multiplo de "+num2);
        } else {
            System.out.println(num1+" no es un multplo de "+num2);
        }        
    }
}
