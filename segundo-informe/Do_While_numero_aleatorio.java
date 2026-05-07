package ejercicios_teams;
import java.util.Scanner;
import java.util.Random;
public class Do_While_numero_aleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		//========== Do While ==========
		System.out.println("Se diran numeros entre 1 y 100 a menos de que niegues (si - no)");
		String resp = sc.nextLine();
		
		do {
			int numr = rand.nextInt(100) + 1;
			System.out.print("El numero aleatorio obtenido fue: " + numr);
			System.out.println("... desea continuar?");
			resp = sc.nextLine();
		} while(resp.equals("si"));
		
		System.out.println("Se detuvo el ciclo a peticion del usuario");
		
		sc.close();

	}

}
