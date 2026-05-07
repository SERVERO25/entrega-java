package ejercicios_teams;
import java.util.Scanner;
public class Switch_case_Minimercado {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		//=========== Switch case Minimercado ============
		//----------- variables propias ------------
		double total = 0;
		boolean desc = false;
		boolean error = false;
		//----------- Datos de entrada ------------
		System.out.println("introduzca el día de la semana");
		String dia = Scanner.nextLine();
		
		System.out.println("introduzca el tipo producto llevará");
		String prod = Scanner.nextLine();
		
		System.out.println("Indroduzca el precio del producto");
		int prec = Scanner.nextInt();
		
		total = prec;
		
		switch(dia)
		{
		case "lunes":
			if(prod.equals("fruver")) {
				total = prec * 0.7;
				desc = true;
				System.out.println("a su compra se le aplico un descuento del 30% ");
			}
			break;
		case "martes":
			if(prod.equals("carnes")) {
				total = prec * 0.7;
				desc = true;
				System.out.println("a su compra se le aplico un descuento del 30%");
			}
			break;
		case "miércoles":
			if(prod.equals("fruver")) {
				total = prec - (prec * 0.10);
				desc = true;
				System.out.println("a su compra se le aplico un descuento del 10% ");
			}else if(prod.equals("carnes")){
				total = prec - (prec * 0.15);
				desc = true;
				System.out.println("a su compra se le aplico un descuento del 15% ");
			}else if(prod.equals("vinos")){
				total = prec - (prec * 0.05);
				desc = true;
				System.out.println("a su compra se le aplico un descuento del 5% ");
			}else {
				error = true;
				System.out.println("Hubo un error, intentelo de nuevo");
			}
			break;
		case "jueves":
			if(prod.equals("vinos")){
				total = prec * 0.7;
				desc = true;
				System.out.println("a su compra se le aplico un descuento del 30%");
			}
			break;
		case "viernes":
			if(prod.equals("fruver")) {
				total = prec - (prec * 0.10);
				desc = true;
				System.out.println("a su compra se le aplico un descuento del 10% ");
			}else if(prod.equals("carnes")){
				total = prec - (prec * 0.05);
				desc = true;
				System.out.println("a su compra se le aplico un descuento del 5% ");
			}else if(prod.equals("vinos")){
				total = prec - (prec * 0.15);
				desc = true;
				System.out.println("a su compra se le aplico un descuento del 15% ");
			}else {
				error = true;
				System.out.println("Hubo un error, intentelo de nuevo");
			}
			break;
		default:
			error = true;
			System.out.println("ERROR 404");
		}
		if(error == false) {
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("                      -- Minimercado --                        ");
			System.out.println("              cada dia un descuento diferente                  ");
			System.out.println("_______________________________________________________________");
			System.out.println("                                                               ");
			System.out.println("tipo de producto que lleva: " + prod);
			System.out.println("Valor de la compra: " + prec);
			System.out.println("Día del pedido: " + dia);
			System.out.println("Aplica a descuento: " + desc);
			System.out.println("                                                                ");
			System.out.println("----------------------------------------------------------------");
			System.out.println("                          == Total ==                           ");
			System.out.println("Total a pagar $ : " + total);
			System.out.println("----------------------------------------------------------------");
			System.out.println("GRACIAS POR COMPRAR CON NOSOTROS                                ");
			System.out.println("                                                                ");
			System.out.println("                              🐎                                ");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
		Scanner.close();

	}

}
