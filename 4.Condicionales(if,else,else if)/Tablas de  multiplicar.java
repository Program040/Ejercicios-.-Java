import java.util.Scanner;
public class TablasMultiplicar
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n   ===============================");
        System.out.println("         B I E N V E N I D O ");
        System.out.println("     A LAS TABLAS DE MULTIPLICAR ");
        System.out.println("   ===============================\n");


        int tabla;
        String nombre;

        System.out.print("¿Cual es su nombre?:   ");
        nombre = entrada.nextLine();

        System.out.print("Que tabla desea ver?:   ");
        tabla = entrada.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
        System.out.print("\nFin del programa   "+nombre);
    }
}

