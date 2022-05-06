import java.util.Scanner;

public class Cortar{
  public static void main(String args[]){
  Scanner tecl = new Scanner(System.in);
  String caracter = "";
  int desde = 0, hasta = 0;

  System.out.print("ingrese una linea de caracteres por favor: ");
  caracter = tecl.nextLine();
  System.out.println("el numero de caracteres es el siguente : " + caracter.length());

  System.out.println("ingrese desde y hasta donde desea cortar el caracter");

  System.out.print("Desde : ");
  desde = tecl.nextInt(); 
  System.out.print("Hasta : ");
  hasta = tecl.nextInt();

  System.out.println(caracter.substring(desde,hasta));

 }
}