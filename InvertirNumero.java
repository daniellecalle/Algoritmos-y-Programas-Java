import java.util.*;

public class InvertirNumero
{

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int num;

		System.out.print("Digite numero \t :");
		num=sc.nextInt(); 

		proceso(num);
	}

	public static void proceso(int n)
	{
		int digitosig;

		do
		{
			digitosig=n%10;
			System.out.print(digitosig);
			n=n/10;

		}while(n>0);
	}	
}