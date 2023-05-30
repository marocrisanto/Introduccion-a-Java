package EjerciciosGuia7;
import static Subprogramas.Ejercicio11JavaGuia7TeoriaFunciones.saludopersonalizado;
import java.util.Scanner;


public class Ejercicio2NombreEImpresion {
    //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

    public static void main(String[] args){
     //Definimos las variables
     String nombre;
     //Creamos el objeto Scanner para leer los datos del usuario
     Scanner leer = new Scanner(System.in);
     //Solicitamos al usuario que ingrese la frase
     System.out.println("Ingrese su nombre");
     //Guardamos el dato en la variable  
     nombre = leer.next();
     //Cerramos el objeto Scanner
     leer.close();
     //Llamamos a la funcion  
     saludopersonalizado(nombre);
    }
    public static void saludopersonalizado(String nombre){
        System.out.println("Hola, tu nombre es "+nombre);
    }

}
