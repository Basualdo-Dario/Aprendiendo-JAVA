import java.util.Scanner;

public class Vacaciones{

public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  String nombre = "";
  int clave = 0, antiguedad = 0;

  System.out.println("Ingrese su nombre:");
  nombre = in.nextLine();

System.out.println("ingrese el tiempo trabajado  por favor:"); 
  antiguedad = in.nextInt();

  System.out.println("Ingrese su Clave porfavor:");
  clave = in.nextInt();
 
  

  if(clave == 1){
      
      

     if(antiguedad == 1){
       System.out.println("Hola " + nombre + " sus dias de vacaciones son: 6 dias");
     }
       else if(antiguedad >= 2 && antiguedad <= 6){
         System.out.println("Hola " + nombre + " sus dias de vacaciones son: 14 dias");
       }
         else if(antiguedad >= 7){
           System.out.println("Hola " + nombre + " sus dias de vacaciones son: 20 dias");
         }
           else{
             System.out.println("Nose ha encontrado esa opcion");
           } 
  }

     else if(clave == 2){ 

     if(antiguedad == 1){
       System.out.println("Hola " + nombre + " sus dias de vacaciones son: 7 dias");
     }
       else if(antiguedad >= 2 && antiguedad <= 6){
         System.out.println("Hola " + nombre + " sus dias de vacaciones son: 15 dias");
       }
         else if(antiguedad >= 7){
           System.out.println("Hola " + nombre + " sus dias de vacaciones son: 22 dias");
         }
           else{
             System.out.println("Nose ha encontrado esa opcion");
           } 
     }


       else if(clave == 3){

     if(antiguedad == 1){
       System.out.println("Hola " + nombre + " sus dias de vacaciones son: 10 dias");
     }
       else if(antiguedad >= 2 && antiguedad <= 6){
         System.out.println("Hola " + nombre + " sus dias de vacaciones son: 20 dias");
       }
         else if(antiguedad >= 7){
           System.out.println("Hola " + nombre + " sus dias de vacaciones son: 30 dias");
         }
           else{
             System.out.println("Nose ha encontrado esa opcion");
           } 

       } 
         else{
           System.out.println("Nose ha encontrado esa opcion");
         }  

 }
}


