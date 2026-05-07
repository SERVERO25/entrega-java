package ejercicios_teams;
import java.util.Scanner;
public class Ciclo_for_tablas_x {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//==========Tablas de multiplicar con for en ciclo ===============
		
		System.out.println("Ingresa el número entre el 1 y el 10, para ver sus respectivas tablas");
		int num = sc.nextInt();
		
		if (num <= 10) {
			for(int i = 1; i <= 10; i++) {
				int resu = num * i;
				System.out.println(num + " x " + i + " = " + resu);
			}
		}else {
			System.out.println("Advertencia, el número exede el limite");
		}
		
		sc.close();

	}

}
