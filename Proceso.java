import java.util.*;

public class Proceso
{

	public static Scanner sc = new Scanner(System.in);

	static double peso, estatura;

	public static void leerDatos()
	{
		System.out.print("Digite Peso (Kg.) \t :");
		peso=sc.nextDouble();
		System.out.print("Digite estatura (Mts.) \t :");
		estatura=sc.nextDouble();
	}

	public static double calcularImc()
	{
		return peso/(Math.pow(estatura, 2));
	}

	public static void validar()
	{
		double imc = calcularImc();

		if(imc<=18.49)
		{
			System.out.print("Clasificacion: Bajo peso");
		}
		else
		{
			if(imc<16.00)
			{
				System.out.print("Delgadez severa");
			}
			else
			{
				if(imc<=16.99)
				{
					System.out.print("Delgadez Moderada");
				}
				else
				{
					System.out.print("Delgadez Leve");
				}
			}
		}
		else
		{
			if(imc<=24.99)
			{
				System.out.print("Clasificacion: Normal");
			}
			else
			{
				if(imc<18.5)
				{
					System.out.print("Normal");
				}
			}
		}
		else
		{
			if (imc<=29.99) 
			{
				System.out.print("Clasificacion: Sobrepeso");
			}
			else
			{
				if(imc<25.00)
				{
					System.out.print("Clasificacion: preobreso");
				}
			}
		}
		else
		{
			if(imc>=40.00)
			{
				System.out.print("Clasificacion: Obesidad");
			}
			else
			{
				if(imc<=34.99)
				{
					System.out.print("Obesidad leve");
				}
				else
				{
					if(imc<=39.99)
					{
						System.out.print("Obesidad Media");
					}
					else
					{
						System.out.print("Obesidad morbida");
					}
				}
			}
		}

	}

}