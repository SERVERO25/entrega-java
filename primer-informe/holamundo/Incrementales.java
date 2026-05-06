package holamundo;

public class Incrementales {
	public static void main(String[] args) {
		//incremental al lado izquierdo
		
		int a = 5; 
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		// incremental al lado derecho
		
		int c = 6; 
		int d = c++;
		System.out.println(c);
		System.out.println(d);
		
		// decremento al lado izquierdo
		
		int e = 3; 
		int f = --e;
		System.out.println(e);
		System.out.println(f);
		
		// decfremento al lado derecho
		
		int g = 8; 
		int h = g--;
		System.out.println(g);
		System.out.println(h);
	}
}