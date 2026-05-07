package ejercicios_teams;
import java.util.Scanner;
public class While_contador_vocales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ========= Contador de vocales con While ==========
		//----------datos de entrada----------
		System.out.println("ingrese una plabra o frase a continuación");
		String word = sc.nextLine().toLowerCase();
		//--------pisar variable-----------
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		
		int pos = 0;

        while (pos < word.length()) {

            char letra = word.charAt(pos);

            if (letra == 'a') {
                a++;
            } else if (letra == 'e') {
                e++;
            } else if (letra == 'i') {
                i++;
            } else if (letra == 'o') {
                o++;
            } else if (letra == 'u') {
                u++;
            }

            pos++;
        }

        System.out.println("Cantidad de a: " + a);
        System.out.println("Cantidad de e: " + e);
        System.out.println("Cantidad de i: " + i);
        System.out.println("Cantidad de o: " + o);
        System.out.println("Cantidad de u: " + u);

		
		sc.close();

	}

}
