import java.util.Scanner;

public class Matrices_d{
  public static void main(String args[]){
  Scanner pio = new Scanner(System.in);
  int fila = 0 , columna = 0 , a = 0 ;

  System.out.println("hola, por favor introdusca el volumen de la matris");
  System.out.print("filas : ");
  fila = pio.nextInt();

  System.out.print("columnas : ");
  columna = pio.nextInt();

  int cuadrado [] [] = new int [fila] [columna] ;



  for(int i = 0 ; i < fila  ; i++){

    System.out.print(a + "_" + i +"_introdusca valor : ");
     
    cuadrado [i] [a] = pio.nextInt();
  
  if(a < columna - 1 && i == fila - 1 ){
          a++;
          i = 0 - 1;
          
      }
    } 
  System.out.println("***************");
  System.out.println("***su matris***");
  System.out.println("***************");

 a = 0;

 for(int i = 0 ; i < fila  ; i++){
     
   System.out.print(" ["+ cuadrado [i] [a] + "] "); 
  
  if(a < columna - 1 && i == fila - 1 ){
          a++;
          i = 0 - 1;
          System.out.println("");
      }
    } 



 }
}