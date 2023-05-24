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
public class Ejer4SalarioEmpleado {
    public static void main(String[] args){
    //Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de 
    //sus horas semanales trabajadas y de su salario por hora
    
    //Definimos las variables
    int horasSemanales;
    float salarioSemanal,salarioHora, Suma; 
    
    //Creamos un objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos los datos al usuario
    System.out.println("Ingrese las horas semanales trabajadas");
    //Guardamos los datos en la variables    
        horasSemanales = leer.nextInt();
    System.out.println("Ingrese el salario por hora");
        salarioHora = leer.nextFloat();
    //Cerramos el objeto Scanner     
    leer.close();
    //Calculamos el salario semanal
    salarioSemanal = salarioHora * horasSemanales;
    //Imprimimos el resultado
     System.out.println("El salario semanal del empleado es: "+salarioSemanal);
    }
}