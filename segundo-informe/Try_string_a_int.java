package ejercicios_teams;
import java.util.Scanner;
public class Try_string_a_int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//========== Conversion de variabble en texto a entero ===============
		try {
			System.out.println("Ingrese un valor numérico");
			String num = sc.nextLine();
			int ent = Integer.parseInt(num);
			System.out.println("Se ha transformado satisfactoriamente, y este es el valor: " + ent);
		} catch (NumberFormatException e) {
			System.out.println("Error: el valor debe ser numérico");
		}
		
		sc.close();

	}

}
