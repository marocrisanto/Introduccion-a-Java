package ExtrasUdemy;

import java.util.Scanner;

public class Ejerc10EcuacionSegundoPlano {
/*Construir un programa que calcule y muestre por pantalla 
las raices de la ecuacion de segundo grado de coeficientes reales
*/    
    public static void main (String[] args){
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Cerramos el scanner
    double a,b,c, resultado1, resultado2;
        System.out.println("Digite el valor de a: ");
    a = leer.nextDouble();
    System.out.println("Digite el valor de b: ");
    b = leer.nextDouble();
    System.out.println("Digite el valor de c: ");
    c = leer.nextDouble();
    leer.close();
    resultado1 = (-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/ (2*a);
    resultado2 = (-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/ (2*a);        
        System.out.println("\nLa raiz1 es: "+resultado1);
        System.out.println("\nLa raiz2 es: "+resultado2); 
    }
}
