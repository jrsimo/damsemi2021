import java.util.Scanner;

public class Ejercicio41
{
    public static void main(String[] args)
    {
        short[] numeros = new short[6];

        Scanner sc = new Scanner(System.in);

        // Guardo datos introducidos en array
        for (int i = 0; i < 6; i++)
        {
            System.out.print("Dame un número: ");
            numeros[i] = sc.nextShort();
        }

        // Muestro datos de array de forma inversa
        for (int i = 5; i >= 0; i--)
        {
            System.out.println(numeros[i] + " ");
        }
    }
}
