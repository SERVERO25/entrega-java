package ejercicios_teams;
import java.util.Scanner; 
public class Condicional_Nombre_Edad {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		// =============Condicional simple con nombre y edad=================
		
		System.out.println("Por favor ingrese su nombre a continuación");
		String nom = Scanner.nextLine();
		
		System.out.println("Señor/a " + nom + " ingrese su edad a continuación");
		int ed =Scanner.nextInt();
		
		if( ed >= 18 ) {
			System.out.println(nom + ", usted puede votar (arriba Venezuela)");
		} else {
			System.out.println(nom + ", usted no puede votar (arriba Venezuela)");
		}
		
		Scanner.close();

	}

}
