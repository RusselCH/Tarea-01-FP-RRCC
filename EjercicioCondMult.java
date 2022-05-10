import java.util.Scanner;

/**
 * EjercicioCondMult
 */
public class EjercicioCondMult {
    public static void profesor(){
        System.out.println("La funcion del docente es enseñar");

    }
    public static void estudiante() {
        System.out.println("la funcion del estudiante es aprender");
    }
    public void maquinadRRPC() {
        System.out.println("la funcion de la pc es procesar informacion");
    }
    public void proyector() {
        System.out.println("proyectar una imagen, informacion");
    }

    public static void main(String[] args) {
        
        
        EjercicioCondMult objx=new EjercicioCondMult();

        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el alforitmo que desea probar\nl=profesor"+
        "\n2=estudiante\n3=maquinadRRPC\n4=proyector");
        int opcMet=lt.nextInt();
        switch (opcMet) {
            case 1:{profesor();  }break;
            case 2: estudiante();break;
            case 3: objx.maquinadRRPC();break;
            case 4: objx.proyector();break;
                
        
            default: System.err.println("opcion no existe");break;
        }
    }
}