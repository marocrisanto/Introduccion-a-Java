package ExtrasUdemy;

import java.util.Scanner;

public class Ejer12CaracterporTeclado {
    //Programa que lea un caracter por teclado y compruebe si es una letra mayuscula
    public static void main (String[] args){    
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Definimos las variables
    char letra;
        System.out.println("Ingrese un caracter");
    letra = leer.nextLine().charAt(0);
    //Cerramos el scanner
    leer.close();
    
        if (Character.isUpperCase(letra) ) {
            System.out.println("Esta es una letra masyucula");
        }
        else{
            System.out.println("Es una letra minuscula");
        }
    
    }
}
