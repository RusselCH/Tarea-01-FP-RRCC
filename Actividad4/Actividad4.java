package Actividad4;
import java.util.Scanner;
/**
 *Actividad4
 */
public class Actividad4 {
    static Scanner lt=new Scanner(System.in);
    public static void actividadrrcc41(){
        //definir variables
        int numerox;
        double salario=1500;
        double incremento=0.10;
        //datos de entrada y proceso y salida
        numerox=1;
        for (int i = 0; i < 6; i++){
            salario=salario+(salario*incremento); 
        System.out.println("el salario al cabo de "+(i+1)+" años es de:"+salario);
        }
    } 
    public static void actividadrrcc43() {
        //Definir variables
        int conta0=0,mas=0,menos=0, n,num;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de numeros : ");
        n=lt.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Dame un numero: ");
            num=lt.nextInt();
            if (num<0) {
                mas=mas+1;
            } else if (num==0) {
                conta0=conta0+1;
            } else {
                menos=menos+1;
            }
        }
        System.out.println("cantidad de numeros igual a 0 es: "+conta0);
        System.out.println("cantidad de numeros mayor a 0 es: "+mas);
        System.out.println("cantidad de numeros menor a 0 es: "+menos);
    }
    public static void actividadrrcc48() {
        //Definir variables
        int anhos;
        double saldo=0, interes=0, total=0, deposito=0;
        //Datos de entrada
        System.out.println("Ingrese los años de ahorros: ");
        anhos=lt.nextInt();
        //Proceso
        while (anhos>0) {
            for (int i = 0; i < 12; i++) {
            System.out.println("ingrese el deposito del mes "+(i+1)+":");
            deposito=lt.nextDouble();
            saldo=saldo+deposito;
        }



        interes=interes+(saldo*0.10);
        total=saldo+interes;
        anhos=anhos-1;
        }
        //Datos de salida
        System.out.println("Tu ahorro en el año es: "+saldo);
        System.out.println("El interes ganado es: "+interes);
        System.out.println("Tu ahorro ya con interes es: "+total);
        System.out.println(" ");
    }
    public static void actividadrrcc49() {
        //Definir datos
        int numero;
        int salones;
        int edad;
        int suma=0;
        int total=0,alumnos=0;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de salones: ");
        salones=lt.nextInt();
        while (salones>0) {
            System.out.println("Ingrese la cantidad de alumnos: ");
            numero=lt.nextInt();
            for (int i = 0; i < numero; i++) {
                System.out.println("Ingrese la edad del alumno: "+(i+1));
                edad=lt.nextInt(); 
                suma=suma+edad;
            }
            System.out.println("El promedio del salon "+salones+" es: "+(suma/numero)+" años");
            alumnos = alumnos + numero;
            total = total + suma;
	        salones = salones - 1;
            suma=suma*0;
        }
        System.out.println("El promedio de toda la escuela es: "+(total/alumnos)+" años");
    }
    public static void actividadrrcc411(){
        Scanner in = new Scanner(System.in); 
        //definir variables
        int bi10, bi20, bi50, bi100, bi200;
        int mone01, mone02, mone05, mone_1, mone_2, mone_5;
        int total;
        //datos de entrada y salida
        System.out.print("Ingresa el valor de billetes de 10: ");
        bi10 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 20: ");
        bi20 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 50: ");
        bi50 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 100: ");
        bi100 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 200: ");
        bi200 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 01: ");
        mone01 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 02: ");
        mone02 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 05: ");
        mone05 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 1: ");
        mone_1= in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 2: ");
        mone_2 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 5: ");
        mone_5 = in.nextInt();
        in.nextLine();
        total=bi10*10+bi20*20+bi50*50+bi100*100+bi200*200+mone01*01+mone02*02+mone05*05+mone_2*2+mone_5*5+mone_1;
        System.out.println("Valor de total: " + total);
    }
    public static void actividadrrcc412() {
        //Definir variables
        int nm;
        int venta;
        double a=0;
        double b=0;
        double c=0;
        double t=0,t1=0,t2=0,t3=0;
        //datos de entrada
        System.out.println("Ingrese el numero de ventas realizadas: ");
        nm=lt.nextInt();
        while (nm>0) {
            System.out.println("Ingresa el monto de la venta realizada "+nm);
            venta=lt.nextInt();
            if (venta>=20000){
			    a = a + 1;
			    t1 = t1+venta;
            }else if (venta>=10000 && venta<20000){
				b = b + 1;
				t2 = t2 + venta;
            }else{
				c = c + 1;
				t3 = t3 + venta;
            }
			t = t + venta;
		    nm = nm - 1;
       }
        System.out.println("Numero de ventas mayores a $20,000 es: "+a);
        System.out.println("El total de las ventas mayores a $20,000 es: "+t1);
	    System.out.println("Numero de ventas mayores a $10,000 y menores a $20,000 es: "+b);
	    System.out.println("El total de las ventas mayores a $10,000 y menores a $20,000 es: "+t2);
	    System.out.println("Numero de ventas menores a $10,000 es: "+c);
	    System.out.println("El total de las ventas menores a $10,000: "+t3);
	    System.out.println("El monto total de la ventas es: $"+t);
    }
    public static void actividadrrcc416(){
        //definir variables
        int M ;
        //datos de entrada y salida
        System.out.println("ingrese un numero entero ");
        Scanner valor1 = new Scanner(System.in);
        M = valor1.nextInt();

        int multiplicador = 1;
        while(multiplicador <=10){
        System.out.println(M + " X " + multiplicador + " = " + M * multiplicador );
        multiplicador++;
    
        }
    } 
    public static void actividadrrcc420() {
        Scanner in = new Scanner(System.in); 
        //definir variables
        int monedas1, monedas2, monedas5, billetes10, billetes20, billetes50;
        int cantdinero;
        //datos de entrada y salida
        System.out.print("Ingresa una cantidad de monedas de 1: ");
        monedas1 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa una cantidad de monedas de 2: ");
        monedas2 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa una cantidad de monedas de 5: ");
        monedas5 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa una cantidad de billetes de 10: ");
        billetes10 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa cantidad de billetes de 20: ");
        billetes20 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa una cantidad de billetes de 50: ");
        billetes50 = in.nextInt();
        in.nextLine();
        cantdinero=(monedas1*1)+(monedas2*1)+(monedas5*1)+(billetes10*1)+(billetes20*1)+(billetes50*1);
        System.out.println(" cantidad de dinero: " + cantdinero);
    }
    public static void actividadrrcc424() {
        //definir variables
        int intentos = 4;
        int numero;
        boolean logrado = false;
        //datos de entrada proceso y salida
        
        do {
          System.out.print("Introduzca la clave de la caja fuerte:) ");
          numero = Integer.parseInt(System.console().readLine());
          
          if (numero == 2022) {
            logrado = true;
          } else {
            System.out.println("Clave incorrecta :(");
          }
          
          intentos--;
      
        } while((intentos > 0) && (!logrado));
        
        if (logrado) {
          System.out.println("Ha abierto la caja fuerte FELICIDADES:)");
        } else {
          System.out.println("Lo siento, ha agotado las 4 oportunidades :(");
        }
      }
      public static void actividadrrcc425() {
        //DEFINIR VARIABLES
        double n = 0;
        double numero = 0;
        double suma = 0;
        //datos de entrada y salida
        System.out.println("Calcula la media de los números positivos introducidos");
        System.out.println("Parar, introduzca un número negativo");
        System.out.println("Vaya introduciendo números:");
    
        while (numero >= 0) {
          numero = Double.parseDouble(System.console().readLine());
          n++;
          suma += numero;
        }
        
        System.out.print("La media de los números positivos introducidos es ");
        System.out.println((suma - numero) / (n - 1));
      }
    public static void main(String[] args) {
        actividadrrcc412();
    }
    public static Scanner getLt() {
        return lt;
    }
    public static void setLt(Scanner lt) {
        Actividad4.lt = lt;
    }
    @Override
    public String toString() {
        return "Actividad4 []";
    }
}