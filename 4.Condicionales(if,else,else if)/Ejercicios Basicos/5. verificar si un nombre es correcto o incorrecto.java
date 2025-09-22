public class VerificarNombre 
{
    public static void main(String[] args) 
	{
        String nombreGuardado = "juan";
        String nombreIngresado = "juan";

        if (nombreIngresado == nombreGuardado) 
		{
            System.out.println("Nombre correcto");
        }
		else 
		{
            System.out.println("Nombre incorrecto");
        }
    }
}
