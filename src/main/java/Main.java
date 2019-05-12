import java.io.IOException;
import java.util.Scanner;

/**
 * A simple example, used on the jsoup website.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Tareas tareas = new Tareas();

        Scanner scanner = new Scanner(System.in);

        char op;
        boolean bye = true;

        while (true) {
            System.out.print("------------------------------------------------------ \n");
            System.out.print("Seleccione:\na) Indicar la cantidad de lineas del recurso retornado.\n" +
                    "b) Indicar la cantidad de párrafos (p) que contiene el documento HTML.\n" +
                    "c) Indicar la cantidad de imágenes (img) dentro de los párrafos que contiene el archivo HTML.\n" +
                    "d) Indicar la cantidad de formularios (form) que contiene el HTML por categorizando por el método implementado POST o GET.\n" +
                    "e) Para cada formulario mostrar los campos del tipo input y su respectivo tipo que contiene en el documento HTML.\n" +
                    "f) Para cada formulario “parseado”,identificar que el método de envío del formulario sea POST y enviar una petición al servidor con el parámetro llamado asignatura y valor practica1 y un header llamado matricula con el valor correspondiente a matrícula asignada. Debe mostrar la respuesta por la salida estándar.\n" +
                    "s) Salir\nSeleccion: ");
            op = scanner.next().toUpperCase().charAt(0);
            switch (op) {
                case 'A':
                    tareas.parteA();
                    break;
                case 'B':
                    tareas.parteB();
                    break;
                case 'C':
                    tareas.parteC();
                    break;
                case 'D':
                    tareas.parteD();
                    break;
                case 'E':
                    tareas.parteE();
                    break;
                case 'F':
                    tareas.parteF();
                    break;
                case 'S':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }
}
