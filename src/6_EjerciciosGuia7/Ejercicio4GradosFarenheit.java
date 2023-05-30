package EjerciciosGuia7;

import static EjerciciosGuia7.Ejercicio3FraseMayusMinusc.ConvertirMinusc;
import java.util.Scanner;

public class Ejercicio4GradosFarenheit {
   //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
   //La fórmula correspondiente es: F = 32 + (9 * C / 5).
    
    public static void main(String[] args){
     //Definimos las variables
     float gradosCentigrados;
     
     //Creamos el objeto Scanner para leer los datos del usuario
     Scanner leer = new Scanner(System.in);
     //Solicitamos al usuario que ingrese la frase
     System.out.println("Ingrese los grados centigrados que desea convertir a farenheit");
     //Guardamos el dato en la variable  
     gradosCentigrados = leer.nextFloat();
     //Cerramos el objeto Scanner
     leer.close();
     //Llamamos a las funciones
     float farenheit = convertirGrados(gradosCentigrados);
        // Mostramos el resultado
        System.out.println(gradosCentigrados + " grados centigrados es igual a: " + farenheit+"  grados farenheit");
    }
//---------------------------------------FUNCION------------------------------------------------------------------------//     
    public static float convertirGrados(float gradosCentigrados) {        
        // Convertir de grados a centigrados
        float farenheit = 32 + (9 * gradosCentigrados/5) ; 
        //Retornamos la variable
        return farenheit;     
    }
//-----------------------------TERMINA--LA--FUNCION---------------------------------------------------------------------//   
}


