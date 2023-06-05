package EjerciciosGuia7;

import java.util.Scanner;

public class Ejercicio14FuncionConvertirEuros {
    /*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
 public static void main (String[]args){
        //Definimos las variables
        int euros;
        String moneda;
        //Creamos el objeto Scanner
        Scanner leer = new Scanner(System.in);
        //solicitamos al usuario que ingrese la cadena
        System.out.println("Ingrese la cantidad de euros que desea convertir");
        euros = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese la moneda a la que desea convertir los euros:\nDolares\nLibras\nYenes");
        moneda = leer.nextLine();
       // System.out.println("El cambio de divisas es:");
        //Invocamos la funcion
        convertiMoneda(euros,moneda);
        // Cerramos el objeto para evitar problemas de memoria
        leer.close();
        }
    

//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static void convertiMoneda(int euros, String moneda) {
        double resultado;
// Función para convertir moneda tendra como parámetros, la cantidad de euros y la moneda a converir que será una cadena, 
//este no devolverá ningún valor y mostrará un mensaje indicando el cambio(void).

        // Convertimos la moneda a minúsculas para evitar problemas con la entrada del usuario
        moneda = moneda.toLowerCase();
        //Evaluamos los operaciones con un bloque switch
        switch (moneda){
            case "libras":
                resultado = euros*0.86;
                System.out.println(euros+" Euros son "+resultado+" Libras");
                break;
            case "dolares":
                resultado = euros*1.28611;
                System.out.println(euros+" Euros son "+resultado+" Dolares");
                break;
            case "yenes":
                resultado = euros*129.852;
                System.out.println(euros+" Euros son "+resultado+" Yenes");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
            }
        }
    }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
