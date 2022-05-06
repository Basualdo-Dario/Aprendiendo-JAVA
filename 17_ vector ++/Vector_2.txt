import java.util.Scanner;

public class Vector_2{
  public static void main(String args[]){

  Scanner po = new Scanner(System.in);
  int longitud = 0 ,guardar = 0 , respuesta = 0;
  
  System.out.print("por favor ingrese el numero de espacios que necesita : ");
  longitud = po.nextInt();

  int vector [] = new int[longitud];
  int suma [] = new int[longitud]; 
  
  System.out.println("");
  System.out.println("****ahora proceda a cargar los valores****");
  System.out.println("");

  for(int i = 0; i < vector.length; i++){
      System.out.print(i + "_ingrese valor :");
      guardar = po.nextInt();
      
      vector [i] = guardar;
      guardar = 0;

   }

  for(int i = 0; i < vector.length; i++){
    
    System.out.println(vector[i]);

   }

  System.out.println("");
  System.out.println("*** desea sumar los valores ***");
  System.out.println("*** 1= Si ***");
  System.out.println("*** 2= No *** ");
  respuesta = po.nextInt();
  System.out.println("");

if(respuesta == 1){

  for(int i = 0 ; i < vector.length; i++ ){
      suma[0] += vector[i];
      
      } 
   System.out.println("el resultado es : " + suma[0]); 

  }else{
   System.out.println("");
   System.out.println("*** Adios ***");
   System.out.println("");
  }














 }
}