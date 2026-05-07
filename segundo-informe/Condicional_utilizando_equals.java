package ejercicios_teams;

public class Condicional_utilizando_equals {

	public static void main(String[] args) {
		//====================Condicional utilizando equals and "=="========================
		
		// ------------variables-----------------
		String x = "mondongo" ;
		String y = "mondongo" ;
		
		// entonces ahora el condicional hara comparaciones entre ellas y dira cosas dependiendo del resultado
		if (x == y) {
			System.out.println("tienen la misma posición como variables");
			System.out.println("True");
		} else {
			System.out.println("no comparten la misma posición como variables");
			System.out.println("False");
		}
		if (x.equals(y)) {
			System.out.println("las variables comparten el mismo contenido");
			System.out.println("True");
		} else {
			System.out.println("las variables no comparten el mismo contenido");
			System.out.println("False");
		}

	}

}
