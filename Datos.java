import java.util.Scanner;

public class Datos {
    // Arreglos para la información de los estudiantes
    public static String[] carnets  = new String[50];
    public static String[] nombres  = new String[50];
    public static String[] carreras = new String[50];
    public static int[]    edades   = new int[50];
    public static String[] correos  = new String[50];

    public static int cantidad = 0;
    public static Scanner sc = new Scanner(System.in);

    // Método auxiliar necesario para buscar por carnet, modificar y eliminar
    public static int buscarPosicion(String carnetBuscado) {
        for (int i = 0; i < cantidad; i++) {
            if (carnets[i].equalsIgnoreCase(carnetBuscado)) {
                return i; // Retorna el índice donde lo encontró
            }
        }
        return -1; // Retorna -1 si no existe
    }
}