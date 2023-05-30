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
public class Ejer7CalificacionFinalEstudiante {
    public static void main (String[] args){
    /*
    La calificacion final de un estudiante de informatica se calcula con base a las calificaciones 
    de cuatro aspectos de su rendimiento academico y con las siguientes ponderaciones:
        > participacion---------------------10%
        > primer examen parcial-------------25%
        > segundo examen parcial------------25%
        > examen final----------------------40%
    Hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante.
    */    
    //Definimos las variables
    float participacion, primerExamen, segundoExamen,examenFinal, calificacionFinal;
    
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Solicitamos las calificaciones de los examenes de 10 a 100
        System.out.println("Ingrese la calificacion de la participacion");
        participacion = leer.nextFloat();
        System.out.println("Ingrese la calificacion del primer examen");
        primerExamen = leer.nextFloat();
        System.out.println("Ingrese la calificacion del segundo examen");
        segundoExamen = leer.nextFloat();
        System.out.println("Ingrese la calificacion del examen final");
        examenFinal = leer.nextFloat();    
    //Cerramos el objeto Scanner     
    leer.close();
    
    //Realizamos los calculos en base a las ponderaciones y los valores ingresados
    participacion*=0.10;    //*= es lo mismo que participacion = participacion *10%
    primerExamen*=0.25;
    segundoExamen*=0.25;
    examenFinal*=0.40;
    calificacionFinal = participacion+primerExamen+segundoExamen+examenFinal;
        System.out.println("La calificacion final del estudiante es: "+calificacionFinal);
    }
}
