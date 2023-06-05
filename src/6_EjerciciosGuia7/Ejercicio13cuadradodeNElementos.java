package EjerciciosGuia7;

import java.util.Scanner;

public class Ejercicio13cuadradodeNElementos {
    //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
    //cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    //            * * * *
    //            *     *
    //            *     *
    //            * * * *
    public static void main (String[]args){
        //Definimos las variables
        int n;
        //Creamos el objeto Scanner
        Scanner leer = new Scanner(System.in);
        //solicitamos al usuario que ingrese la cadena
        System.out.println("Ingrese la cantidad de elementos del cuadrado");
        n = leer.nextInt();
        //Invocamos la funcion
        dibujarCuadrado(n);
        }
    

//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static void dibujarCuadrado(int n) {     
        // Función que recibe como parámetro la longitud de los lados del cuadrado
            for (int i = 0; i < n; i++) {//for anidado, este bucle externo controla las filas del cuadrado
                /*
                  filas  * * * *
                              
                              
                         * *¨* *
                */
                for (int j = 0; j < n; j++) {//este bucle controla las columnas
                    /*   columnas
                         *  *  * *
                         *  *  * *
                         *  *  * *
                */
                    if (i==0 || i==n-1 || j==0 || j==n-1) {
                        System.out.print(" *");
                    }else{
                        System.out.print("  ");
                    }
            }
                System.out.println();
        }
    }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
}