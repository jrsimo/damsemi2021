/*
 * Ejercicios Unidad 3: Arrays y cadenas
 *
 * Solución profesor
 *
 * Fecha: 16/02/21
 *
 * Lugar: CIPFP Cheste
 *
 */

import java.util.Scanner;

public class Ejercicio411
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dame frase: ");
        String frase = teclado.nextLine();

        // Guardo en un array las palabras por separado...
        String[] palabras = frase.split(" ");

        // Muestro la frase al revés...
        System.out.println("La frase al revés es... ");
        for (int i = palabras.length-1; i >= 0; i--)
            System.out.print(palabras[i] + " ");
    }
}
