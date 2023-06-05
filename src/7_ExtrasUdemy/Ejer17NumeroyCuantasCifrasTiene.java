package EjerciciosGuia7;

import java.util.Random;
import java.util.Scanner;

public class Ejer17NumeroyCuantasCifrasTiene {
//Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene      
    public static void main (String[]args){
        //Definimos las variables
        int numero;
        //Creamos el objeto Scanner
        Scanner leer = new Scanner(System.in);
        //solicitamos al usuario que ingrese el tamaño del vector
        System.out.println("Ingrese un numero entre 0 y 99999");
        numero = leer.nextInt();
        //Llamamos a las funciones
        calcularCifras(numero);
        //Cerramos el scanner
        leer.close();
    }   
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static void calcularCifras(int numero) {     
        // Función que determina cuantas cifras tiene el numero ingresado por elusuario
            if (numero < 10) {
                System.out.println("El numero tiene una cifra");
            }
            else if (numero<100) {
                System.out.println("El numero tiene dos cifras"); 
            }
            else if (numero<1000) {
                System.out.println("El numero tiene tres cifras");    
            }
            else if (numero<10000) {
                System.out.println("El numero tiene cuatro cifras");
            }
            else if (numero<100000) {
                System.out.println("El numero tiene cinco cifras");    
        }
    }  
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
} 
