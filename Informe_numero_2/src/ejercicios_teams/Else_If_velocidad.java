package ejercicios_teams;
import java.util.Scanner;
public class Else_If_velocidad {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		//===== Else If sobre ejercicio de velocidad =====
		
		System.out.println("Ingrese su velocidad en Kilometros por hora a continuación");
		int vel = Scanner.nextInt();
		
		if (vel <= 30) {
			System.out.println("Su velocidad es adecuada para zonas escolares");
		} else if (vel <= 60 && vel > 30) {
			System.out.println("Su velocidad es adecuada para vías urbanas");
		} else if (vel <= 80 && vel >60) {
			System.out.println("Su velocidad es adecuada para vías rurales");
		} else if (vel <= 100 && vel > 80) {
			System.out.println("Su velocidad es adecuada para rutas nacionales");
		} else {
			System.out.println("Usted lo que es; es un puto loco e infringe los limites de velocidad");
		}
		
		Scanner.close();

	}

}
