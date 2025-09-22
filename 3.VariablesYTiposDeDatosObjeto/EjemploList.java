import java.util.List;
import java.util.ArrayList;

public class EjemploList 
{
    public static void main(String[] args) 
	{
        // List guarda varios elementos y se puede modificar
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        System.out.print("Nombre guardado: " + nombres.get(0));
    }
}
