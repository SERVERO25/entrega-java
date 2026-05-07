package ejercicios_teams;
import java.util.Scanner;
public class Mayusculas_minusculas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//======== Conversión de mayúsculas y minúsculas ==========
		System.out.println("Introduzca una frase o palabras en mayúsculas o minúsculas");
		String word = sc.nextLine().toLowerCase();
		String word2 = word.toUpperCase();
		
		System.out.println("lo que escribiste en minúculas se vería así: " + word);
		System.out.println("lo que escribiste en mayúsculas se vería así: " + word2);
		
		sc.close();

	}

}
