/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subprogramas;

import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Ejercicio14JavaGuia7VectorFor {
/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
    Declaración y creación de un Vector
        tipo[] arregloV = new tipo[Tamaño];
    
    Declaración y creación de una Matriz
        tipo[][] arregloM = new tipo[Filas][Columnas];
*/ 
    public static void main(String[] args){
         //Definimos la variables
         int compañeros = 0;
         //Creamos el objeto Scanner para leer los datos del usuario
         Scanner leer = new Scanner(System.in);
         //Solicitamos al usuario que ingrese los numeros
         System.out.println("Ingrese la cantidad de compañeros de equipo");
         compañeros = leer.nextInt();
         //después de usar nextInt() para leer el número de compañeros, 
         //necesitas usar nextLine() para consumir el carácter de nueva línea restante, 
         //para que puedas leer correctamente los nombres de los compañeros con nextLine() en el bucle.
         leer.nextLine();
         //Guardamos el dato en el vector 
          String[] Equipo = new String[compañeros];         
         for (int i = 0; i < Equipo.length; i++) {
             System.out.println("Ingresa el nombre del compañero "+(i+1)+":");
             Equipo[i]=leer.nextLine();
        }
         for (int i = 0; i < Equipo.length; i++) {
             System.out.println("Compañero "+(i+1)+": "+Equipo[i]);
        }
         //Cerramos el objeto Scanner
         leer.close();
    }   
}