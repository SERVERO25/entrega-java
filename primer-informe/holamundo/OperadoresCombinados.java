	package holamundo;

public class OperadoresCombinados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sumaCombinada  
		
		int a = 5;
		int b = 2; 
		a += b;
	
		System.out.println("el valor de la suma de a con b mediante a+=b es: " +a );
	
		// restaCombinada
	
		int c = 8;
		int d = 3;
		c -= d;
		System.out.println("el valor de la resta entre c y d mediante c-=d es: " +c );
	

        // MultiplicaciónCombinada
        int e = 4;
        int f = 6;
        e *= f; // equivale a: e = e * f
        System.out.println("El valor de la multiplicación entre e y f mediante e*=f es: " + e);

        // DivisiónCombinada
        int g = 20;
        int h = 5;
        g /= h; // equivale a: g = g / h
        System.out.println("El valor de la división entre g y h mediante g/=h es: " + g);

        // MóduloCombinado
        int i = 17;
        int j = 4;
        i %= j; // equivale a: i = i % j
        System.out.println("El valor del módulo entre i y j mediante i%=j es: " + i);	

	}

} 
