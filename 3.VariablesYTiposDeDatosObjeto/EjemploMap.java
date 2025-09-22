import java.util.Map;
import java.util.HashMap;

public class EjemploMap 
{
    public static void main(String[] args) 
	{
        // Map guarda pares clave-valor
        Map<String, String> paises = new HashMap<>();
        paises.put("CO", "Colombia");
        System.out.print("País: " + paises.get("CO"));
    }
}
