interface Vehiculo 
{
    // Una interfaz define métodos que deben ser implementados por otras clases.
    void arrancar();
}

class Carro implements Vehiculo 
{
    public void arrancar() 
	{
        System.out.print("El carro ha arrancado");
    }
}

public class EjemploInterface 
{
    public static void main(String[] args) 
	{
        Vehiculo miCarro = new Carro();
        miCarro.arrancar();
    }
}
