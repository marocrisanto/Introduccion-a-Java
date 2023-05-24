/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Ejercicio8JavaGuia7While {
      public static void main(String[] args) {
     /*            && AND
                   || OR
                   ! Operador Lógico de Negación.    
     */     
      //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
      //la nota se pedira de nuevo hasta que la nota sea correcta.    

      //Definimos una variable
      int Nota;
      //Iniciamos la variable en -1 para asegurarnos que entre al bucle while al menos una vez
      Nota=-1;
      //Creamos el objeto Scanner para leer los datos del usuario
      Scanner leer = new Scanner(System.in);
      //Iniciamos el ciclo while para el rango correcto
      while(Nota<0 || Nota>10){
          //Solicitamos que el usuario ingrese la nota
          System.out.println("Ingresa tu nota");
          Nota = leer.nextInt();    
          //Verificamos que la nota sea valida con una sentencia if
          if (Nota<0 || Nota>10){
               System.out.println("Nota incorrecta, ingresa nuevamente tu nota");
          }
      }
       // Cerramos el objeto para evitar problemas de memoria
       leer.close();
       // Mostramos la nota 
       System.out.println("La nota que ingresaste es correcta y es: "+Nota);
      }
}
