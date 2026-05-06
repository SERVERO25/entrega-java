package ejercicios_teams;
import java.util.Scanner;
public class While_impares_1_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//============ Ciclo while de impares del 1 al 25 =================
		
		int i = 0;
		
		while(i <= 25) {
			i++;
			if(i % 2 == 0) {
				
			}else {
				System.out.println( i  + " es uno de los números impares entre 1 y 25");
			}
		}
		
		sc.close();

	}

}
