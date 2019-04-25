package ejercicios;

import paquetedos.Operacion;

/**
 *
 * @author vysery98
 */
public class SeleccionSimple {

    public static void main(String[] args) {
        // método principal

        String miMensaje = Operacion.mensaje;
        int calificacion = 85;

        if (calificacion >= 85) {
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }

        int calificacion_2 = 45;

        if (calificacion_2 >= 85) {
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        }

    }
}
