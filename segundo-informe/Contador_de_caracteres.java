package ejercicios_teams;
import java.util.Scanner;
public class Contador_de_caracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//========Contador de caracteres========
		// -------Datos de entrada------
		System.out.println("Escribe lo que quieras y yo cotaré");
		String esc = sc.nextLine();
		
		// -------cambiar espacios------
		esc = esc.replace(" ", "");
		
		// -------contador como tal------
		int cant = esc.length();
		
		System.out.println("La cantidad de caracteres ingresados fueron: " + cant);
		
		sc.close();

	}

}
