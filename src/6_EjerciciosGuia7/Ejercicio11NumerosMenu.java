package EjerciciosGuia7;

import java.util.Scanner;

public class Ejercicio11NumerosMenu {
/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

    MENU
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Salir
    Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú. /*
*/    
    public static void main (String[]args){ 
     //Definimos las variables 
     double num1, num2; 
     int opcion;
     boolean continuar = true;
     char confirmar;
     //Creamos el objeto Scanner para leer los datos del usuario
     Scanner leer = new Scanner(System.in);
     //Solicitamos dos numeros
      System.out.println("Ingresa dos numeros positivos");
      num1 = leer.nextDouble();
      num2 = leer.nextDouble();
      //utilizamos un bucle que solo se rompa cuando el usuario selecciona la opción 5 y confirma que desea salir
       while (continuar){ 
       //Solicitamos que que eliga una opcion del menu 
        System.out.println("Seleccione la operacion que desea realizar del siguiente Menú:\n Menu \n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
        //Guardamos el valor ingresado en la variable mediante Scanner
        opcion = leer.nextInt();
        //Evaluamos los operaciones con un bloque switch
        switch (opcion){
            case 1:
                double resultado1 = calcularSuma(num1,num2);
                System.out.println("La suma de los dos numeros es :"+resultado1);
                break;
            case 2:
                double resultado2 = calcularResta(num1,num2);
                System.out.println("La resta de los dos numeros es :"+resultado2);
                break;
            case 3:
                double resultado3 = calcularMultiplicacion(num1,num2);
                System.out.println("La multiplicación de los dos numeros es :"+resultado3);
                break;
            case 4:
                double resultado4 = calcularDivision(num1,num2);
                System.out.println("La división de los dos numeros es :"+resultado4);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        confirmar = leer.next().charAt(0);// Leer el primer carácter de la entrada
                        if (confirmar == 'S' || confirmar =='s'){
                        continuar = false;
                }
                break;
            default:
                System.out.println("Opcion invalida");          
                break;
        } 
    }
       // Cerramos el objeto para evitar problemas de memoria
        leer.close();
}
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static double calcularSuma(double num1, double num2) {        
        // Función para calcular la suma
        double suma = num1+num2;
        //Retornamos la variable
        return suma;     
    }
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------//   

//---------------------------------------FUNCION--2----------------------------------------------------------------------//     
    public static double calcularResta(double num1, double num2) {        
        // Función para calcular la resta
        double resta = num1-num2;
        //Retornamos la variable
        return resta;     
    }
//-----------------------------------TERMINA--LA--FUNCION--2------------------------------------------------------------//
//---------------------------------------FUNCION--3----------------------------------------------------------------------//     
    public static double calcularMultiplicacion(double num1, double num2) {        
        // Función para calcular la multiplicacion
        double multiplicacion = num1*num2;
        //Retornamos la variable
        return multiplicacion;     
    }
//-----------------------------------TERMINA--LA--FUNCION--3------------------------------------------------------------//
//---------------------------------------FUNCION--3----------------------------------------------------------------------//     
    public static double calcularDivision(double num1, double num2) { 
        // Comprobamos si el divisor es cero
        if (num2 == 0){
            // Si es así, imprimimos un mensaje de error y retornamos 0
            System.out.println("Error: no se puede dividir entre cero");
            return 0;
        }
        // Si el divisor no es cero, realizamos y devolvemos el resultado de la división
        double division = num1/num2;
        return division;     
    }
//-----------------------------------TERMINA--LA--FUNCION--3------------------------------------------------------------//
}