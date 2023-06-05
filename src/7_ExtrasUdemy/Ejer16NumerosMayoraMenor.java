package ExtrasUdemy;

import java.util.Scanner;

public class Ejer16NumerosMayoraMenor {
    //Pedir 3 numeros y mostrarlos ordenados de mayor a menor
     public static void main (String[] args){  
         int num1, num2, num3;
      //Creamos el objeto Scanner para leer los datos del usuario
      Scanner leer = new Scanner(System.in);
      //Solicitamos al usuario que ingrese los numeros
      System.out.println("Ingrese el primer numero");
      //Guardamos el dato en la variable  
       num1 = leer.nextInt();
       System.out.println("Ingrese el segundo numero");
      //Guardamos el dato en la variable  
       num2 = leer.nextInt();
      System.out.println("Ingrese el tercer numero");
      //Guardamos el dato en la variable  
       num3 = leer.nextInt(); 
      //Cerramos el objeto Scanner
      leer.close();
      //Llamamos a la funcion 
      ordenarNumeros(num1,num2,num3);
}               
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
public static void ordenarNumeros(int num1, int num2, int num3) {        
        // Función para calcular el doble de un número
        if (num1 > num2 && num2 > num3) {
            System.out.println("Orden: "+"\n"+num1+"\n"+num2+"\n"+num3);
        } else if (num1 > num3 && num3 > num2)  {
            System.out.println("Orden: "+"\n"+num1+"\n"+num3+"\n"+num2);
        }
        else if (num2 > num1 && num1 > num3) {
            System.out.println("Orden: "+"\n"+num2+"\n"+num1+"\n"+num3);
        }
        else if (num2 > num3 && num3 > num1) {
            System.out.println("Orden: "+"\n"+num2+"\n"+num3+"\n"+num1);
        }
        else if (num3 > num1 && num1 > num2) {
            System.out.println("Orden: "+"\n"+num3+"\n"+num1+"\n"+num2);    
        }           
        else {
            System.out.println("Orden: "+"\n"+num3+"\n"+num2+"\n"+num1);   
        }
}
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
}