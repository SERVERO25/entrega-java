package ejercicios_teams;
import java.util.Scanner;
public class Ciclo_for_de_7s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//--------------Contador de sietes------------
		
		System.out.println("Ingrese un número");
		int num = sc.nextInt();
		int sie = 0;
		for(int i = 1; i<= num; i++) {
			if(i % 7 == 0) {
				sie++;
			}
		}
		
		System.out.println("El número 7 se encuentra en el "+ num +" un total de " + sie + " veces en el número que ingresaste");
		
		sc.close();

	}

}
