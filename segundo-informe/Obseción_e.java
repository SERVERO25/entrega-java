package ejercicios_teams;
import java.util.Scanner;
public class Obseción_e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//========= Algoritmo cambia A's por E's ==========
		System.out.println("No me gustan las A, las quitaré de todo lo que me digas por una E que es mejor");
		String text = sc.nextLine().toLowerCase();
	
		System.out.println("dijiste: " + text.replace("a", "e") + "?");
		
		sc.close();

	}

}
