package EjerciciosGuia7;

import java.util.Scanner;


public class Ejercicio5dobleyTripledeNumeroyRaiz {
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple 
//y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
    public static void main (String[]args){
    double numero;//La base,exponente y resultado deben ser double para poder utilizar Math.pow
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos al usuario que ingrese el numero
    System.out.println("Ingrese el numero del que desea mostrar su cuadrado");
    //Guardamos el dato en la variable
    numero = leer.nextDouble();
    //Cerramos el objeto Scanner
    leer.close();
    // Calculamos y mostramos el doble llamando a la funcion 1
    double doble = calcularDoble(numero);//Se debe crear una nueva variable y asignarla a la funcion
        System.out.println("El doble de " + numero + " es: " + doble);
    // Calculamos y mostramos el triple llamando a la funcion 2
    double triple = calcularTriple(numero);
        System.out.println("El triple de " + numero + " es: " + triple);   
    // Calculamos y mostramos la raíz cuadrada
    double raizCuadrada = calcularRaizCuadrada(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static double calcularDoble(double numero) {        
        double exponente= 2;
        // Función para calcular el doble de un número
        double resultadodeDoble = Math.pow(numero, exponente);
        //Retornamos la variable
        return (float) resultadodeDoble;     
    }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------//   

//---------------------------------------FUNCION--2----------------------------------------------------------------------//     
    public static double calcularTriple(double numero) {        
        double exponente= 3;
        // Función para calcular el triple de un número
        double resultadodeTriple = Math.pow(numero, exponente);
        //Retornamos la variable
        return (float) resultadodeTriple;     
    }
//-----------------------------------TERMINA--LA--FUNCION--2------------------------------------------------------------//
//---------------------------------------FUNCION--3----------------------------------------------------------------------//     
    public static double calcularRaizCuadrada(double numero) {        
        // Función para calcular la raiz cuadrada de un número
        double resultadoRaiz = Math.sqrt(numero);
        //Retornamos la variable
        return resultadoRaiz;     
    }
//-----------------------------------TERMINA--LA--FUNCION--3------------------------------------------------------------//
}