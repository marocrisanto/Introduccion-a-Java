/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasRepetitivas;


import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Ejercicio9JavaGuia7DoWhile {
     public static void main(String[] args) {
     /*            && AND
                   || OR
                   ! Operador Lógico de Negación.    
     */ 
     /*
     Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle 
     y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el resultado de la suma 
     de los números leídos, pero si el número es negativo no debe sumarse.
     Nota: recordar el uso de la sentencia break.
    */
        //Creamos el objeto Scanner para leer los datos del usuario
        Scanner leer = new Scanner(System.in);
        //Definimos las variable
        int i=0;
        int suma=0;
        int numero;
        //Iniciamos el ciclo
        do {
            System.out.println("Ingresa 20 numeros:");
            numero = leer.nextInt();
            //Con la sentencia if verificamos si es 0 y se imprime           
            if (numero==0) {
                System.out.println("Se capturó el numero cero");
                break;
             //Con else if verificamos que si es mayor a 0 hacemos la sumatoria               
            } else if (numero>0) {
                suma = suma+numero;
            }
            i++;
         //Con while verificamos el rango           
        } while (i<20);
         // Cerramos el objeto para evitar problemas de memoria       
        leer.close();
        //Hacemos la impresion
        System.out.println("La suma de los números leídos es: " + suma);
    }
}