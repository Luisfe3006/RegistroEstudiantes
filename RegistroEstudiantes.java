public class RegistroEstudiantes {

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- REGISTRO DE ESTUDIANTES ---");
            System.out.println("1. Agregar");
            System.out.println("2. Leer");
            System.out.println("3. Editar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Datos.sc.nextInt();
            Datos.sc.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    AgregarEstudiante.ejecutar();
                    break;
                case 2:
                    LeerEstudiante.ejecutar();
                    break;
                case 3:
                    EditarEstudiante.ejecutar();
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }
}