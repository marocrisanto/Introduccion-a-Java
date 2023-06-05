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
public class Ejerc9TiempoEquivalente {
    public static void main (String[] args){
    /*
    Construir un programa que, dado un numero total de horas
        devuelva el numero de semanas equivalentes
        devuelva el numero de dias equivalentes 
        devuelva el numero de horas equivalentes
    Por ejemplo dado un total de 1000 horas debe mostrar que han pasado
        5 semanas
        6 dias
        16 horas    
    */    
     
    //Definimos las variables
    int horas, horasTotales, semanas, dias;
    
    
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Cerramos el scanner
        System.out.println("Ingrese el numero de horas a convertir");
    horasTotales = leer.nextInt();
    leer.close();
    //solicitamos las horas     
    //Realizamos los calculos
    semanas = horasTotales /(24*7);
    dias = horasTotales%(24*7)/24;
    horas = horasTotales%24;
        System.out.println("El equivalente es: ");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
    }
}
