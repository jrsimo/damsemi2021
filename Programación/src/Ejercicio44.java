/*
 * Ejercicios Unidad 3: Arrays y cadenas
 *
 * Solución profesor
 *
 * Fecha: 11/02/21
 *
 * Lugar: CIPFP Cheste
 *
 */

import java.util.Scanner;

public class Ejercicio44
{
    public static void main(String[] args)
    {
        final int TAMANYO = 10; // Así me aseguro que tengan el mismo tamaño

        int[] numeros = new int[TAMANYO];

        Scanner sc = new Scanner(System.in);

        // Guardo datos introducidos en array
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print("Dame un número: ");
            numeros[i] = sc.nextInt();
        }

        int[] numerosCopia = new int[TAMANYO]; // array copia
        for (int i = 0; i < numerosCopia.length; i++)
        {
            numerosCopia[i] = numeros[i];
        }

        // Muestro el array original
        System.out.print("Array original: ");
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print(numeros[i] + " ");
        }

        // Muestro el array copia
        System.out.print("\nArray copia: ");
        for (int i = 0; i < numerosCopia.length; i++)
        {
            System.out.print(numerosCopia[i] + " ");
        }
    }
}
