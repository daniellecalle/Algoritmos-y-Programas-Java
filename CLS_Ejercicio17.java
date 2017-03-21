

import java.util.*;

public class CLS_Ejercicio17
{

	public static Scanner sc = new Scanner(System.in);//Declaramos un objecto de clase Scanner 

	static int cantidad, ciudad, sw=1;//Atributos de nuestra clase Numerico Entero

	static String nombre; //Atributo tipo String nombre

	public static void main(String[] gs) 
	{
		int c=0;
		System.out.print("Desea continuar 1. Ingresar " + "\t" +"Otro: Numero para salir" +"\t :");
		sw=sc.nextInt();

		while(sw==1)
		{
			leerDatos();
			proceso();					
			System.out.print("Desea continuar 1. Ingresar " + "\t" + " Otro: Numero para salir " +" \t :");
			sw=sc.nextInt();
			c+=1;
		}
		System.out.println("N° Veces ingreado: " +c);
		
	}

	public static void leerDatos()
	{
		System.out.print("Digite Nombre cliente: ");
		nombre=sc.next();
		System.out.print("Digite 1=Bogata, 2=cali, 3=Pasto: ");
		ciudad=sc.nextInt();
		System.out.print("Digite cantidad de toneladas a transportar: ");
		cantidad=sc.nextInt();
	}

	public static void proceso()
	{
		double costo, valor=0;//declara las variables locales. costo y valor y al valor la inicialzia en cero.

		switch(ciudad)//En caso de(la variable a comparar en algun caso.)
		{
			case 1://Caso 1 
				valor = 25;//LE lleva el resultado asignado ala variable valor.
				break;//cierra caso 1
			case 2://caso 2
				valor = 60;//LE lleva el resultado asignado ala variable valor.
				break;//cierra caso 2
			case 3://caso 3
				valor = 105;//LE lleva el resultado asignado ala variable valor.
				break;//cierra caso 3
			default:
				System.out.print("Opcion invalida!" +"\n");		
		}

		costo = cantidad * valor;
		validar(costo, valor);
	}

	public static void validar(double valorBruto, double valor)
	{
		double des=0, total;

		if(cantidad <= 10)
		{
			des = valorBruto*(5/100);
		}
		else
		{
			des = (cantidad - 10)*valor*(15/100);
		}

		total = calcularTotalApagar(valorBruto, des);
		mostrar(des, total, valorBruto);
	}

	public static double calcularTotalApagar(double valorBruto, double des)
	{
		return valorBruto - des;
	}

	public static void mostrar(double descuento, double totalApagar, double valorBruto)
	{
		String destino="";

		switch(ciudad)
		{
			case 1:
				destino="Bogota";
				break;
			case 2:
				destino="Cali";
				break;
			case 3:
				destino="Pasto";
				break;			
		}

		System.out.println("Cliente:...................\t " +nombre);
		System.out.println("Cidad destino:.............\t " +destino);
		System.out.println("toneladas transportadas:...\t " +cantidad);
		System.out.println("Valor valor Bruto:.........\t " +valorBruto);
		System.out.println("Descuento:.................\t " +descuento);
		System.out.println("Total total Apagar:........\t " +totalApagar);

	}                                    

}