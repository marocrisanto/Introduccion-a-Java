package EjerciciosGuia7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16VectorNumBuscar {
//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al usuario 
//un numero a buscar en el vector. El programa mostrará donde se encuentra el numero y si se encuentra repetido   
    public static void main (String[]args){
        //Definimos las variables
        int n, numBuscado;
        //Creamos el objeto Scanner
        Scanner leer = new Scanner(System.in);
        //solicitamos al usuario que ingrese el tamaño del vector
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        
        //Solicitamos al usario que ingrese el numero que desea buscar en el vector
        System.out.println("Ingrese el numero que desea buscar en el vector");
        numBuscado = leer.nextInt();
        
        //Llamamos a las funciones
        int[] numeros = rellenarVector(n);
        buscarNumero(numeros, numBuscado);
        
        //Cerramos el scanner
        leer.close();
    }   
      //---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static int[] rellenarVector(int n) {     
        // Función que genera 100 numeros aleatorios
        
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
//-----------------------------------TERMINA--LA--FUNCION--2------------------------------------------------------------// 
 
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static void buscarNumero(int[]vector, int numBuscado) {     
        // Función que busca un número en el vector y imprime sus posiciones si lo encuentra
        
        //Inicializamos una variable booleana
        boolean encontrado = false;
        //Recorremos cada número en el arreglo vector
        for (int i =0; i < vector.length; i++){
        if (vector[i]== numBuscado) {
        //Si el número es igual al número que el usuario proporcionó, 
        //imprime un mensaje que indica que el número se encontró en el array y su ubicación    
        System.out.println("\nEl numero: "+numBuscado+" se encuentra en el arreglo en la posicion "+i); 
        //inicializamos otra variable booleana
        encontrado = true;
    } 
}
        //Si después de recorrer todo el array numeros, 
        //encontrado sigue siendo false, entonces imprimimos un mensaje que indica que el número no se encontró en el array
        if (!encontrado) {
            System.out.println("\nEl numero: "+numBuscado+" no se encontro en el arreglo");
        }
    }        
}    
//-----------------------------------TERMINA--LA--FUNCION--2------------------------------------------------------------// 
 
