package subprogramas;

import java.util.Scanner;

public class ClaseGeneral {


    static Scanner leerT=new Scanner(System.in);
    static Aritmetica obj=new Aritmetica();
    static Persona objP=new Persona();

    public static void main(String[] args) {
        /*System.out.println("Ingrese el Primer Valor:");
        int aX=leerT.nextInt();
        System.out.println("Ingrese el Segundo Valor:");
        int bX=leerT.nextInt();
        int result=obj.sumar(aX, bX);
        System.out.println("La suma es:"+result);*/
        System.out.println("ingrese su nombre:");
        objP.nombre=leerT.next();
        System.out.println("ingrese su DNI:");
        objP.dni=leerT.next();
        System.out.println("ingrese una comida:");
        objP.comer(leerT.next());
    }
    
}
