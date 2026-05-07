package ejercicios_teams;
import java.util.Scanner;
public class Comparacion_equals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//========= Comparativa usando Equals y Equalsignorecase ===========
		//--------datos de entrada----------
		System.out.println("Introduzca el texto uno, por favor");
		String text1 = sc.nextLine();
		System.out.println("Introduzca el texto dos, por favor");
		String text2 = sc.nextLine();
		
		//--------condicional-----------
		if(text1.equals(text2)) {
			System.out.println("los dos textos son exactamente iguales");
		}else if(text1.equalsIgnoreCase(text2)) {
			System.out.println("Los dos textos son identicos, sin embargo tienen mayúsculas o minúsculas diferentes");
		}else {
			System.out.println("Los textos no son ni parecidos .l.");
		}
		
		sc.close();

	}

}
