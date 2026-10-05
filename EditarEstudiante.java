public class EditarEstudiante {

    public static void ejecutar() {
        int subopcion;

        do {
            System.out.println("\n--- EDITAR ESTUDIANTES ---");
            System.out.println("1. Modificar datos");
            System.out.println("2. Eliminar estudiante");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            subopcion = Datos.sc.nextInt();
            Datos.sc.nextLine();

            switch (subopcion) {
                case 1:
                    modificar();
                    break;
                case 2:
                    eliminar();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (subopcion != 0);
    }

    public static void modificar() {
        System.out.print("Ingrese el carnet del estudiante a modificar: ");
        String carnetBuscado = Datos.sc.nextLine();
        int pos = Datos.buscarPosicion(carnetBuscado);

        if (pos == -1) {
            System.out.println("Estudiante no encontrado");
            return;
        }

        System.out.println("\nDatos actuales:");
        System.out.println("Nombre: " + Datos.nombres[pos]);
        System.out.println("Carrera: " + Datos.carreras[pos]);
        System.out.println("Edad: " + Datos.edades[pos]);
        System.out.println("Correo: " + Datos.correos[pos]);

        System.out.print("Ingrese el nuevo nombre: ");
        Datos.nombres[pos] = Datos.sc.nextLine();

        System.out.print("Ingrese la nueva carrera: ");
        Datos.carreras[pos] = Datos.sc.nextLine();

        System.out.print("Ingrese la nueva edad: ");
        Datos.edades[pos] = Datos.sc.nextInt();
        Datos.sc.nextLine();

        System.out.print("Ingrese el nuevo correo: ");
        Datos.correos[pos] = Datos.sc.nextLine();

        System.out.println("Datos actualizados correctamente");
    }

    public static void eliminar() {
        System.out.print("Ingrese el carnet del estudiante a eliminar: ");
        String carnetBuscado = Datos.sc.nextLine();
        int pos = Datos.buscarPosicion(carnetBuscado);

        if (pos == -1) {
            System.out.println("Estudiante no encontrado");
            return;
        }

        for (int i = pos; i < Datos.cantidad - 1; i++) {
            Datos.carnets[i] = Datos.carnets[i + 1];
            Datos.nombres[i] = Datos.nombres[i + 1];
            Datos.carreras[i] = Datos.carreras[i + 1];
            Datos.edades[i] = Datos.edades[i + 1];
            Datos.correos[i] = Datos.correos[i + 1];
        }

        Datos.cantidad--;
        Datos.carnets[Datos.cantidad] = null;
        Datos.nombres[Datos.cantidad] = null;
        Datos.carreras[Datos.cantidad] = null;
        Datos.edades[Datos.cantidad] = 0;
        Datos.correos[Datos.cantidad] = null;

        System.out.println("Estudiante eliminado correctamente");
    }
}