enum Dia 
{
    LUNES, MARTES, MIERCOLES
}

public class EjemploEnum 
{
    public static void main(String[] args) 
	{
        // Enum se usa para definir un conjunto fijo de constantes.
        Dia hoy = Dia.LUNES;
        System.out.print("Hoy es: " + hoy);
    }
}
