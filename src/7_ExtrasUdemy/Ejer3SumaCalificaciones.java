/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasUdemy;

import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Ejer3SumaCalificaciones {
    public static void main(String[] args){
    //Hacer un programa que pida al usuario 3 calificaciones y calcule la suma de las mismas
    
    //Definimos las variables
    double nota1, nota2, nota3, suma;
  
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos al usuario las 3 calificaciones
    System.out.println("Ingrese las 3 calificaciones");
    //guardamos los datos en las variables
    nota1 = leer.nextDouble();
    nota2 = leer.nextDouble();
    nota3 = leer.nextDouble();    
    //Cerramos el objeto Scanner para evitar problemas de memoria
    leer.close();
    //Hacemos la suma de las calificaciones
    suma= nota1+nota2+nota3;
    //Imprimimos el resultado de la suma
    System.out.println("La suma de las 3 calificaciones es: "+suma);
    }
}
