import java.util.*;

public class Estudiantes
{
	public static Scanner sc = new Scanner(System.in);
	static String nombre, nroDoc;
	static double nota;

	public static void leerDatos(int i)
	{
		System.out.print("Digite nombre \t "+i+ " :");
		nombre=sc.next();
		System.out.print("Digite ID \t " +i+ " :");
		nroDoc=sc.next();
		System.out.print("Digite  Nota Final : " +i+ " :");
		nota=sc.nextDouble();
	}

	public static void calcular(int n)
	{
		int  contA=0, contR=0, contH=0, acum1=0;
		double porc, notapromdA;//variables(espacion de direccion de memoria), Como Numerico (Real)

		for(int i=1; i<=n; i++)
		{
			leerDatos(i);

			if(nota>=3)
			{
				System.out.print("Nombre del Estudiante " +nombre+ " Aprobo ! \n");
				contA+=1;
				acum1+=nota;
			}
			else
			{		
				System.out.print("N°. Documento " +nroDoc+ " Reprobo ! \n");
				contR+=1;

				if(nota>=2)
				{
					contH+=1;
				}
			}
		}

		//porc=(contR*100)/n;
		//notapromdA=acum1/contA;
		porc = calcularPorcentajeAprobados(n, contR);
		notapromdA = calcularNotaPromd(acum1, contA);
		imprimir(porc, contH, notapromdA);
	}

	public static double calcularPorcentajeAprobados(int n, int contR)
	{
		double p = (contR*100)/n;

		return p;
	}

	public static double calcularNotaPromd(int acum1, int contA)
	{
		double nprom=acum1/contA;

		return nprom;
	}


	public static void imprimir(double porc, double contH, double notapromdA)
	{
		System.out.println("Porcetaje de Estudiante Reprobados\t :" +porc);
		System.out.println("N° Estudiantes que habilitan \t :" +contH);
		System.out.println("Nota Promedio de los aprobados \t :" +notapromdA);
	}
}