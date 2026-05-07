package ejercicios_teams;

import java.util.Scanner;

public class Ejemplo_de_la_clase_Scanner {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		// ==========Ejemplo tomado del documento de la clase Scanner========== 
		
		// -----------Datos de entrada------------
		
		System.out.println("Ingrese su nombre a continuación");
		String nomb = Scanner.nextLine();
		
		System.out.println("Ingrese su edad a continuación");
		int edad = Scanner.nextInt();
		
		// -----------Datos de salida-------------
		
		System.out.println(nomb + " tiene: " + edad + " años.");
		
		//-----------cierre del scanner-----------
		Scanner.close();
	}

}
