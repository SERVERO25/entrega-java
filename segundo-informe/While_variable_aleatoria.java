package ejercicios_teams;
import java.util.Scanner;
import java.util.Random;
public class While_variable_aleatoria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//============= Ciclo de Variable aleatoria ==============
		// --------- variable aleatoria ------------
		int solu = rand.nextInt(20) + 1;
		// --------- variables necesarias ---------
		System.out.println("Debe de adivinar un número aleatorio entre 1 y 20, ingrese un número");
		int num = sc.nextInt();
		int i = 0;
		//---------- while --------
		while(num != solu) {
			i++;
			System.out.println("numero incorrecto, intentelo de nuevo");
			num = sc.nextInt();
		}
		System.out.println("Félicidades, has acertado");
		System.out.println("número objetivo: " + solu);
		System.out.println("número de intentos: " + i);
		
		
		sc.close();

	}

}
