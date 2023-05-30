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
public class Ejerc8CuadradoSuma {
    public static void main (String[] args){
    //Hacer un programa que calcule el cuadrado de una resultado
    // (a+b)2 = a2 + b2 + 2ab
    
    //Definimos las variables
    int a, b;
    double a2, b2,exponente, resultado;//La base,exponente y resultado deben ser double para poder utilizar Math.pow
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos los valores de a y b
        System.out.println("Ingrese el valor de a y b");
        a= leer.nextInt();
        b= leer.nextInt();
    //Cerramos el objeto Scanner     
    leer.close();
    //Realizamos los calculos de a2 y b2 y 2ab
    exponente = 2;
    resultado = Math.pow(a, exponente)+Math.pow(b, exponente)+(2*a*b);
    //Imprimimos el resultado
        System.out.println("El resultado es: "+resultado);
    
    }
}
