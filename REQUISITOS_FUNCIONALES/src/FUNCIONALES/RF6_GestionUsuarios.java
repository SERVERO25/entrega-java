package FUNCIONALES;
import java.util.ArrayList;
import java.util.Scanner;

public class RF6_GestionUsuarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();
        ArrayList<String> roles    = new ArrayList<>();
        int opcion;

        System.out.println(" ==================================");
        System.out.println("      GESTIÓN DE USUARIOS         ");
        System.out.println(" ==================================");

        do {
            System.out.println("\n1. Crear usuario");
            System.out.println("2. Ver usuarios y permisos");
            System.out.println("3. Verificar acceso a módulo");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de usuario: ");
                    String user = sc.nextLine();
                    System.out.println("Rol: 1=Admin  2=Empresa  3=Especialista  4=Consulta");
                    System.out.print("Selecciona rol: ");
                    int rolNum = sc.nextInt();
                    String rol;
                    switch (rolNum) {
                        case 1: rol = "Admin";        break;
                        case 2: rol = "Empresa";      break;
                        case 3: rol = "Especialista"; break;
                        case 4: rol = "Consulta";     break;
                        default: rol = "Sin rol";
                    }
                    usuarios.add(user);
                    roles.add(rol);
                    System.out.println("Usuario '" + user + "' creado con rol: " + rol);
                    sc.nextLine();
                    break;

                case 2:
                    if (usuarios.isEmpty()) {
                        System.out.println("No hay usuarios registrados.");
                    } else {
                        System.out.println("\n--- USUARIOS DEL SISTEMA ---");
                        for (int i = 0; i < usuarios.size(); i++) {
                            String permisos;
                            if (roles.get(i).equals("Admin")) {
                                permisos = "Todo el sistema";
                            } else if (roles.get(i).equals("Empresa")) {
                                permisos = "Ver estadísticas, registrar colaboradores";
                            } else if (roles.get(i).equals("Especialista")) {
                                permisos = "Encuestas y reportes";
                            } else {
                                permisos = "Solo lectura";
                            }
                            System.out.println((i+1) + ". " + usuarios.get(i)
                                + " | Rol: " + roles.get(i)
                                + " | Permisos: " + permisos);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nombre de usuario a verificar: ");
                    String buscar = sc.nextLine();
                    System.out.println("Módulo: 1=Dashboard  2=Reportes  3=Encuestas  4=Configuración");
                    System.out.print("Módulo: ");
                    int modulo = sc.nextInt();
                    boolean existe = false;

                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).equalsIgnoreCase(buscar)) {
                            existe = true;
                            String r = roles.get(i);
                            boolean acceso = false;

                            if (r.equals("Admin")) {
                                acceso = true;
                            } else if (r.equals("Empresa") && (modulo == 1 || modulo == 2)) {
                                acceso = true;
                            } else if (r.equals("Especialista") && (modulo == 2 || modulo == 3)) {
                                acceso = true;
                            } else if (r.equals("Consulta") && modulo == 1) {
                                acceso = true;
                            }

                            if (acceso) {
                                System.out.println("Acceso PERMITIDO al módulo.");
                            } else {
                                System.out.println("Acceso DENEGADO. Rol insuficiente.");
                            }
                        }
                    }
                    if (!existe) System.out.println("Usuario no encontrado.");
                    sc.nextLine();
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