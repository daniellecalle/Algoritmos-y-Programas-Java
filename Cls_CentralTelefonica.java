import java.util.*;

public class Cls_CentralTelefonica {
	
	public static Scanner sc = new Scanner(System.in);
	static Calendar hora = new GregorianCalendar();
	
	public static void main(String[] args) 
	{
		int duracionMin = 0, tipo;
		double costo = 0, precioC=0;
		//double valorApagar=0;
		
		//leerDatos(duracionMin, costo, tipo);
		System.out.print("Digite Tipo de Llamada 1=Internacional, "
				+ "2=Nacional : ");
		tipo = sc.nextInt();
		System.out.print("Digite valor del costo del Minuto: ");
		costo = sc.nextDouble();
		System.out.print("Digite Duracion de la llamda minutos: ");
		duracionMin = sc.nextInt();	
		
		precioC = calcularCosto(duracionMin,costo);
		//valorApagar=calcularValor(precioC, tipo);
		System.out.println("Valor apagar.......... : " +calcularValor(precioC, tipo));
	}
	
	
	public static double calcularCosto(int duracionMin, double costo)
	{
		return duracionMin*costo;
	}
	
	public static double calcularValor(double pc, int tipo)
	{
		double des=0, valorApagar=0;
		
		int hora=obtenerHora();
		
		switch (tipo) {
			case 1:
				if(hora>=6 && hora<=12)
				{
					des = pc*(20/100);
				}
				break;
			case 2:
				if(hora>=9 && hora<=10)
				{
					des=pc*(10/100);
				}
				break;
			default:
				System.out.print("Opcion Invalida!");
				break;
		}

		valorApagar= pc-des;

		return valorApagar;//Return es una funcion que me devuelve el valor o resultado asociado a al operacion el metodo tener en encabezado tipo de dato a devolver
	}
	
	public static int obtenerHora()
	{
		
		return hora.get(Calendar.HOUR);
	}
	
	

}
