package ejercicios_teams;
import java.util.Scanner;
public class Ciclo_for_numeros {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		//=========== Ciclo del 0 al 100 ===============
		//----------- datos de entrada ---------------
		System.out.println("Ingrese un número entre el 1 y el 100");
		int num = Scanner.nextInt();
		//----------- Ciclo for --------------
		for (int i = 0; i <= num; i++) {
			System.out.print("contando hasta llegar a " + num + ": " + i);
			if(i % 2 == 0) {
				System.out.println("  (Y es un numero par)");
			}else {
				System.out.println("  (Y es un numero impar)");
			}
		}
		
		Scanner.close();

	}

}
