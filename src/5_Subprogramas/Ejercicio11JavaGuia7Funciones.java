/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subprogramas;

import static Subprogramas.Ejercicio11JavaGuia7TeoriaFunciones.saludopersonalizado;
import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Ejercicio11JavaGuia7Funciones {
    /*
    Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
    en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
    reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
    vocales acentuadas) se mantienen sin cambios.
                                                                
                                a e i o u                   
                                @ # $ % *                   
    
    Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
    correspondiente. Utilice la estructura “según” para la transformación.
    Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
    La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
    Para realizar este ejemplo, deberás investigar el método concat de la
    clase String. Puedes encontrar estos ejemplos al final de la guía.
   */ 
    public static void main(String[] args){
      //Definimos las variables
      String frase;
      //Creamos el objeto Scanner para leer los datos del usuario
      Scanner leer = new Scanner(System.in);
      //Solicitamos al usuario que ingrese la frase
      System.out.println("Ingrese la frase que termina en un punto");
      //Guardamos el dato en la variable  
      frase = leer.next();
      //Cerramos el objeto Scanner
      leer.close();
      //Llamamos a la funcion creando una variable y asignandole lo que devuelve la funcion
      String fraseCodificada = codificar(frase);
      //Imprimimos el resultado concatenando la variable
      System.out.println("La frase codificada es: "+fraseCodificada);
    }
    
    //---------------Aqui va la funcion fuera del main-------------------------------------------------------------------------
    //Creamos la funcion llamada codificar
    public static String codificar(String frase){ 
        //Creamos una variable y le asignamos un valor vacio que servira para almacenar la frase codificada
        String fraseCodificada = "";
        //Creamos un bucle for each para recorrer cada carácter en la frase
        for (char c : frase.toCharArray()) { //frase.toCharArray(): 
        //Esto convierte la cadena de caracteres frase en un arreglo de caracteres. 
        //Cada carácter en frase se convierte en un elemento en el arreglo.
            switch (c){//Utilizamos una estructura switch para realizar la transformación de cada carácter. 
            case 'a':  //Si el carácter es una vocal (minúscula o mayúscula),se concatena el carácter correspondiente 
                       //de la tabla de correspondencias (@, #, $, % o *) a la variable fraseCodificada. 
                       //Si el carácter no es una vocal, se concatena el mismo carácter sin cambios.
                fraseCodificada += '@'; //Esto es lo mismo que fraseCodificada = fraseCodificada + '@';
                break;
            case 'A':
                 fraseCodificada += '@';
                break;
            case 'e':
                 fraseCodificada += '#';
                break;
            case 'E':
                 fraseCodificada += '#';
                break;
            case 'i':
                 fraseCodificada += '$';
                break;
            case 'I':
                 fraseCodificada += '$';
                break;    
            case 'o':
                 fraseCodificada += '%';
                break;
            case 'O':
                 fraseCodificada += '%';
                break;      
             case 'u':
                 fraseCodificada += '*';
                break;
            case 'U':
                 fraseCodificada += '*';
                break;     
            default:
                fraseCodificada += c;
            }
        }
        return fraseCodificada;//Retornamos la variable 
    }
}
        
        
  
