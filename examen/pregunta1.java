import java.util.Scanner;
public class pregunta1{
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    //definir variables
    double nota =0, exaC =0, exaE=0, exaT =0;
    //datos de entrada
    System.out.print("cual es la nota del postulante: ");
    nota = in.nextInt();
    if(nota>=17 && nota<=20){
      exaC = nota * 0.40;
      exaE = nota * 0.35;
      exaT = nota * 0.25;
      System.out.println("el examen de conocimiento vale el 40%, y el postulando obtuvo de puntaje :"+exaC);
      System.out.println("la entrevista personal vale el 35%, y el postulante obtuvo de puntaje: "+exaE);
      System.out.println("el test psicologico vale el 25%, y el postulante obtuvo de puntaje: "+exaT);
      System.out.println("la suma total del puntaje del estudiante es: "+nota);
      System.out.print("el postulante obtiene la vacante y el nivel del estudiante es 4");
;
    }else if(nota<17 && nota>=14){
      exaC = nota*0.40;
      exaE = nota*0.35;
      exaT = nota*0.25;
      System.out.println("el examen de conocimiento vale el 40%, y el postulando obtuvo de puntaje :"+exaC);
      System.out.println("la entrevista personal vale el 35%, y el postulante obtuvo de puntaje: "+exaE);
      System.out.println("el test psicologico vale el 25%, y el postulante obtuvo de puntaje: "+exaT);
      System.out.println("la suma total del puntaje del estudiante es: "+nota);
      System.out.print("el postulante obtiene la vacante y el nivel del estudiante es 3");
    }else if(nota<14 && nota >=11){
      exaC = nota*0.40;
      exaE = nota*0.35;
      exaT = nota*0.25;
      System.out.println("el examen de conocimiento vale el 40%, y el postulando obtuvo de puntaje :"+exaC);
      System.out.println("la entrevista personal vale el 35%, y el postulante obtuvo de puntaje: "+exaE);
      System.out.println("el test psicologico vale el 25%, y el postulante obtuvo de puntaje: "+exaT);
      System.out.println("la suma total del puntaje del estudiante es: "+nota);
      System.out.print("el postulante obtiene la vacante y el nivel del estudiante es 2");
    }else if(nota<11){
      exaC = nota*0.40;
      exaE = nota*0.35;
      exaT = nota*0.25;
      System.out.println("el examen de conocimiento vale el 40%, y el postulando obtuvo de puntaje :"+exaC);
      System.out.println("la entrevista personal vale el 35%, y el postulante obtuvo de puntaje: "+exaE);
      System.out.println("el test psicologico vale el 25%, y el postulante obtuvo de puntaje: "+exaT);
      System.out.println("la suma total del puntaje del estudiante es: "+nota);
      System.out.print("el postulante no obtiene la vacante y el nivel del estudiante es 1");
      
    }else{
      System.out.print("Error, la nota no debe pasar de 20.");
    }
  }
}


    

