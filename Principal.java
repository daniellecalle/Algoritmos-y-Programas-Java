import java.util.*;

public class Principal
{

	public static Scanner sc = new Scanner(System.in);

	static int sw = 1;

	public static datos d = new datos();//Declaramos un objecto o instalacia de Clase datos


	public static void main(String[] args) 
	{

		System.out.print("Desea continuar 1. Ingresar " + "\t" +"Otro: Numero para salir" +"\t :");
		sw=sc.nextInt();

		while(sw==1)
		{
			d.leerDatos();//el objecto d invoca el metodo de la clase datos
			d.proceso();					
			System.out.print("Desea continuar 1. Ingresar " + "\t" + " Otro: Numero para salir " +" \t :");
			sw=sc.nextInt();
		}
		
	}	
}