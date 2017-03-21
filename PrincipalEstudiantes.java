import java.util.*;

public class PrincipalEstudiantes
{

	public static Scanner sc = new Scanner(System.in);

	public static Estudiantes e = new Estudiantes();//Declaramos un objecto o instalacia de Clase Estudiantes

	public static void main(String[] args) 
	{

		int n, sw=1, cont=0;

		System.out.print("Digite 1. Ingresar " + "\t" +"Otro: Numero para salir" +"\t :");
		sw=sc.nextInt();
		System.out.print("Digite cantidad de Estudiantes \t :");
		n=sc.nextInt();
		
		while(sw==1)
		{
			e.calcular(n);					
			System.out.print("Desea continuar 1. Ingresar " + "\t" + " Otro: Numero para salir " +" \t :");
			sw=sc.nextInt();
			cont++;
		}
		System.out.print("N° Veces ingresados\t :"+cont);
	}	
}