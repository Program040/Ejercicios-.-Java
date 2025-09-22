class Animal 
{
    // Una clase define atributos y comportamientos personalizados.
    String tipo = "Perro";
}

public class EjemploClase 
{
    public static void main(String[] args) 
	{
        Animal miAnimal = new Animal();
        System.out.print("Tipo de animal: " + miAnimal.tipo);
    }
}
