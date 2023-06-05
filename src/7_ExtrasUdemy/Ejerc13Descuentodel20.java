package ExtrasUdemy;

import static EjerciciosGuia7.Ejercicio1SumaDosNumeros.sumar;
import java.util.Scanner;

public class Ejerc13Descuentodel20 {
    //En megaplaza se hace un 20% de descuento a los clientes cuya compra supere los 300.
    //¿Cual sera la cantidad a pagará una persona por su compra?
    
    public static void main(String[]args){
      //Definimos las variables
      float compra;
      //Creamos el objeto Scanner para leer los datos del usuario
      Scanner leer = new Scanner(System.in);
      //Solicitamos al usuario que ingrese la frase
      System.out.println("Ingrese el total de su compra");
      //Guardamos el dato en la variable  
       compra = leer.nextFloat();
      //Cerramos el objeto Scanner
      leer.close();
      //Llamamos a la funcion creando una variable y asignandole lo que devuelve la funcion
      float resultado = calcularCompra(compra);
      //Imprimimos el resultado concatenando la variable
        
    }
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
 
     public static float calcularCompra(float compra){
         //la funcion es de tipo int, por tantos los parametros tambien debe ser int
         
         //Logica
         float resultado = 0, descuento;
       
         if (compra> 300) {
             descuento = compra*0.20f;
             resultado = compra-descuento;
             System.out.println("Su compra es de la cantidad de: "+resultado);
         } else {
             System.out.println("Su compra es de la cantidad de: "+compra);
         }
         
         return resultado;

    }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
   
}
