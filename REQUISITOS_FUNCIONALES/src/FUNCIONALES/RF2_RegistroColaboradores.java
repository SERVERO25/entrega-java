package FUNCIONALES;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class RF2_RegistroColaboradores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> cargos  = new ArrayList<>();
        ArrayList<int[]> edades   = new ArrayList<>();
        int opcion;

        System.out.println(" ==================================");
        System.out.println("║   REGISTRO DE COLABORADORES      ║");
        System.out.println(" ==================================");

        do {
            System.out.println("\n1. Registrar colaborador");
            System.out.println("2. Ver todos los colaboradores");
            System.out.println("3. Buscar por cargo");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cargo (1=Analista, 2=Supervisor, 3=Director): ");
                    int tipoCargo = sc.nextInt();
                    String cargo;
                    switch (tipoCargo) {
                        case 1: cargo = "Analista";    break;
                        case 2: cargo = "Supervisor";  break;
                        case 3: cargo = "Director";    break;
                        default: cargo = "Sin cargo";
                    }
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    if (edad < 18 || edad > 65) {
                        System.out.println("Edad fuera del rango laboral (18-65). No registrado.");
                    } else {
                        nombres.add(nombre);
                        cargos.add(cargo);
                        int[] e = {edad};
                        edades.add(e);
                        System.out.println("Colaborador registrado exitosamente.");
                    }
                    sc.nextLine();
                    break;

                case 2:
                    if (nombres.isEmpty()) {
                        System.out.println("No hay colaboradores registrados.");
                    } else {
                        System.out.println("\n--- LISTA DE COLABORADORES ---");
                        for (int i = 0; i < nombres.size(); i++) {
                            System.out.println((i+1) + ". " + nombres.get(i)
                                + " | Cargo: " + cargos.get(i)
                                + " | Edad: " + edades.get(i)[0]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Buscar cargo (1=Analista, 2=Supervisor, 3=Director): ");
                    int buscar = sc.nextInt();
                    String cargoBuscar;
                    switch (buscar) {
                        case 1: cargoBuscar = "Analista";   break;
                        case 2: cargoBuscar = "Supervisor"; break;
                        case 3: cargoBuscar = "Director";   break;
                        default: cargoBuscar = "";
                    }
                    boolean encontrado = false;
                    for (int i = 0; i < cargos.size(); i++) {
                        if (cargos.get(i).equals(cargoBuscar)) {
                            System.out.println( nombres.get(i) + " | Edad: " + edades.get(i)[0]);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("No se encontraron colaboradores con ese cargo.");
                    break;

                case 4:
                    System.out.println("Saliendo del registro...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
}