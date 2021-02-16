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

public class Ejercicio42
{
    public static void main(String[] args)
    {
        float[] numeros = new float[10];

        Scanner sc = new Scanner(System.in);

        // Guardo datos introducidos en array
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print("Dame un número: ");
            numeros[i] = sc.nextFloat();
        }

        int suma = 0;
        // Calculo media arimética
        for (int i = 0; i < numeros.length; i++)
        {
            suma += numeros[i];
        }

        float media = (float)suma / numeros.length;

        System.out.println("La media es: " + media);

    }
}
