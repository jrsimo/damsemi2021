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

public class Ejercicio46
{
    public static void main(String[] args)
    {
        int[][] matriz = new int[3][3];

        int num = 1;
        for(int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
            {
                matriz[i][j] = num;
                num++;
            }

        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }
    }
}
