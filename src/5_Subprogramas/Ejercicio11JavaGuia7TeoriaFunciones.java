package Subprogramas;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maroc
 */
public class Ejercicio11JavaGuia7TeoriaFunciones {
      public static void main(String[] args){
    //------------------------------------------------------------------------------------------------------------------- 
    //Llamamos a las funcion 1.0 que creamos
    int resultado = suma(10,10);//Para llamar a la funcion creamos una variable llamada resultado en el metodo main
    //y a esta variable le asignamos el producto de la funcion (esta variable es local porque solo esta en el main)
        System.out.println("resultado");//Imprimimos la variable
    //------------------------------------------------------------------------------------------------------------------- 
    
    
    //-------------------------------------------------------------------------------------------------------------------  
    //Llamamos a la funcion 2.0 que creamos
    //En este caso queremos que el nombre se lea por teclado asi que lo hacemos con Scanner    
        Scanner leer = new Scanner(System.in);
    //Guardamos el dato en la variable y le ponemos String porque no esta definida el tipo de variable desde el inicio
        String nombre = leer.next();//
    //Mandamos a llamar a la funcion y le pasamos como argumento la variable en la que se guardo el dato    
        saludopersonalizado(nombre);
    
    //Otro manera de llamar a la funcion es pasarle como argumento el leer.next();
    //Aqui no se guarda la variable sino que lo pongamos en teclado directamente es lo que va al metodo
        saludopersonalizado(leer.next());
    }   
    //------------------------------------------------------------------------------------------------------------------- 
      
    //---------------1.0 Ejemplo de funcion suma-------------------------------------------------------------------------
    public static int suma(int a, int b){ //la funcion es de tipo int, por tantos los parametros tambien debe ser int
        
        //Logica
        int resultado = a + b; //La variable llamada resultado tambien debe ser de tipo int
        
        //Retornamos la variable resultado
        return resultado;   
    }
    
    //----------------2.0 Ejemplo de funcion saludo----------------------------------------------------------------------
    public static void saludopersonalizado(String nombre){
        System.out.println("Hola "+nombre+" como estas?");
    }
    //-------------------------------------------------------------------------------------------------------------------  
}
