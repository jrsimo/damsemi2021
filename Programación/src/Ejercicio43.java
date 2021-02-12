import java.util.Scanner;

public class Ejercicio43
{
    public static void main(String[] args)
    {
        int[] numeros = new int[4];

        Scanner sc = new Scanner(System.in);

        // Guardo datos introducidos en array
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print("Dame un número: ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0]; // indico que el primero es el mayor
        for (int i = 1; i < numeros.length; i++)
        {
           if (numeros[i] > mayor)
               mayor = numeros[i];
        }

        System.out.println("El mayor es: " + mayor);
    }
}
