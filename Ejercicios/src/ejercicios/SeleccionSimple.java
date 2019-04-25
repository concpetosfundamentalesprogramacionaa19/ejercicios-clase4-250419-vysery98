package ejercicios;

import java.util.Scanner;
import paquetedos.Operacion;

/**
 *
 * @author vysery98
 */
public class SeleccionSimple {

    public static void main(String[] args) {
        // método principal
        Scanner scan = new Scanner(System.in); // scanner para ingreso de datos

        String miMensaje = Operacion.mensaje;

        System.out.println("Ingrese el valor de la calificacion 1: ");
        int calificacion = scan.nextInt();

        if (calificacion >= 85) {
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }

        System.out.println("Ingrese el valor de la calificación 2: ");
        int calificacion_2 = scan.nextInt();

        if (calificacion_2 >= 85) {
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        }

    }
}
