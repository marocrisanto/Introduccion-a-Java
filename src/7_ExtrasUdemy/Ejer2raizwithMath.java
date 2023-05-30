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
public class Ejer2raizwithMath {
    public static void main (String[]args){
    //Sacar la raiz de un numero con Marth.sqrt();
    int numero;
    double raiz;
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos al usuario que ingrese el numero
    System.out.println("Ingrese el numero del que desea mostrar su cuadrado");
    //Guardamos el dato en la variable
    numero = leer.nextInt();
    //Cerramos el objeto Scanner
    leer.close();
    raiz = Math.sqrt(numero);
    System.out.println("La raiz del numero es :"+raiz);
    }
}
