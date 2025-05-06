package ec.edu.monster;

import ec.edu.monster.controlador.ConversionUnidades;
import ec.edu.monster.controlador.ConversionUnidades_Service;
import java.util.Scanner;

public class ConversionUnidadesCliente_Consola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversionUnidades_Service service = new ConversionUnidades_Service();
        ConversionUnidades port = service.getConversionUnidadesPort();

        // Intentar login hasta que sea exitoso o el usuario decida salir
        boolean loginExitoso = false;
        while (!loginExitoso) {
            System.out.println("\n=== Iniciar Sesión ===");
            System.out.print("Ingrese usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Ingrese contraseña: ");
            String contrasena = scanner.nextLine();

            loginExitoso = port.login(usuario, contrasena);
            if (loginExitoso) {
                System.out.println("Login exitoso. Bienvenido!");
            } else {
                System.out.println("Login fallido. Credenciales incorrectas.");
                System.out.print("¿Desea intentar de nuevo? (s/n): ");
                String retry = scanner.nextLine().trim().toLowerCase();
                if (!retry.equals("s")) {
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                }
            }
        }

        // Menú principal después de login exitoso
        while (true) {
            System.out.println("\n=== Cliente Web Service Conversion Unidades ===");
            System.out.println("1. Convertir pulgadas a centímetros");
            System.out.println("2. Convertir centímetros a pulgadas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción (1-3): ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            if (opcion == 3) {
                System.out.println("Saliendo...");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese valor en pulgadas: ");
                    try {
                        double pulgadas = Double.parseDouble(scanner.nextLine());
                        double centimetros = port.pulgadasACentimetros(pulgadas);
                        System.out.printf("%.2f pulgadas = %.2f centímetros%n", pulgadas, centimetros);
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, ingrese un valor numérico válido.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese valor en centímetros: ");
                    try {
                        double centimetros = Double.parseDouble(scanner.nextLine());
                        double pulgadas = port.centimetrosAPulgadas(centimetros);
                        System.out.printf("%.2f centímetros = %.2f pulgadas%n", centimetros, pulgadas);
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, ingrese un valor numérico válido.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione 1, 2 o 3.");
            }
        }

        scanner.close();
    }
}