import java.util.*;

/**
Esta clase Se encarga de la logica de cacular y resolver las raices de una ecuacin de segundo grado, 
y determinar si es real o imaginaria
**/

public class EcuacionCuadratica
{
	public static Scanner sc = new Scanner(System.in);//Declaramos un objecto de clase Scanner 

	public static double a, b, c;//Declaro a, b y c como Numerico(real) y las defino globales para la clase con modificador de acceso publico

	public static void main(String[] args) 
	{	
		leerDatos();
		calcular();
		validar();
					
	}

	public static void leerDatos()
	{
		System.out.print("Digite Primer coeficiente: ");
		a=sc.nextDouble();//se almacena el valor real tipeado por elsuarios apartir de un dispositivo de Salida, 
							//y se introducce e la direcciond de memoria de la variable a
		System.out.print("Digite Segundo coeficiente: ");
		b=sc.nextDouble();
		System.out.print("Digite Tercer coeficiente: ");
		c=sc.nextDouble();		
	}

	public static double calcular()
	{
		//double d;//definimos y declaramos como Numerico(real) Double en java la varible local d, que tendra acceso o esta vigente dentro de este metodo

		//d = (Math.pow(b, 2))-4*a*c;//Realizamos el calculo pertidente para hallar el descriminante y se lo asigamos el valor Unico ala variable d

		//return d;//Retornamos el valor de la operacion u calculo que esta alaceman en d

		return (Math.pow(b, 2))-4*a*c;
	}

	public static void validar()
	{
		double d, x1, x2;
		
		d = calcular();

		if(d<0)
		{
			System.out.print("Error!. La raiz es compleja Imaginaria!");
		}
		else
		{
			if(d==0)
			{
				x1=-b/(2*a);
				x2=x1;
				System.out.print(x1+ " , " +x2);
			}
			else
			{
				x1=(-b + ((Math.sqrt(d)))/(2 * a));
				x2=(-b - ((Math.sqrt(d)))/(2 * a));
				System.out.print("Raiz Si tiene solucion en los reales!\n");	
				System.out.println("Raiz 1: " +x1+"\t"+"Raiz 2: "+x2);
			}
		}
		
	}

}