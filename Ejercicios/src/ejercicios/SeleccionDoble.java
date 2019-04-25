package ejercicios;

import java.util.Scanner;
import paquetedos.Operacion;
/**
 *
 * @author vysery98
 */
public class SeleccionDoble {

    public static void main(String[] args) {
        //documentacion
        Scanner scan = new Scanner(System.in);

        String miMensaje = Operacion.mensaje;
        String miMensaje2 = Operacion.mensaje2;
        
        System.out.println("Ingrese el valor de la Calificacion 1: ");
        int calificacion = scan.nextInt();

        if (calificacion >= 85) {
            System.out.printf("%s %d\n", miMensaje, calificacion);
        } else{
            System.out.printf("%s %d\n", miMensaje2, calificacion);
        }
        
        System.out.println("Ingrese el valor de la Calificación 2: ");
        int calificacion_2 = scan.nextInt();
        
        if(calificacion_2 >= 45){
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        } else{
            System.out.printf("%s %d\n", miMensaje2, calificacion_2);
        }
    }

}
