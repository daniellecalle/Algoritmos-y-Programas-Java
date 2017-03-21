import java.util.*;

public class SerieNumeros
{

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int n, sw;

		System.out.print("Digite 1. Ingresar " + "\t" +"Otro: Numero para salir" +"\t :");
		sw=sc.nextInt();

		while(sw==1)
		{
			System.out.print("Digite Cantidad de Numerios: ");
			n=sc.nextInt();
			proceso(n);
			System.out.print("Desea continuar 1. Ingresar " + "\t" + " Otro: Numero para salir " +" \t :");
			sw=sc.nextInt();
		}
		
	}	

	public static void proceso(int n)
	{
		int cont=0, acum=0, prom;

		for(int i=1; i<=n; i++)
		{
			cont+=1;
			System.out.print(i);
			acum=acum+i;	
		}
		
		//prom = acum/cont;
		prom=calcularPromedio(cont, acum);
		imprimir(acum, prom);
	}

	public static int calcularPromedio(int c, int suma)
	{
		return (suma/c);
	}

	public static void imprimir(int acum, int prom)
	{
		System.out.println("La Suma es \t :" +acum);
		System.out.println("El Promedio es \t :" +prom);
	}
}