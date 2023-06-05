package EjerciciosGuia7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio18matrizValoresAleatorios {
/*  Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
    obtiene cambiando sus filas por columnas (o viceversa).
             1 0  4                      1 0  6 
matriz A =   0 5  0    ->    matriz B =  0 5  0    
             6 0 -9                      4 0 -9                                          */
    public static void main (String[]args){
        //Definimos las variables
        int n;
        //Creamos el objeto Scanner
        Scanner leer = new Scanner(System.in);
        //solicitamos al usuario que ingrese el tamaño del vector
        System.out.println("Ingrese el tamaño de la matriz");
        n = leer.nextInt();
        //Llamamos a las funciones
        System.out.println("   MATRIZ A:");
        int[][] matriz = rellenarMatriz(n);
        int[][] matrizTraspuesta = generarMatrizTraspuesta(matriz);
        System.out.println("   MATRIZ B:");
        imprimirMatrizTraspuesta(matrizTraspuesta);
        //Cerramos el scanner para evitar problemas de memoria
        leer.close();
    }   
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static int[][] rellenarMatriz(int n) {  
        // Función que rellena con numeros aleatorios una matriz con los datos ingresados del usuario 
        
        //Creamos un arreglo con el tamaño de n
        int[][]matriz = new int[n][n];
        //Creamos el objeto de la clase Random
        Random aleatorio = new Random();
        //Rellenar el vector   
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {
               matriz[i][j]= aleatorio.nextInt(n); 
               System.out.print("["+matriz[i][j]+"]"); 
            }    
         System.out.println(""); // Añadimos un salto de línea después de cada fila
        }        
        //Devolvemos el arreglo llamado matriz
        return matriz;
        }
//-----------------------------------TERMINA--LA--FUNCION--------------------------------------------------------------// 
//---------------------------------------FUNCION--2----------------------------------------------------------------------//     
    public static int[][] generarMatrizTraspuesta(int[][]matriz) {  
        // Función que genera la matriz traspuesta de la matriz original
        
        //Definimos una variable n que almacena la longitud de la matriz que se pasa como argumento. 
        //En este caso, la longitud de la matriz es el número de filas de la matriz
        int n = matriz.length;
        //Inicializamos una nueva matriz bidimensional llamada matrizTraspuesta con la misma longitud
        //(tanto en filas como en columnas) que la matriz original.
        int[][]matrizTraspuesta = new int[n][n];
        //Generamos la matriz traspuesta 
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
               matrizTraspuesta[j][i] = matriz[i][j];
            }
        }
        //Devolvemos la matriz
        return matrizTraspuesta;
     } 
//-----------------------------------TERMINA--LA--FUNCION--2------------------------------------------------------------// 
//---------------------------------------FUNCION--3----------------------------------------------------------------------//     
    public static void imprimirMatrizTraspuesta(int[][]matriz) {  
        // Función que imprime la matriz traspuesta
        
        //Imprimir la matriz traspuesta 
        for (int i = 0; i < matriz.length; i++){    
            for (int j = 0; j < matriz.length; j++) {
           System.out.print("["+matriz[i][j]+"]"); 
            }
        System.out.println(); // Añadimos un salto de línea después de cada fila
         }
    }
//-----------------------------------TERMINA--LA--FUNCION--3------------------------------------------------------------// 
}
