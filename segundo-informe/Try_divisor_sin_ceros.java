package ejercicios_teams;
import java.util.Scanner;
public class Try_divisor_sin_ceros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//========= el divisor sin errores ==========
		
		try {
			System.out.print("Ingresa el número que quieres dividir: ");
			int dividendo = sc.nextInt();
			System.out.print("Ingresa el número por el que lo quieres dividir: ");
			int divisor = sc.nextInt();
			System.out.println("El resultado de la división de " + dividendo + " por " + divisor + " es: " + dividendo / divisor);
		} catch (ArithmeticException e) {
			System.out.print("Error: no puedes dividir entre cero, pelele");
		}
		
		sc.close();

	}

}
