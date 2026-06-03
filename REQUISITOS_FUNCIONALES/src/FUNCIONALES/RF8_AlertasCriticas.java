package FUNCIONALES;
import java.util.ArrayList;
import java.util.Scanner;

public class RF8_AlertasCriticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> empleados  = new ArrayList<>();
        ArrayList<Integer> resultados = new ArrayList<>();
        int opcion;

        System.out.println("  ==================================");
        System.out.println("     SISTEMA DE ALERTAS CRÍTICAS  ");
        System.out.println("  ==================================");

        do {
            System.out.println("\n1. Registrar resultado de encuesta");
            System.out.println("2. Ver alertas activas");
            System.out.println("3. Resumen general");
            System.out.println("4. Buscar empleado");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del empleado: ");
                    String emp = sc.nextLine();
                    int res;
                    do {
                        System.out.print("Resultado de encuesta (0-100): ");
                        res = sc.nextInt();
                        if (res < 0 || res > 100) System.out.println("⚠️  Valor inválido.");
                    } while (res < 0 || res > 100);
                    empleados.add(emp);
                    resultados.add(res);

                    if (res <= 30) {
                        System.out.println("🚨 ALERTA CRÍTICA generada para " + emp);
                        System.out.println("   Notificación enviada al equipo IT.");
                    } else if (res <= 60) {
                        System.out.println("⚠️  Resultado moderado. Se recomienda seguimiento.");
                    } else {
                        System.out.println("✅ Resultado saludable registrado.");
                    }
                    sc.nextLine();
                    break;

                case 2:
                    System.out.println("\n--- ALERTAS ACTIVAS ---");
                    boolean hayAlertas = false;
                    for (int i = 0; i < resultados.size(); i++) {
                        if (resultados.get(i) <= 30) {
                            System.out.println("🚨 " + empleados.get(i) + " → Resultado: " + resultados.get(i));
                            hayAlertas = true;
                        }
                    }
                    if (!hayAlertas) System.out.println("✅ Sin alertas críticas activas.");
                    break;

                case 3:
                    if (empleados.isEmpty()) {
                        System.out.println("No hay datos registrados.");
                    } else {
                        int criticos = 0, moderados = 0, saludables = 0, total = 0;
                        for (int r : resultados) {
                            total += r;
                            if (r <= 30) criticos++;
                            else if (r <= 60) moderados++;
                            else saludables++;
                        }
                        System.out.println("\n--- RESUMEN GENERAL ---");
                        System.out.println("Total encuestados : " + empleados.size());
                        System.out.println("Promedio general  : " + (total / empleados.size()));
                        System.out.println("Críticos  : " + criticos);
                        System.out.println("Moderados : " + moderados);
                        System.out.println("Saludables: " + saludables);
                    }
                    break;

                case 4:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < empleados.size(); i++) {
                        if (empleados.get(i).equalsIgnoreCase(buscar)) {
                            int r = resultados.get(i);
                            String estado;
                            if (r <= 30) estado = "CRÍTICO";
                            else if (r <= 60) estado = "MODERADO";
                            else estado = "SALUDABLE";
                            System.out.println( empleados.get(i) + " | Resultado: " + r + " | " + estado);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("Empleado no encontrado.");
                    break;

                case 5:
                    System.out.println("Cerrando sistema de alertas...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}