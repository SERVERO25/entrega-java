package ejecicios;

public class Casting_controlado {

	public static void main(String[] args) {
		
		// ------------------ Casting controlado (double -> int) -----------------------
		// basicamente es convertir un valor double en un int (porcentaje a entero) y decir cuanto es la la diferencia perdida
		
		double x = 4.44;
		int xEntero = (int) x;
		double resta = x - xEntero;
		
		System.out.println("X (Double) = " + x);
		System.out.println("X pero vuelto entero (int) = " + xEntero);
		System.out.println("El restante que queda por fuera es de = " +resta);

	}

}
