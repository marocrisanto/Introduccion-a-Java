package EjerciciosGuia7;

import static EjerciciosGuia7.Ejercicio2NombreEImpresion.saludopersonalizado;
import java.util.Scanner;

public class Ejercicio6numeroParOimpar {
//Crear un programa que dado un numero determine si es par o impar.
    public static void main (String[]args){
    //Creamos las variables
    int numero;
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos al usuario que ingrese el numero
    System.out.println("Ingrese el numero del que desea determinar si es par o impar");
    //Guardamos el dato en la variable
    numero = leer.nextInt();
    //Cerramos el objeto Scanner
    leer.close();
    //Llamamos a la funcion  
    determinarParOimpar(numero);
    }   
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static void determinarParOimpar(int numero) {        
        // Función para calcular el doble de un número
        if (numero % 2 == 0) {
            System.out.println("El numero: "+numero+" es par");
        } else{
            System.out.println("El numero: "+numero+" es impar");
      }
    }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
}
