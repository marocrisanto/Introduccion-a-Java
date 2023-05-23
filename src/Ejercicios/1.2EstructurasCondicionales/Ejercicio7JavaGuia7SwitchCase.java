/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.EstructurasCondicionales;

import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Ejercicio7JavaGuia7SwitchCase {
/* Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
     Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
     Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
     Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
     Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
     Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
*/
    public static void main(String[] args) {
       //Definimos una variable tipoMotor de una bomba para mover fluidos  
       int tipoMotor; 
       
       //Creamos el objeto Scanner para leer los datos del usuario
       Scanner leer = new Scanner(System.in);
       //Solicitamos que el usuario ingrese el tipo de motor para la bomba de fluidos
        System.out.println("Ingresa un numero entre 1 y 4 para el tipo de motor del siguiente modo:\n1: Bomba de agua\n2: Bomba de gasolina,\n3: Bomba de hormigón,\n4: Bomba de pasta alimenticia");
        //Guardamos el valor ingresado en la variable mediante Scanner
        tipoMotor = leer.nextInt();
       // Cerramos el objeto para evitar problemas de memoria
        leer.close();
        
        //Evaluamos los casos con un bloque switch
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }       
    }
}
