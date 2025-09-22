import java.util.Set;
import java.util.HashSet;

public class EjemploSet 
{
    public static void main(String[] args) 
	{
        // Set guarda elementos únicos (sin repetidos)
        Set<String> colores = new HashSet<>();
        colores.add("Rojo");
        colores.add("Rojo"); // duplicado, se ignora
        System.out.print("Cantidad de colores: " + colores.size());
    }
}
