package TallerDePractica;

public class EJ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 127;
		System.out.println("b = " + b);
		b++;
		System.out.println("b + 1 = " + b); // se aplica el concepto de overflow al incrementar el 127 
		                                    //  no lo deja pasar a 128 por que el maximo permitido en byte es 127
		                                    // pasa a su minimo que seria -128 por eso el resultado de b+ 1 te da en negativo.
		
		
	}

}
