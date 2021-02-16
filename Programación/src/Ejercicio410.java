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

public class Ejercicio410
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        String[] frases = new String[2];

        // Introducir frases en el array
        for (int i = 0; i < frases.length; i++)
        {
            System.out.print("Dame frase: ");
            frases[i] = teclado.nextLine();
        }

        String cadenaBuscada;
        boolean esFin = false; // centinela fin bucle

        // Buscar si una cadena esta en alguna de las frases introducidas
        do
        {
            System.out.print("Dame cadena a buscar: ");
            cadenaBuscada = teclado.nextLine();
            esFin = cadenaBuscada.equals("fin");

            if (esFin)
                System.out.println("Fin del programa");
            else
            {
                for (String frase : frases)
                {
                    int posCadena = frase.indexOf(cadenaBuscada);
                    if (posCadena >= 0)
                        System.out.println("El texto " + cadenaBuscada + " está en " +
                                "\"" + frase + "\"" + " en la posición " + posCadena);
                    else
                        System.out.println("El texto " + cadenaBuscada + " no está en " +
                                "\"" + frase + "\"");
                }
            }
        }
        while(!esFin);
    }
}
