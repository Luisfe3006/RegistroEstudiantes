public class EditarEstudiante {

    public static void ejecutar() {
        System.out.println("\n--- EDITAR ESTUDIANTE ---");
        
        if (Datos.cantidad == 0) {
            System.out.println("No hay estudiantes registrados");
            return;
        }

        System.out.print("Ingrese el carnet del estudiante a editar: ");
        String carnetBuscado = Datos.sc.nextLine();

        int pos = Datos.buscarPosicion(carnetBuscado);

        if (pos == -1) {
            System.out.println("Estudiante no encontrado");
        } else {
            System.out.println("\nDatos actuales:");
            System.out.println("Nombre: " + Datos.nombres[pos]);
            System.out.println("Carrera: " + Datos.carreras[pos]);
            System.out.println("Edad: " + Datos.edades[pos]);
            System.out.println("Correo: " + Datos.correos[pos]);

            System.out.println("\n¿Qué desea hacer con este estudiante?");
            System.out.println("1. Modificar datos");
            System.out.println("2. Eliminar estudiante");
            System.out.println("0. Cancelar");
            System.out.print("Seleccione una opción: ");
            int opcionAccion = Datos.sc.nextInt();
            Datos.sc.nextLine(); // Limpiar buffer

            if (opcionAccion == 1) {
                System.out.println("\nIngrese los nuevos datos:");
                
                System.out.print("Nuevo nombre: ");
                Datos.nombres[pos] = Datos.sc.nextLine();

                System.out.print("Nueva carrera: ");
                Datos.carreras[pos] = Datos.sc.nextLine();

                System.out.print("Nueva edad: ");
                Datos.edades[pos] = Datos.sc.nextInt();
                Datos.sc.nextLine(); // Limpiar buffer

                System.out.print("Nuevo correo: ");
                Datos.correos[pos] = Datos.sc.nextLine();

                System.out.println("Estudiante editado correctamente");
            } else if (opcionAccion == 2) {
                // Proceso de eliminación desplazando los elementos hacia la izquierda
                for (int i = pos; i < Datos.cantidad - 1; i++) {
                    Datos.carnets[i]  = Datos.carnets[i + 1];
                    Datos.nombres[i]  = Datos.nombres[i + 1];
                    Datos.carreras[i] = Datos.carreras[i + 1];
                    Datos.edades[i]   = Datos.edades[i + 1];
                    Datos.correos[i]  = Datos.correos[i + 1];
                }

                // Limpiar la última posición sobrante
                Datos.carnets[Datos.cantidad - 1]  = null;
                Datos.nombres[Datos.cantidad - 1]  = null;
                Datos.carreras[Datos.cantidad - 1] = null;
                Datos.edades[Datos.cantidad - 1]   = 0;
                Datos.correos[Datos.cantidad - 1]  = null;

                // Reducir la cantidad total
                Datos.cantidad--;

                System.out.println("Estudiante eliminado correctamente");
            } else {
                System.out.println("Operación cancelada");
            }
        }
    }
}