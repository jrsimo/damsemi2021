import java.util.Scanner;

public class Ejercicio47
{
    public static void main(String[] args)
    {
        final int NALUMNOS = 2;
        final int NASIGNATURAS = 2;

        float[][] notas = new float[NALUMNOS][NASIGNATURAS];

        Scanner sc = new Scanner(System.in);

        for(int alumno = 0; alumno < NALUMNOS; alumno++)
        {
            System.out.println("Introduce las notas del alumno " + (alumno+1) + ":");
            for(int asignatura = 0; asignatura < NASIGNATURAS; asignatura++)
            {
                System.out.print("Nota asignatura " + (asignatura+1) + ": ");
                notas[alumno][asignatura] = sc.nextFloat();
            }
            System.out.println("Fin notas alumno " + (alumno+1));
            System.out.println("-----------------");
        }

        float[] notasMinimas = new float[NALUMNOS];
        for(int alumno = 0; alumno < NALUMNOS; alumno++)
        {
            notasMinimas[alumno] = notas[alumno][0];
            for(int asignatura = 0; asignatura < NASIGNATURAS; asignatura++)
            {
                if (notas[alumno][asignatura] < notasMinimas[alumno])
                    notasMinimas[alumno] = notas[alumno][asignatura];
            }
        }

        float[] notasMaximas = new float[NALUMNOS];
        for(int alumno = 0; alumno < NALUMNOS; alumno++)
        {
            notasMaximas[alumno] = notas[alumno][0];
            for(int asignatura = 0; asignatura < NASIGNATURAS; asignatura++)
            {
                if (notas[alumno][asignatura] > notasMaximas[alumno])
                    notasMaximas[alumno] = notas[alumno][asignatura];
            }
        }






        // Calculo nota media
        float[] notasMedias = new float[NALUMNOS];
        for(int alumno = 0; alumno < NALUMNOS; alumno++)
        {
            int suma = 0;
            for(int asignatura = 0; asignatura < NASIGNATURAS; asignatura++)
            {
                suma += notas[alumno][asignatura];
            }
            notasMedias[alumno]= (float)suma / NASIGNATURAS;
        }

        for(int alumno = 0; alumno < NALUMNOS; alumno++)
        {
            System.out.println("\nNOTAS ALUMNO " + (alumno+1) + ": ");
            System.out.println("Nota máxima alumno " + (alumno+1) + ": " + notasMaximas[alumno]);
            System.out.println("Nota mínima alumno " + (alumno+1) + ": " + notasMinimas[alumno]);
            System.out.println("Nota media alumno " + (alumno+1) + ": " + notasMedias[alumno]);
        }
    }
}
