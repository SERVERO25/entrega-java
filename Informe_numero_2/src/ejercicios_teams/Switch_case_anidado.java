package ejercicios_teams;
import java.util.Scanner;
public class Switch_case_anidado {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		// ==============Switch case anidado=================
		
		//------------ Datos de entrada --------------
		System.out.println("Ingrese su nombre a continuación");
		String nom = Scanner.nextLine();
		
		//---------- Switch case anidado -------------
		switch(nom)
		{
		case "Julio":
			System.out.println("Que penesote broder waos");
			break;
		case "Estefania":
			System.out.println("Hola estefi,,, este fierrazo agh");
			break;
		case "Esteban":
			System.out.println("Este bandido ome EHJJ");
			break;
		case "Profesor":
			System.out.println("*Profesor*: eh ave maria, le voy a poner 5 a Julio");
			break;
		case "Isabella":
			System.out.println("Hoy te ves muy bonita, como de constumbre");
			break;
		default:
			System.out.println("ERROR 404 NOT FOUND");
		}
		
		Scanner.close();

	}

}
