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
public class Ejer6SalarioMensualVendedor {
    public static void main(String[] args){
    /* 
    Una compañia de venta de carros usados, paga a su personal de ventas un salario de 1000 mensuales
    mas una comision de 150 por cada carro vendido, mas el 5% del valor de la venta por carro.
    Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
    Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.    
    */    
    
    //Definimos las variables
    int carrosVendidos;
    float comision, valorCarro,comisionExtra, salarioTotal;
    
    Scanner leer = new Scanner(System.in);
    //Solicitamos al usuario que ingrese la cantidad de carros vendidos en el mes
        System.out.println("Ingrese la cantidad de carros vendidos");
        carrosVendidos = leer.nextInt();
        System.out.println("Ingrese el valor de la venta del carro");
        valorCarro = leer.nextInt();
        //Cerramos el objeto Scanner     
        leer.close();
    //Calculamos la comision de 150 por cada carro vendido    
    comision = carrosVendidos*150;   
    //Calculamos la comision del 5% del valor de la venta de carros
    comisionExtra = (float) (valorCarro*0.05*carrosVendidos);
    //Calculamos el salario mensual
    salarioTotal = 1000+(comision+comisionExtra);
        System.out.println("El salario mensual del vendedor es: "+salarioTotal);
    }
}
    