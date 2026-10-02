public class AgregarEstudiante {

    public static void ejecutar() {
        if (Datos.cantidad == 50) {
            System.out.println("No hay espacio para más estudiantes");
        } else {
            System.out.print("Ingrese el carnet: ");
            String carnet = Datos.sc.nextLine();

            System.out.print("Ingrese el nombre: ");
            String nombre = Datos.sc.nextLine();

            System.out.print("Ingrese la carrera: ");
            String carrera = Datos.sc.nextLine();

            System.out.print("Ingrese la edad: ");
            int edad = Datos.sc.nextInt();
            Datos.sc.nextLine(); // Limpiamos el buffer tras leer un int

            System.out.print("Ingrese el correo: ");
            String correo = Datos.sc.nextLine();

            // Guardamos los datos en el índice 'cantidad'
            Datos.carnets[Datos.cantidad]  = carnet;
            Datos.nombres[Datos.cantidad]  = nombre;
            Datos.carreras[Datos.cantidad] = carrera;
            Datos.edades[Datos.cantidad]   = edad;
            Datos.correos[Datos.cantidad]  = correo;

            // Incrementamos el contador
            Datos.cantidad++;
            System.out.println("Estudiante agregado correctamente");
        }
    }
}