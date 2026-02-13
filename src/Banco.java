import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nBienvenido al Banco de Colombia!");
        System.out.print("\nIngrese su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese su tipo de cuenta: ");
        String tipoCuenta = teclado.nextLine();

        double saldoDisponible = 15995000;
        int opcion = 0;
        String menu = """

                      ** Menu de Opciones **
                      
                1. Consultar saldo
                2. Retirar dinero
                3. Depositar dinero
                9. Salir
                """;

        while (opcion != 9) {

            System.out.println("\n\n   B A N C O  D E  C O L O M B I A");
            System.out.println("\n\n******** Datos de la Cuenta ********");
            System.out.println("\nNombre del cliente: " + nombre);
            System.out.println("Tipo de cuenta: " + tipoCuenta);
            System.out.printf("Saldo disponible: $%,1.2f%n", saldoDisponible);
            System.out.println("\n************************************");

            System.out.println(menu);
            System.out.print("\nOpcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("\nSu saldo disponible es: $%,1.2f%n", saldoDisponible);
                    System.out.println("\nPresione Enter para continuar...");
                    teclado.nextLine(); // Consumir el salto de linea
                    teclado.nextLine(); // Esperar a que el usuario presione Enter
                    break;
                case 2:
                    System.out.print("\nIngrese la cantidad a retirar: ");
                    double retiro = teclado.nextDouble();
                    if (retiro <= saldoDisponible) {
                        saldoDisponible -= retiro;
                        System.out.printf("Retiro exitoso. Nuevo saldo: $%,1.2f%n", saldoDisponible);
                        System.out.println("\nPresione Enter para continuar...");
                        teclado.nextLine(); // Consumir el salto de linea
                        teclado.nextLine(); // Esperar a que el usuario presione Enter
                    } else {
                        System.out.println("Fondos insuficientes para realizar el retiro.");
                        System.out.println("\nPresione Enter para continuar...");
                        teclado.nextLine(); // Consumir el salto de linea
                        teclado.nextLine(); // Esperar a que el usuario presione Enter
                    }
                    break;
                case 3:
                    System.out.print("\nIngrese la cantidad a depositar: ");
                    double deposito = teclado.nextDouble();
                    saldoDisponible += deposito;
                    System.out.printf("Deposito exitoso. Nuevo saldo: $%,1.2f%n", saldoDisponible);
                    System.out.println("\nPresione Enter para continuar...");
                    teclado.nextLine(); // Consumir el salto de linea
                    teclado.nextLine(); // Esperar a que el usuario presione Enter
                    break;
                case 9:
                    System.out.println("\nSaliendo del programa. Gracias por usar nuestros servicios. ¡Hasta pronto!\n");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor intente de nuevo.");
                    System.out.println("\nPresione Enter para continuar...");
                    teclado.nextLine(); // Consumir el salto de linea
                    teclado.nextLine(); // Esperar a que el usuario presione Enter
            }
        }
    teclado.close();
    }
}
