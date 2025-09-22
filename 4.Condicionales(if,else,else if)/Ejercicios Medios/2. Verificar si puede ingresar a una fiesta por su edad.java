
import java.util.Scanner;

public class EntradaFiesta
{
  public static void main(String[] args) 
  {
    Scanner entrada = new Scanner(System.in);

    int edad = 0;

    System.out.print("Ingrese su edad: ");
    edad = entrada.nextInt();

    if(edad >= 18)
    {
      System.out.println("Puede entrar a la fiesta");
    }
    else
    {
      System.out.println("No puede entrar a la fiesta");
    }
  }
}
