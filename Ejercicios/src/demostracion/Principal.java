package demostracion;

import java.util.Scanner;

/**
 *
 * @author vysery98
 */
public class Principal {

    // calcular valor final mensual a pagar a empresa de telefonía por mensajes
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // scanner para ingreso de datos

        // declaracion de variables
        double valor_final; // calculo segun mensajes enviados sin calcular IVA
        double tarifa_basica = 3;// $3 por mes por enviar mensajes de texto
        double costo_extra; // $0.05 por cada mensaje después de los 40
        double costo_extra2; // $0.10 por cada mensaje después de los 200
        int cant_mensajes; //mensajes enviados por el usuario
        int mensajes_adicionales; // mensajes adicionales luego del mensaje n°40
        int mensajes_adicionales2; // luego del mensaje n°200
        double iva; // 12% iva
        double total; // calculo segun mensajes enviados + IVA

        System.out.println("Número de mensajes enviados: ");
        cant_mensajes = scan.nextInt();

        if (cant_mensajes > 200) {

            // calculo de costo extra para mensajes superiores a 200
                // para cálculo de $0.10 extra
            mensajes_adicionales2 = cant_mensajes - 200;
            costo_extra2 = mensajes_adicionales2 * 0.10;
                // para cálculo de $0.05 extra
            mensajes_adicionales = cant_mensajes - 40 - mensajes_adicionales2;
            costo_extra = mensajes_adicionales * 0.05;

            valor_final = tarifa_basica + costo_extra2 + costo_extra;

        } else {

            if (cant_mensajes > 40 && cant_mensajes <= 200) {

                mensajes_adicionales = cant_mensajes - 40;
                costo_extra = mensajes_adicionales * 0.05;

                valor_final = tarifa_basica + costo_extra;

            } else { // si son un maximo de 40 mensajes por mes

                valor_final = tarifa_basica;

            }
        }

        // proceso
        iva = valor_final * 0.12;
        total = valor_final + iva;

        // salida
        System.out.printf("Valor final mensual a pagar (incluido IVA) = %.2f",
                total);

    }

}
