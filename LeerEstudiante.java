public class LeerEstudiante {

    public static void ejecutar() {
        int subopcion;

        do {
            System.out.println("\n--- LEER ESTUDIANTES ---");
            System.out.println("1. Ver todos");
            System.out.println("2. Ver ordenados por nombre");
            System.out.println("3. Buscar por carnet");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            subopcion = Datos.sc.nextInt();
            Datos.sc.nextLine(); // Limpiar buffer

            switch (subopcion) {
                case 1:
                    mostrarTodos();
                    break;
                case 2:
                    ordenarPorNombre();
                    mostrarTodos();
                    break;
                case 3:
                    buscarPorCarnet();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (subopcion != 0);
    }

    public static void mostrarTodos() {
        if (Datos.cantidad == 0) {
            System.out.println("No hay estudiantes registrados");
        } else {
            for (int i = 0; i < Datos.cantidad; i++) {
                System.out.println("\nEstudiante " + (i + 1));
                System.out.println("Carnet:  " + Datos.carnets[i]);
                System.out.println("Nombre:  " + Datos.nombres[i]);
                System.out.println("Carrera: " + Datos.carreras[i]);
                System.out.println("Edad:    " + Datos.edades[i]);
                System.out.println("Correo:  " + Datos.correos[i]);
                System.out.println("--------------------");
            }
            System.out.println("Total de estudiantes: " + Datos.cantidad);
        }
    }

    public static void buscarPorCarnet() {
        System.out.print("Ingrese el carnet a buscar: ");
        String carnetBuscado = Datos.sc.nextLine();

        int pos = Datos.buscarPosicion(carnetBuscado);

        if (pos == -1) {
            System.out.println("Estudiante no encontrado");
        } else {
            System.out.println("\nEstudiante encontrado:");
            System.out.println("Carnet:  " + Datos.carnets[pos]);
            System.out.println("Nombre:  " + Datos.nombres[pos]);
            System.out.println("Carrera: " + Datos.carreras[pos]);
            System.out.println("Edad:    " + Datos.edades[pos]);
            System.out.println("Correo:  " + Datos.correos[pos]);
        }
    }

    public static void ordenarPorNombre() {
        // Ordenamiento por método de burbuja en arreglos paralelos
        for (int i = 0; i < Datos.cantidad - 1; i++) {
            for (int j = 0; j < Datos.cantidad - 1 - i; j++) {
                if (Datos.nombres[j].compareToIgnoreCase(Datos.nombres[j + 1]) > 0) {
                    
                    // Intercambio de carnets
                    String auxTexto = Datos.carnets[j];
                    Datos.carnets[j] = Datos.carnets[j + 1];
                    Datos.carnets[j + 1] = auxTexto;

                    // Intercambio de nombres
                    auxTexto = Datos.nombres[j];
                    Datos.nombres[j] = Datos.nombres[j + 1];
                    Datos.nombres[j + 1] = auxTexto;

                    // Intercambio de carreras
                    auxTexto = Datos.carreras[j];
                    Datos.carreras[j] = Datos.carreras[j + 1];
                    Datos.carreras[j + 1] = auxTexto;

                    // Intercambio de edades
                    int auxEdad = Datos.edades[j];
                    Datos.edades[j] = Datos.edades[j + 1];
                    Datos.edades[j + 1] = auxEdad;

                    // Intercambio de correos
                    auxTexto = Datos.correos[j];
                    Datos.correos[j] = Datos.correos[j + 1];
                    Datos.correos[j + 1] = auxTexto;
                }
            }
        }
        System.out.println("Estudiantes ordenados por nombre");
    }
}