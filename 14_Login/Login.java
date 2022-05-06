import java.util.Scanner;

public class Login{
  public static void main(String args[]){
    Scanner lit = new Scanner(System.in);  

    String nombre_1 = "" , nombre_2 = "";
    String nombre_a = "" , nombre_b = "";

    System.out.print("resgistre su nombre porfavor : ");
    nombre_1 = lit.nextLine();

    System.out.print("registre su clave porfavor : ");
    nombre_2 = lit.nextLine();

    System.out.println("***************");
    System.out.println("****Cargando***");
    System.out.println("***************");

    System.out.println("Bienvenido");
    System.out.print("ingrese su nombre de usuario porfavor : ");
    nombre_a = lit.nextLine();

    System.out.print("ingrese su clave por favor : ");
    nombre_b = lit.nextLine();

    if(nombre_1.equalsIgnoreCase(nombre_a)){

         System.out.println("nombre de usuario correcto");
   }else{
         System.out.println("nombre de usuario incorrecto");
     }
    if(nombre_2.equals(nombre_b) && nombre_1.equalsIgnoreCase(nombre_a) ){

     System.out.println("contraseña correcta");
    System.out.println("***************");
    System.out.println("****Cargando***");
    System.out.println("***************");
    System.out.println("***Bienvenido***");
   }else{
    System.out.println("clave incorrecta");
    System.out.println("***************");
    System.out.println("****Cargando***");
    System.out.println("***************");
    System.out.println("***SE CANCELA EL INGRESO***");
     }






 }
}