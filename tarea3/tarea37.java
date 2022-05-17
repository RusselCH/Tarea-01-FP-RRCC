package tarea3;

import java.util.Scanner;

/**
 * ejercicio37
 */
public class tarea37 {
    static Scanner lt = new Scanner(System.in);

    public static void main(String[] args) {
        // variables
        int edad;
        double promedio;
        String resbeca;
        // datos de entrada

        System.out.println("ingrese la edad: ");
        edad = lt.nextInt();
        System.out.println("ingrese su promedio: ");
        promedio = lt.nextDouble();
        // proceso
        if (edad > 18) {
            if (promedio >= 18) {
                resbeca = "le corresponde elmonto de S/ 2000";
            } else if (promedio >= 15) {
                resbeca = "le corresponde elmonto de S/ 1000";
            } else if (promedio < 15 && promedio >= 12) {
                resbeca = "le corresponde elmonto de S/ 500";
            } else {
                resbeca = "enviar una carta para que estudie";
            }
        } else {
            if (promedio >= 18) {
                resbeca = "le corresponde el monto de S/ 3000";
            } else if (promedio < 18 && promedio >= 16) {
                resbeca = "le corresponde el monto de S/ 2000";
            } else if (promedio < 16 && promedio >= 12) {
                resbeca = "le corresponde el monto de S/ 100";
            } else {
                resbeca = "enviar una carata para que estudie mas ";

            }

        }
        // datos de salida
        System.out.println(resbeca);

    }

}