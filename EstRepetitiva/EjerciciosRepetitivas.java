package EstRepetitiva;

public class EjerciciosRepetitivas {

    public static void ejer41while() {
        int contador=1;
        int suma=0;
       while (contador<=20) {
            if (contador%2==0) {
                suma=suma+contador; 
            }
            contador++;  
        }
        System.out.println("la respuesta es:"+suma);  
        public static void pregunta2DMP() {
            System.out.println("Ingrese el operador:");
            char operador=lt.next().charAt(index:0);
            switch(operador) {
                case '+': System.out.println("debes sumar:"); break;
                case '%': System.out.println("debes sacar el modulo"); break;
                default: break;  
            }     
    }
    public static void main(String[] args) {
         pregunta2DMP();
     }
       
}
