package EjerciciosGuia7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17VectorContabilizado {
//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 
    public static void main (String[]args){
        //Definimos las variables
        int n;
        //Creamos el objeto Scanner
        Scanner leer = new Scanner(System.in);
        //solicitamos al usuario que ingrese el tamaño del vector
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
       
        //Llamamos a las funciones
        int[] vector = rellenarVector(n);
        contarDigitos(vector);
        
        //Cerramos el scanner
        leer.close();
    }   
      //---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static int[] rellenarVector(int n) {     
        // Función que genera numeros aleatorios
        
        //Creamos un arreglo con el tamaño de n
        int[]vector = new int[n];
        
        //Creamos el objeto de la clase Random
        Random aleatorio = new Random();
       
        //Rellenar el vector   
        for (int i = 0; i < vector.length; i++){
               vector[i]= aleatorio.nextInt(n);
        }       
        //otro bucle for para imprimir los números aleatorios 
        for (int i =0; i< vector.length;i++) {
            System.out.print("["+vector[i]+"]");      
            }
        //Devolvemos el arreglo llamado vector
        return vector;
        }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
 
//---------------------------------------FUNCION--2----------------------------------------------------------------------//     
    public static void contarDigitos(int[]vector) {     
        // Función que busca un número en el vector y imprime sus posiciones si lo encuentra
        
        
        //Creamos un segundo arreglo con el tamaño de n
        int[]contadorDigitos = new int[5];
        
         for (int numero : vector) {
            int cantidadDigitos = String.valueOf(numero).length();
            // Solo contamos números de 1 a 5 dígitos.
            if (cantidadDigitos >= 1 && cantidadDigitos <= 5) {
                contadorDigitos[cantidadDigitos - 1]++;
            }
        }  
        for (int i = 0; i < 5; i++) {
            System.out.println("\nHay " + contadorDigitos[i] + " números de " + (i + 1) + " dígitos.");
        }          
    }
}
//-----------------------------------TERMINA--LA--FUNCION--2------------------------------------------------------------// 
 
