import java.util.Scanner;
 
public class Vector{
  public static void main(String args[]){

  Scanner pio = new Scanner(System.in);
  int vector[] = new int[5];
  int guardar = 0;

  System.out.println("hola,bienvenido, en este vector puedes guardar 5 archivos");
  System.out.println("empezando desde el cero hasta el 4");
  System.out.println("");

  for(int i = 0;i < 5; i++){

     System.out.println("posicion n :" + i);
   
     System.out.print("numero a guardar : ");
     guardar = pio.nextInt();
 
     vector[i]= guardar;
     guardar  = 0;

    } 
  for(int a = 0 ; a < 5; a++){

     System.out.println(vector[a]);

    }
  

 }
}