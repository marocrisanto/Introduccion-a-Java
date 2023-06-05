package EjerciciosGuia7;

import java.util.Arrays;

public class Ejercicio15Vector {
    //Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    //muestre por pantalla en orden descendente.
    
    public static void main (String[]args){
        //Llamamos a la funcion
        rellenarVector();
    }
      //---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static void rellenarVector() {     
        // Función que genera 100 numeros y los imprime
        
        //Generar el tamaño del vector
           int[]numeros = new int[100];
           
        //Rellenar el vector   
        for (int i = 0; i < numeros.length; i++){
               numeros[i]= 100-i;
        }       
        //otro bucle for para imprimir los números en orden descendente. 
        for (int i =0; i< numeros.length;i++) {
            System.out.println("["+numeros[i]+"]");        
        }
    }        
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
}

     
        
 


