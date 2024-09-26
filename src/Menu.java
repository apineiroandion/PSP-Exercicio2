import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);
    String nombreArchivo;
    public Menu(GestorProcesos gp) {
    }
    /**
     * Metodo que muestra el menú principal y solicita una opción al usuario
     */
    public void mostrarMenu(GestorProcesos gp) {
        System.out.println("1. Crear Archivo");
        System.out.println("2. Editar Archivo");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduce el nombre del archivo a crear: ");
                nombreArchivo = scString.nextLine();
                gp.crearArchivo(nombreArchivo);
                break;
            case 2:
                System.out.println("Introduce el nombre del archivo a editar: ");
                nombreArchivo = scString.nextLine();
                gp.editarArchivo(nombreArchivo);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida");
        }
        mostrarMenu(gp);
    }
}
