package TallerDePractica;

public class EJ09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String producto = "Cable HDMI";
	int unidades = 5;
		
	double precioUnitario = 20.3;
	double subtotal = unidades * precioUnitario;
		
	System.out.println("Producto: " + producto);
	System.out.println("Unidades: " + unidades);
	System.out.printf("Precio: $ %.2f%n", precioUnitario);
	System.out.printf("Subtotal: $ %.2f%n", subtotal);		
		
	}

}
