/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author maroc
 */
public class Ejercicio10JavaGuia7Forv2 {
  

    public static void main(String[] args) {
        int numeros;
        String asteriscos = "";
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            do {
                System.out.println("Ingrese un numero (comprendidos entre 1 y 20)");
                numeros = leer.nextInt();

                if (numeros < 1 || numeros > 20) {
                    System.out.println("Número fuera de rango. Por favor, introduzca un número entre 1 y 20.");
                }
            } while (numeros < 1 || numeros > 20);

            asteriscos += numeros + " ";

            for (int j = 0; j < numeros; j++) {
                asteriscos += "*";
            }

            asteriscos += "\n"; // Añadir salto de línea para la siguiente línea
        }

        leer.close();

        // Imprimir todo al final
        System.out.println(asteriscos);
    }
}

