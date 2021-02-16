import java.util.Scanner;
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

public class Ejercicio48
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        // Obtengo el nombre del usuario...
        System.out.print("Dame nombre: ");
        String nombre = teclado.nextLine();

        // Muestro la el nombre separado por espacios con charAt...
        for (int i = 0; i < nombre.length(); i++)
            System.out.print(nombre.charAt(i) + " ");
    }
}
