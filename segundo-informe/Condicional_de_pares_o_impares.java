package ejercicios_teams;
import java.util.Scanner;
public class Condicional_de_pares_o_impares {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		// ======= condicional de pares o impares ==========
		
		// --------- datos de entrada ----------
		System.out.println("Ingrese un numero a continuación, por favor");
		int num = Scanner.nextInt();
		
		// ---------condicional----------
		if (num % 2 == 0) {
			System.out.println("ese número es un número par");
		} else {
			System.out.println("ese número es un número impar");
		}
		Scanner.close();

	}

}
