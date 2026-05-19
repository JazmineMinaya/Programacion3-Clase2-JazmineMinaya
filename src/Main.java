import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Paciente> listaPacientes = new ArrayList<>();

    // Metodo para mostrar menu
    public static void mostrarMenu() {
        System.out.println("\n---------------------------------------");
        System.out.println("                 MENU");
        System.out.println("---------------------------------------");
        System.out.println("  1. Registrar paciente");
        System.out.println("  2. Mostrar informacion de pacientes");
        System.out.println("  3. Calcular IMC");
        System.out.println("  4. Determinar peso del paciente");
        System.out.println("  5. Mostrar pacientes registrados");
        System.out.println("  6. Salir del sistema");
        System.out.println("---------------------------------------");
    }

    // Metodo para registrar los pacientes
    public static void registrarPacientes() {
        System.out.println("\nREGISTRO DE PACIENTE\n");

        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el sexo del paciente: ");
        String sexo = scanner.nextLine();

        System.out.print("Ingrese la altura del paciente: ");
        float altura = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Ingrese el peso del paciente: ");
        float peso = scanner.nextFloat();
        scanner.nextLine();

        Paciente paciente = new Paciente(nombre, edad, sexo, altura, peso);

        listaPacientes.add(paciente);
    }

    
    // Metodo para mostrar pacientes registrados
    public static void mostrarPacientesRegistrados() {
        if (listaPacientes.isEmpty()) {
            System.out.println("\nNo hay pacientes registrados");
        }
        else {
            System.out.println("\n-------Registro de Pacientes-------");
            for (Paciente p : listaPacientes) {
                Paciente.mostrarDatosPaciente(p);
            }
            System.out.println("-----------------------------------");
        }
    }

        public static void main(String[] args) {
        int opcion = 0;

        do {
            mostrarMenu();

            System.out.print("\nIngrese la opcion de su preferencia: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {
                case 1:
                    registrarPacientes();
                    break;
            }

        } while (opcion != 6);
    }
}