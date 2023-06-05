package ExtrasUdemy;

import java.util.Scanner;

public class Ejerc11Dosnumeros {
    //Pedir dos numeros y decir cual es el mayor o si son iguales  
    
    public static void main (String[] args){
    //Creamos el objeto Scanner
    Scanner leer = new Scanner(System.in);
    //Definimos las variables
    int num1,num2;
        System.out.println("Digite dos numeros: ");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    //Cerramos el scanner
    leer.close();
        if (num1>num2) {
            System.out.println("El numero "+num1+" es mayor");
        }
        else{
            if (num2>num1) {
                System.out.println("El numero "+num2+" es mayor");
            }
            else{
                System.out.println("Los numeros son iguales");        
                 }       
        }
    }
}
