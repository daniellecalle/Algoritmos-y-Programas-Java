import java.util.*;

public class ClS_Ejercicio03
{

	public static Scanner sc = new Scanner(System.in);
	static String nom1, nom2, nom3;
	static double a, b, c;
	static int sw=1;

	public static void main(String[] args) 
	{	
		System.out.print("Desea c ontinuar 1. Ingresar " + "\t" +"Otro: Numero para salir" +"\t :");
		sw=sc.nextInt();

		while(sw==1)
		{

			leerDatos();
			validar();
					
			System.out.println("Desea continuar 1. Ingresar " + "\t" + " Otro: Numero para salir " +" \t :");
			sw=sc.nextInt();
		}
		
	}

	public static void leerDatos()
	{
		System.out.print("Digite Nombre del primer competidor: ");
		nom1=sc.next();
		System.out.print("Digite Nombre del Segundo competidor: ");
		nom2=sc.next();
		System.out.print("Digite Nombre del competidor competidor: ");
		nom3=sc.next();
		//Lecutura de datos de los tiempos 
		System.out.print("Digite Tiempo del primer competidor: ");
		a=sc.nextInt();
		System.out.print("Digite Tiempo del Segundo competidor: ");
		b=sc.nextInt();
		System.out.print("Digite Tiempo del Tercer competidor: ");
		c=sc.nextInt();
	}

	public static void validar()
	{
		String ganador="";

		if(a>b&&a>c)
		{
			ganador=nom1;
		}
		else
		{
			if(b>a && b>c)
			{
				ganador=nom2;
			}
			else
			{
				ganador=nom3;
			}
		}

		System.out.print("El ganador es: " +ganador+"\n");

	}		
}