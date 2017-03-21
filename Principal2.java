import java.util.*;

/**
Descripcion: Resolver La Ec. Cuadratica ax^2+bx+c=0 y hallar sus raices 
Autor: Daniel posada calle
Fecha: 14-03-2017
**/

public class Principal2
{

	public static Scanner sc = new Scanner(System.in);

	static int sw = 1;

	public static EcuacionCuadratica ec = new EcuacionCuadratica();//Declaramos un objecto o instalacia de Clase datos


	public static void main(String[] args) 
	{
		System.out.print("Desea continuar 1. Ingresar " + "\t" +"Otro: Numero para salir" +"\t :");
		sw=sc.nextInt();

		while(sw==1)
		{
			ec.leerDatos();
			ec.calcular();	
			ec.validar();
			System.out.print("Desea continuar 1. Ingresar " + "\t" + " Otro: Numero para salir " +" \t :");
			sw=sc.nextInt();
		}
	}	
}