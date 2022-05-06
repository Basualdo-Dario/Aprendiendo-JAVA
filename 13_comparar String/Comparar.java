import java.util.Scanner;

public class Comparar{
  public static void main(String args[]){

    Scanner entrada = new Scanner(System.in);
    String nombre_1 = "";
    String nombre_2 = "";
    
    
    System.out.print("ingrese el primer nombre : ");
    nombre_1 = entrada.nextLine();
    
   System.out.print("ingrese el segundo nombre : ");
   nombre_2 = entrada.nextLine();

   if(nombre_1.equalsIgnoreCase(nombre_2)){
   System.out.println("los nombres coinciden");
   }else{
         System.out.print("los nombres no coinciden");
     }
 }
}