	package FUNCIONALES;
	import java.util.Scanner;

	public class RF1_Dashboard {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] resultados = new int[5];
	        int opcion;

	        System.out.println("  ==================================");
	        System.out.println("          DASHBOARD ESTADÍSTICAS   ");
	        System.out.println("  ==================================");

	        // Ingresar resultados
	        for (int i = 0; i < 5; i++) {
	            boolean valido = false;
	            do {
	                System.out.print("Ingresa resultado #" + (i + 1) + " (0-100): ");
	                resultados[i] = sc.nextInt();
	                if (resultados[i] >= 0 && resultados[i] <= 100) {
	                    valido = true;
	                } else {
	                    System.out.println("Valor inválido. Debe estar entre 0 y 100.");
	                }
	            } while (!valido);
	        }

	        // Menú de opciones
	        do {
	            System.out.println("\n¿Qué deseas ver?");
	            System.out.println("1. Promedio general");
	            System.out.println("2. Resultado más alto y más bajo");
	            System.out.println("3. Clasificación por nivel");
	            System.out.println("4. Salir");
	            System.out.print("Opción: ");
	            opcion = sc.nextInt();

	            switch (opcion) {
	                case 1:
	                    int suma = 0;
	                    for (int r : resultados) suma += r;
	                    double promedio = (double) suma / resultados.length;
	                    System.out.println("Promedio general: " + promedio);
	                    if (promedio >= 70) {
	                        System.out.println("Estado general: SALUDABLE");
	                    } else if (promedio >= 50) {
	                        System.out.println("Estado general: EN RIESGO");
	                    } else {
	                        System.out.println("Estado general: CRÍTICO");
	                    }
	                    break;

	                case 2:
	                    int max = resultados[0], min = resultados[0];
	                    for (int r : resultados) {
	                        if (r > max) max = r;
	                        if (r < min) min = r;
	                    }
	                    System.out.println("Más alto: " + max);
	                    System.out.println("Más bajo: " + min);
	                    break;

	                case 3:
	                    int altos = 0, medios = 0, bajos = 0;
	                    for (int r : resultados) {
	                        if (r >= 70) altos++;
	                        else if (r >= 50) medios++;
	                        else bajos++;
	                    }
	                    System.out.println("Saludables (70-100): " + altos);
	                    System.out.println("En riesgo  (50-69):  " + medios);
	                    System.out.println("Críticos   (0-49):   " + bajos);
	                    break;

	                case 4:
	                    System.out.println("Cerrando dashboard...");
	                    break;

	                default:
	                    System.out.println("Opción no válida.");
	            }
	        } while (opcion != 4);
	    }
	}