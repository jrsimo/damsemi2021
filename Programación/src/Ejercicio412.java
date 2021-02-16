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

public class Ejercicio412
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        // Obtengo los datos del usuario...
        System.out.print("Dame nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Dame 1er. apellido: ");
        String apellido1 = teclado.nextLine();

        System.out.print("Dame 2nd. apellido: ");
        String apellido2 = teclado.nextLine();

        // Concateno las 3 primeras letras de cada palabra...
        String texto = nombre.substring(0,3) + apellido1.substring(0,3) + apellido2.substring(0,3);

        // Muestro el texto pasándolo a mayúsculas
        System.out.println("El texto resultante es: " + texto.toUpperCase());

    }
}
