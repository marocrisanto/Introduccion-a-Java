package EjerciciosGuia7;

import java.util.Scanner;

public class Ejercicio10ProgramavalorPositivo {
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    public static void main (String[]args){
    //Creamos las variables
    int limite;
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos al usuario que ingrese el numero
    System.out.println("Ingrese un valor limite positivo");
    //Guardamos el dato en la variable
    limite = leer.nextInt();
    //Llamamos a la funcion  
    solicitarNumeros(limite, leer);
    //Cerramos el objeto Scanner    
    leer.close();
 }
//-----------------------------------------FUNCION--1--------------------------------------------------------------------//     
    public static void solicitarNumeros(int limite, Scanner leer ) {        
        // Función para sumar los numeros iniciales hasta que superen el limite inicial
        int suma = 0, numeros;
        while(suma<=limite){
            System.out.println("Ingresa un numero");
            numeros = leer.nextInt();
            suma += numeros; // suma = suma+numero
        }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
        System.out.println("La suma de los numeros introducidos ha superado el limite");
    }
}