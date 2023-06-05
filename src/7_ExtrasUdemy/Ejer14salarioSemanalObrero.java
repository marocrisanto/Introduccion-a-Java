package ExtrasUdemy;

import static EjerciciosGuia7.Ejercicio1SumaDosNumeros.sumar;
import java.util.Scanner;

public class Ejer14salarioSemanalObrero {
    //Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
    //Si trabaja 40 horasTrabajadas o menos se le paga 16 por hora
    //Si trabaja mas de 40 horasTrabajadas se le paga 16 por cada una de las primeras 40 horasTrabajadas y 20 por cada hora extra        
    
    public static void main(String[]args){
      //Definimos las variables
      int horasTrabajadas;
      //Creamos el objeto Scanner para leer los datos del usuario
      Scanner leer = new Scanner(System.in);
      //Solicitamos al usuario que ingrese las horas Trabajadas normales (hasta 40)
      System.out.println("Ingrese el total de horas normales trabajadas en la semana");
      //Guardamos el dato en la variable  
       horasTrabajadas = leer.nextInt();
      //Cerramos el objeto Scanner
      leer.close();
      //Llamamos a la funcion creando una variable y asignandole lo que devuelve la funcion
      int salarioTotal = calcularSueldo(horasTrabajadas);
      //Imprimimos el salarioTotal concatenando la variable
        
    }
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
     public static int calcularSueldo(int horasTrabajadas){
         //la funcion es de tipo int, por tantos los parametros tambien debe ser int
         
         //Logica
         int salarioTotal;
         
         if (horasTrabajadas <= 40) {
             salarioTotal = (16*horasTrabajadas);
             System.out.println("Su salario semanal es de la cantida de: "+salarioTotal);
         } else {
             salarioTotal = (16*40)+((horasTrabajadas-40)*20);
             System.out.println("Su salario semanal es de la cantida de: "+salarioTotal);
         }
         return salarioTotal;
    }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
   
}
