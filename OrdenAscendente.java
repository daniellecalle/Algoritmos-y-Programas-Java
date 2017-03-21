import java.util.*;

public class OrdenAscendente
{
	
	public static Scanner sc = new Scanner(System.in);

	static int  n1, n2, n3;

	public static void main(String[] args) 
	{
		
		int sw=1;

		System.out.print("Desea continuar 1. Ingresar " + "\t" +"Otro: Numero para salir" +"\t :");
		sw=sc.nextInt();

		while(sw==1)
		{				
			leerDatos();
			validar();
			System.out.print("Desea continuar 1. Ingresar " + "\t" +"Otro: Numero para salir" +"\t :");
			sw=sc.nextInt();
		}

	}

	public static void leerDatos()
	{
		System.out.print("Digite Primer Numero: ");
		n1=sc.nextInt();
		System.out.print("Digite Segundo coeficiente: ");
		n2=sc.nextInt();
		System.out.print("Digite Tercer coeficiente: ");
		n3=sc.nextInt();
	}

	public static void validar()
	{
		if(n1>n2&&n1>n3)
		{
			System.out.print(n1 + " , " + n3+ " , " + n2);
		}
		else
		{
			if(n2>n1&&n2>n3)
			{
				System.out.print(n2 + " , " + n1 + " , " + n3);
			}
			else
			{
				System.out.print(n3 + " , " + n2 + " , " + n1);
			}
		}
	}

}