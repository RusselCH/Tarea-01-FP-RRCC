import java.math.*;
import java.util.Scanner;

public class hipotenusa {
    public static void main(String[] args) {
        //definir variables
        double a,b,c;
        //datos de entrada
        Scanner lt =new Scanner(System.in); 
System.out.println("ingrese el lado a:");
a=lt.nextDouble();
System.out.println("ingrese el lado b");
b=lt.nextDouble();
//proceso
c=Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));
//datos de salida 
System.out.println("la hipotenusa: "+c);




    }
}
