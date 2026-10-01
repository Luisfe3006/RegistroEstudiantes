import java.util.Scanner;

public class RegistroEstudiantes {

    // Declarar los arreglos para la infromación de los estudiantes
    static String[] carnets  = new String[50];
    static String[] nombres  = new String[50];
    static String[] carreras = new String[50];
    static int[]    edades   = new int[50];
    static String[] correos  = new String[50];

    static int cantidad = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- REGISTRO DE ESTUDIANTES ---");
            System.out.println("1. Agregar");
            System.out.println("2. Leer");
            System.out.println("3. Editar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    agregar();
                    break;
                case 2:
                    leer();
                    break;
                case 3:
                    editar();
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    // Metodos para agregar, leer y editar estudiantes
    public static void agregar() {
        // Lo implementaremos en el siguiente paso
    }

    public static void leer() {
        // Lo implementaremos más adelante
    }

    public static void editar() {
        // Lo implementaremos más adelante
    }
}