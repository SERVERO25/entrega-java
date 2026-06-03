package FUNCIONALES;
import java.util.Scanner;

public class RF4_SeguimientoHistorico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] riesgos = new int[4];
        String[] periodos = {"Enero-Marzo", "Abril-Junio", "Julio-Septiembre", "Octubre-Diciembre"};
        int opcion;

        System.out.println(" ==================================");
        System.out.println("   SEGUIMIENTO HISTÓRICO RRHH    ");
        System.out.println(" ==================================");

        // Ingresar nivel de riesgo por periodo
        for (int i = 0; i < 4; i++) {
            boolean valido = false;
            do {
                System.out.print("Nivel de riesgo " + periodos[i] + " (1=Bajo, 2=Medio, 3=Alto): ");
                riesgos[i] = sc.nextInt();
                if (riesgos[i] >= 1 && riesgos[i] <= 3) {
                    valido = true;
                } else {
                    System.out.println("Ingresa solo 1, 2 o 3.");
                }
            } while (!valido);
        }

        do {
            System.out.println("\n¿Qué deseas consultar?");
            System.out.println("1. Ver historial completo");
            System.out.println("2. Ver periodos críticos");
            System.out.println("3. Comparar dos periodos");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- HISTORIAL DE RIESGOS ---");
                    for (int i = 0; i < 4; i++) {
                        String nivel;
                        switch (riesgos[i]) {
                            case 1: nivel = "BAJO";  break;
                            case 2: nivel = "MEDIO"; break;
                            case 3: nivel = "ALTO";  break;
                            default: nivel = "Desconocido";
                        }
                        System.out.println(periodos[i] + ": " + nivel);
                    }
                    break;

                case 2:
                    System.out.println("\n--- PERIODOS EN RIESGO ALTO ---");
                    boolean hayCriticos = false;
                    for (int i = 0; i < 4; i++) {
                        if (riesgos[i] == 3) {
                            System.out.println(periodos[i]);
                            hayCriticos = true;
                        }
                    }
                    if (!hayCriticos) System.out.println("Ningún periodo crítico.");
                    break;

                case 3:
                    System.out.print("Periodo A (1-4): ");
                    int a = sc.nextInt() - 1;
                    System.out.print("Periodo B (1-4): ");
                    int b = sc.nextInt() - 1;
                    if (a >= 0 && a < 4 && b >= 0 && b < 4) {
                        System.out.println(periodos[a] + ": " + riesgos[a]);
                        System.out.println(periodos[b] + ": " + riesgos[b]);
                        if (riesgos[a] > riesgos[b]) {
                            System.out.println(periodos[a] + " tuvo mayor riesgo.");
                        } else if (riesgos[b] > riesgos[a]) {
                            System.out.println( periodos[b] + " tuvo mayor riesgo.");
                        } else {
                            System.out.println("Ambos periodos tuvieron el mismo nivel.");
                        }
                    } else {
                        System.out.println("Periodo inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
}