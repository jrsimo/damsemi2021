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

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio45
{
    public static void main(String[] args)
    {
        final int TAMANYO = 10; // El usuario introduce 10 enteros

        int[] numerosMitadInferior = new int[TAMANYO/2];
        int[] numerosMitadSuperior = new int[TAMANYO/2];

        Scanner sc = new Scanner(System.in);

        // Guardo la primera mitad en un array
        for (int i = 0; i < numerosMitadInferior.length; i++)
        {
            System.out.print("Dame un número: ");
            numerosMitadInferior[i] = sc.nextInt();
        }

        // Guardo la segunda mitad en otro array
        for (int i = 0; i < numerosMitadSuperior.length; i++)
        {
            System.out.print("Dame un número: ");
            numerosMitadSuperior[i] = sc.nextInt();
        }

        // Uso del método Arrays.equals(array1, array2)
        if (Arrays.equals(numerosMitadInferior, numerosMitadSuperior))
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
    }
}
