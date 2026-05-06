package TallerDePractica;

public class EJ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int nota =  87;
	if (nota >= 60) System.out.println("Aprobado");
	else System.out.println("Reprobado");
	
	String etiqueta;
	if (nota >= 90) etiqueta = "Excelente";
	else if (nota >= 75) etiqueta = "Bueno";
	else if (nota >= 60) etiqueta = "Basico";
	
	else etiqueta = "Insuficiente";
	System.out.println("Desempeño: " + etiqueta);


	}

}
