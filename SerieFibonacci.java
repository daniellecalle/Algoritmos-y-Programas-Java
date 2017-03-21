import java.util.*;

public class SerieFibonacci
{

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int n, sw;

		System.out.print("Digite 1. Ingresar " + "\t" +"Otro: Numero para salir" +"\t :");
		sw=sc.nextInt();

		while(sw==1)
		{
			System.out.print("Digite Numero \t :");
			n=sc.nextInt();
			fibo(n);
			System.out.print("Desea continuar 1. Ingresar " + "\t" + " Otro: Numero para salir " +" \t :");
			sw=sc.nextInt();
		}
		
	}

	public static void fibo(int n)
	{
		double  a=0, b=1, c;

		System.out.printf("%10.0f", a);
		System.out.printf("%10.0f", b);

		for(int i=3; i<=n; i++)
		{
			c=a+b;
			System.out.printf("%10.0f", c);
			System.out.print("");
			a=b;
			b=c;
		}


	}

	
}