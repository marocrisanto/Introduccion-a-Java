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
public class Ejer1numeroAlcuadrado {
    
    public static void main (String[]args){
    //Leer un numero y mostrar su cuadrado
    int numero;
    double exponente, resultado;//La base,exponente y resultado deben ser double para poder utilizar Math.pow
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos al usuario que ingrese el numero
    System.out.println("Ingrese el numero del que desea mostrar su cuadrado");
    //Guardamos el dato en la variable
    numero = leer.nextInt();
    exponente = 2;
    resultado = Math.pow(numero, exponente);
    System.out.println("El resultado de: "+numero+" al cuadrado es : "+resultado);
    }
}
