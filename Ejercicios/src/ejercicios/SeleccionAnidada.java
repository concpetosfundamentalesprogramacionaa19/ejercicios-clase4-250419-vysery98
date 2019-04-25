package ejercicios;

import java.util.Scanner;
import paquetedos.OperacionDos;

/**
 *
 * @author vysery98
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion

        Scanner scan = new Scanner(System.in); // scanner para ingreso de datos
        System.out.println("Ingrese la calificacion: ");
        int calificacion = scan.nextInt();
        // comparacion de calificacion para presentacion de mensaje final
        if (calificacion >= 90) {
            System.out.printf("%s %d\n", OperacionDos.mensaje, calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("%s %d\n", OperacionDos.mensaje2,
                        calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("%s %d\n", OperacionDos.mensaje3,
                            calificacion);
                } else {
                    System.out.printf("%s %d\n", OperacionDos.mensaje4,
                            calificacion);
                }
            }
        }

    }
}
