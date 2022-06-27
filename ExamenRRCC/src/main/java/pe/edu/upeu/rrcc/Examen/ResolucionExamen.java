package pe.edu.upeu.rrcc.examen;

import java.util.Scanner;

public class ResolucionExamen {
    Scanner leer = new Scanner(System.in);

    public void examen02lvm() {
        // definir variables
        int i, n = 3;
        double cate1, cate2, cate3, clave, costo;
        double impuesto, impuestopagar;
        cate1 = 0;
        cate2 = 0;
        cate3 = 0;
        impuestopagar = 0;
        // datios de entrada proceso y salida
        System.out.print("Ingresa el numero de autos: ");
        n = leer.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print("PROCESO " + i);

            System.out.print("   Ingresa la categoria 1-2-3 : ");
            clave = leer.nextDouble();

            leer.nextLine();
            System.out.print("Ingresa el costo del vehiculo: ");
            costo = leer.nextDouble();
            leer.nextLine();
            impuesto = 0;
            if (clave == 1) {
                impuesto = costo * 0.1;
                cate1 = cate1 + impuesto;
            }
            if (clave == 2) {
                impuesto = costo * 0.07;
                cate2 = cate2 + impuesto;
            }
            if (clave == 3) {
                impuesto = costo * 0.05;
                cate3 = cate3 + impuesto;
            }
            impuestopagar = impuestopagar + impuesto;
            System.out.println("total del impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("total del impuesto categoria 1: " + cate1);
        System.out.println("total del impuesto categoria 2: " + cate2);
        System.out.println("total del impuesto 3: " + cate3);
        System.out.println("total a pagar del impuesto es de : " + impuestopagar);
    }

    

    public void examen03lvm() {
        // datos de entrada
        int n;
        // definir variables
        System.out.print("ingrese la altura de la X:");
        n = leer.nextInt();
        if (n >= 3 && n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j || i + j == n + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();

            }
        } else {
            System.out.println("no es valido :(");
        }
    }

    

    public void examen04lvm() {
        int i, j, suma, sec = 0;
        System.out.println("Ingrese cuantos numeros perfectos desea mostrar: ");
        int canti = leer.nextInt();
        System.out.println("Los numero perfectos son: ");
        for (i = 1; i > 0; i++) {

            suma = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (i == suma) {

                sec++;
                if (sec <= canti) {
                    System.out.println(i);
                } else {
                    break;
                }
            }
        }
    }

    public void examen05lvm() {
        // definir variables

        int n;
        Scanner sistemadecimal = new Scanner(System.in);
        // datos de entrada proceso y salida

        do {
            System.out.print("Introduzca un numero: ");
            n = sistemadecimal.nextInt();
        } while (n < 0);
        System.out.println();
        System.out.print(" a binario: ");
        hola(n);
        System.out.println();
    }

    public static void hola(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            hola(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
}