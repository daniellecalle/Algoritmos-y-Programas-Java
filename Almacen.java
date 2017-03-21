import java.util.*;

public class Almacen {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double precioCompra = 0;
		String pago="";	
		//leerDatos(precioCompra, pago);
		System.out.print("Digite Precio de Compra: ");
		precioCompra = sc.nextDouble();
		System.out.print("Digite Tipo de pago 1=Efectivo, "
				+ "2=Tarjeta de credito : ");
		pago = sc.next();
		proceso(precioCompra, pago);
	}
		
	public static void proceso(double pc, String pago)
	{
		double valorconD, des=0, total=0;
			
		if(pago!="1" && pago!="2")
		{
			System.out.println("Opcion Invalida!");
		}
		else
		{
			if(pc<=100000)
			{
				switch (pago)
				{
					case "1":
						des = pc*(20/100);
						break;
						
					case "2": 
						des=pc*(10/100);
						break;
				}
				
			}
			else
			{
				if(pc<=200000)
				{
					switch (pago) 
					{
						case "1":
							des = pc*(30/100);
							break;							
						case "2": 
							des=pc*(15/100);
							break;	
					}
				}
				else
				{
					switch (pago) 
					{
						case "1":
							des = pc*(40/100);
							break;
							
						case "2": 
							des=pc*(20/100);
							break;
					}
				}
			}
		}
		
		valorconD=pc-des;
		total = pc+valorconD;
		Imprimir(pc, valorconD, total);
	}
	
	public static void Imprimir(double precioCompra, double valorDes, double total)
	{
		System.out.print("\nPrecio de compra............. :" +precioCompra);
		System.out.print("\nValor del Descuento.......... :" +valorDes);
		System.out.print("\nTotal apagar................. :" +total);
	}
	
	

}
