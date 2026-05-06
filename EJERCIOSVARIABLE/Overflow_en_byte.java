package ejecicios;

public class Overflow_en_byte {

	public static void main(String[] args) {
		
		// ----------------------------Overflow en byte-------------------------------
		// basicamente es hacer que una variable de tipo byte tenga un valor mayor del que puede tener.
		
		byte b = 127;
		System.out.println("byte b = " + b);
		b++;
		System.out.println("Cuando un byte sobre pasa su capacidad se vuelve = " + b);

	}

}
