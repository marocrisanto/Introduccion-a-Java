package ExtrasUdemy;
import java.util.Scanner;
public class Ejer15PareImpar {
    //Hacer un programa que tome dos numeros y diga si ambos son pares o impares
     public static void main (String[] args){  
         int num1, num2;
      //Creamos el objeto Scanner para leer los datos del usuario
      Scanner leer = new Scanner(System.in);
      //Solicitamos al usuario que ingrese los numeros
      System.out.println("Ingrese el primer numero");
      //Guardamos el dato en la variable  
       num1 = leer.nextInt();
       System.out.println("Ingrese el segundo numero");
      //Guardamos el dato en la variable  
       num2 = leer.nextInt();
      //Cerramos el objeto Scanner
      leer.close();
      //Llamamos a la funcion 
      determinarParOimpar(num1, num2);
}               
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
public static void determinarParOimpar(int num1, int num2) {        
        // Función para calcular el doble de un número
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Ambos numeros son pares");
        } else if (num1 % 2 != 0 && num2 % 2 !=0 ) {
            System.out.println("Ambos numeros son impares");
        }
        else{
            System.out.println("Un numero es par y el otro es impar");
        }
    }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
}
       
