/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia7;

import static Subprogramas.Ejercicio11JavaGuia7Funciones.codificar;
import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Ejercicio1SumaDosNumeros {
    //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
    //El programa deberá después mostrar el resultado de la suma
    
    public static void main(String[] args){
    //Definimos las variables
     int a; int b; int numeros = 0;
      //Creamos el objeto Scanner para leer los datos del usuario
      Scanner leer = new Scanner(System.in);
      //Solicitamos al usuario que ingrese la frase
      System.out.println("Ingrese dos numeros");
      //Guardamos el dato en la variable  
       a = leer.nextInt();
       b = leer.nextInt();
      //Cerramos el objeto Scanner
      leer.close();
      //Llamamos a la funcion creando una variable y asignandole lo que devuelve la funcion
    int resultado = sumar(a,b);
      //Imprimimos el resultado concatenando la variable
      System.out.println("El resultado de la suma es : "+resultado);
    }
    
     public static int sumar(int a, int b){////la funcion es de tipo int, por tantos los parametros tambien debe ser int
         
         //Logica
        int resultado = a + b; //La variable llamada resultado tambien debe ser de tipo int
        
         return resultado;

    }
}

   
