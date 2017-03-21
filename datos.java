import java.util.*;


public class datos
{

	public static String tipo="";
	public static int duracion;
	public static Scanner sc = new Scanner(System.in);
	
	public static void leerDatos()
	{
		System.out.print("Digite duracion de llamada: ");
		duracion=sc.nextInt();
		System.out.print("Digite 1=Local, 2=nacional, 3=Internacional: ");
		tipo=sc.next();
	}

	public static void proceso()
	{
		double valor=0, costo;

		switch(tipo)
		{
			case "1":
				valor=100;
				break;
			case "2":
				valor=250;
				break;
			case "3":
				valor=400;
				break;
			default:
				System.out.print("Opcion Invalida");			
		}

		costo = duracion*valor;
		
		validar(costo);
	}

	public static void validar(double costo)
	{
		double des=0;

		switch(tipo)
		{
			case "2":
				if(duracion>20)
				{
					des=costo*(20/100);
				}
				break;
			case "3":
				if(duracion>30)
				{
					des=costo*(35/100);
				}
				break;			
		}
		
		/**
		if(tipo.equalsIgnoreCase("2") && duracion>20)
		{
			des = costo*(20/100);
		}


		if(tipo.equalsIgnoreCase("2") && duracion>20)
		{
			des = costo*(30/100);
		}	
		**/

		mostrar(costo, des);
	}

	public static void mostrar(double costo, double des)
	{
		System.out.print("Valor costo.......... :" +costo+"\n");
		System.out.println("---------------------");
		System.out.println("descuento.............:" +des);
	}

}´´´+´+´+,.,.,m,