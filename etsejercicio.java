import java.util.Scanner;

/**
 * etsejercicio
 */
public class etsejercicio {
    static Scanner lt=new Scanner(System.in);
    
    public static void main(String[] args) {
            //Declarar variables
            int edad;
            double promedio;
            String resBeca;
            //Datos de entrada
            System.out.println("ingrese la edad:");
            edad=lt.nextInt();
            System.out.println("ingrese el promedio:");
            promedio=lt.nextDouble();
            //proceso
            if (edad>18) {
                if (promedio>=18) {
                    resBeca="le corresponde el monto de s/.2000";
                }else if(promedio>=15){
                    resBeca="le correponde el monto de s/.1000";
                }else if(promedio<15 && promedio>=12){
                    resBeca="le corresponde el monto de s/.500";
                }else {
                    resBeca="enviar una carta para que estudie";
            }
            } else {
                if(promedio>=18){
                    resBeca="le corresponde el monto de s/.3000";
                }else if(promedio<18 && promedio>=16){
                    resBeca="le corresponde el monto de s/.2000";
                }else if(promedio<16 && promedio>=12){
                    resBeca="le corresponde el monto de s/.100";
                }else{
                    resBeca="enviar una carta para que estudie";
                }

                
            }
            //Datos de salida 
            System.out.println(resBeca);


            
    }

}