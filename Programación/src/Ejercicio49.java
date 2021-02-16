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

public class Ejercicio49
{
    public static void main(String[] args)
    {
        String nombre = "Hedy";
        String s1 = "";

        for(int i = 0; i < nombre.length(); i++)
            s1 = s1 + nombre.substring(i,i+1) + " ";

        // nombre = insertarEspacios(nombre);
        System.out.println(nombre);
    }
}
