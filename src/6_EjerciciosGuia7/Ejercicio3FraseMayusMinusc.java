package EjerciciosGuia7;
import java.util.Scanner;
public class Ejercicio3FraseMayusMinusc {
    //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
    //Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     public static void main(String[] args){
     //Definimos las variables
     String frase;
     //Creamos el objeto Scanner para leer los datos del usuario
     Scanner leer = new Scanner(System.in);
     //Solicitamos al usuario que ingrese la frase
     System.out.println("Ingrese la frase");
     //Guardamos el dato en la variable  
     frase = leer.nextLine();
     //Cerramos el objeto Scanner
     leer.close();
     //Llamamos a las funciones
     ConvertirMayusc(frase);
     //    System.out.println("La frase en minusculas es: "+ConvertirMayusc(frase));
     ConvertirMinusc(frase);
    //    System.out.println("La frase en minusculas es: "+ConvertirMinusc(frase));
    }
//---------------------------------------FUNCIONES---------------------------------------------------------------------//     
    public static void ConvertirMayusc(String frase) {        //Funcion para convertir a mayusculas
        // Convertir a UpperCase    
         String fraseconvertidaMayusc = frase.toUpperCase();
         System.out.println("La frase en mayusculas es: " + fraseconvertidaMayusc);
}
    public static void ConvertirMinusc(String frase) {       //Funcion para convertir a minusculas
        // Convertir a LowerCase    
        String fraseconvertidaMinusc = frase.toLowerCase();
        System.out.println("La frase en minusculas es: "+fraseconvertidaMinusc);
    }
}
//--------------------------------------------------------------------------------------------------------------------//