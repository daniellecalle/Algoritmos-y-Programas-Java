import java.util.*;

public class CLS_Ejercicio014 {

	public static int N;
	public static String ciudad;
	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		leerDatos();
		proceso();
	}

	public static void leerDatos()
	{
		System.out.print("Digite Cantidad de toneladas Transportadas: ");
		N=sc.nextInt();
		System.out.print("Digite 1=Boston, 2=Angeles: ");
		ciudad=sc.next();
	}
	
	public static void proceso()
	{
		double vrton = 0, costo;
		
		switch(ciudad)
		{
			case "1":
				vrton=75;
				break;
			case "2":
				vrton=35;
				break;
			default:
				System.out.print("Opcion Invalida");
		}
		
		if(N<=10)
		{
			costo = N*vrton;
		}
		else
		{
			costo = (N-10)*vrton;
		}
		
		Imprimir(costo);
	}
	
	public static void Imprimir(double costo)
	{
		System.out.print("Costo de la Llamada es.........." +costo);
	}

}
