package holamundo;

public class Logicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		// Negación !
		System.out.println("El resultado de aplicar !false es: " + (!false));
		System.out.println("El resultado de aplicar !(5 == 5) es: " + (!(5 == 5)));

		// Suma lógica (OR) |
		System.out.println("El resultado de aplicar true | false es: " + (true | false));
		System.out.println("El resultado de aplicar (5 == 5) | (5 < 4) es: " + ((5 == 5) | (5 < 4)));
		// Suma lógica exclusiva ^
		System.out.println("El resultado de aplicar true ^ false es: " + (true ^ false));	
		System.out.println("El resultado de aplicar (5 == 5) ^ (5 < 4) es: " + ((5 == 5) ^ (5 < 4)));

		// Producto lógico (AND) &
		System.out.println("El resultado de aplicar true & false es: " + (true & false));
		System.out.println("El resultado de aplicar (5 == 5) & (5 < 4) es: " + ((5 == 5) & (5 < 4)));

		// Suma lógica cortocircuito ||
		System.out.println("El resultado de aplicar true || false es: " + (true || false));
		System.out.println("El resultado de aplicar (5 == 5) || (5 < 4) es: " + ((5 == 5) || (5 < 4)));

		// Producto lógico cortocircuito &&
		System.out.println("El resultado de aplicar true && false es: " + (true && false));
		System.out.println("El resultado de aplicar (5 == 5) && (5 < 4) es: " + ((5 == 5) && (5 < 4)));


	}
}
