package EjerciciosGuia7;

import java.util.Scanner;

public class Ejercicio12ProgramaSR232 {
/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().                           */
    
    public static void main (String[]args){
        //Definimos las variables
        String secuencia, secuenciaFDE ="&&&&&";
        int contCorrecto=0, contIncorrecto=0;
        boolean continuar= true;
        //Creamos el objeto Scanner
        Scanner leer = new Scanner(System.in);
        //solicitamos al usuario que ingrese la cadena
        System.out.println("Ingresa la cadena:\nLas cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O. ");
        while (continuar) {
            secuencia = leer.next();
            if (secuencia.equals(secuenciaFDE)) {
                break;
            } 
            else if (validarCadena(secuencia)) {
                contCorrecto++;
            }
            else {
                contIncorrecto++;
            }
        }
        System.out.println("Informe de secuencias");
        System.out.println("El numero de secuencias correctas es: "+contCorrecto);
        System.out.println("El numero de secuencias incocorrectas es: "+contIncorrecto);
    }
//---------------------------------------FUNCION--1----------------------------------------------------------------------//     
    public static boolean validarCadena(String secuencia) {     
        // Función para validar si la secuencia es correcta o incorrecta
        boolean resultado = secuencia.length() <=5 &&secuencia.startsWith("X")&&secuencia.endsWith("O");
        //Retornamos la variable
        return resultado;
    }
}     
//-----------------------------------TERMINA--LA--FUNCION--1------------------------------------------------------------// 
   
