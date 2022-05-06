public class Operaciones{
  public static void main(String args[]){
  
   int num_uno = 5, num_dos = 3, resultado = 0;
   
   int parametro = 2;

   switch(parametro){

     case 1: 
            resultado = num_uno + num_dos;
            System.out.println ("su resultado es: " + resultado);
            break;
     case 2:
            resultado = num_uno - num_dos;
            System.out.println ("su resultado es: " + resultado);
            break;

    default: System.out.println("ERROR");
            break; 
 

   }
 }
}