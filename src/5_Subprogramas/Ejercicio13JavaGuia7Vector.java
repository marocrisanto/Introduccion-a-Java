/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subprogramas;

import java.util.Scanner;

public class Ejercicio13JavaGuia7Vector {
/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
    Declaración y creación de un Vector
        tipo[] arregloV = new tipo[Tamaño];
    
    Declaración y creación de una Matriz
        tipo[][] arregloM = new tipo[Filas][Columnas];
*/ 
    public static void main(String[] args){
         //Definimos la variables
         String[] compañeros = new String[5];
         compañeros[0]="juan";
         compañeros[1]="juan";
         compañeros[2]="juan";
         compañeros[3]="juan";
         compañeros[4]="juan";
         for (int i = 0; i < compañeros.length; i++) {
            System.out.println(compañeros[i]);
        }
    }
}

