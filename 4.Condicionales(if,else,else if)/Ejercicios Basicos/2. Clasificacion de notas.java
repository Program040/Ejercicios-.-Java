public class NotaEvaluacion 
{
    public static void main(String[] args) 
	{
        int nota = 75;

        if (nota >= 90) 
		{
            System.out.println("Excelente");
        }
		else if (nota >= 80) 
		{
            System.out.println("Sobresaliente");
        } 
		else if (nota >= 70) 
		{
            System.out.println("Aprobado");
        }
		else 
		{
            System.out.println("Reprobado");
        }
    }
}
