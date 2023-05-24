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
public class Ejer5CantidadDinero {
    public static void main(String[] args){
    /*Guillermo tiene guillermo dolares. 8
      Luis tiene la mitad de lo que posee Guillermo.4
      Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. 6
      Hacer un programa que calcule e imprima la cantidad que tienen los 3 18
    */    
    
    //Definimos las variables
    float guillermo, sumaTotal, Juan, Luis;
    Scanner leer = new Scanner(System.in);
    //Solicitamos el dato inicial al usuario
    System.out.println("Ingrese la cantidad de dolares que tiene Guillermo");
    guillermo = leer.nextFloat(); // 8
    //Cerramos el objeto Scanner     
    leer.close();
    //Realizamos las operaciones para saber cuanto tiene cada uno
    Luis = guillermo/2; // Luis tiene la mitad de lo que posee Guillermo.(4)
    Juan = (guillermo+Luis)/2; //Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. 6
    sumaTotal = guillermo+Luis+Juan; //Suma de los 3 (18)
    System.out.println("La suma del dinero que tienen los 3 juntos es: "+sumaTotal);
    }
}
