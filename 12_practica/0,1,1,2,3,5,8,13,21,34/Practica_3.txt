public class Practica_3{
  public static void main(String args[]){

    int a = 0 , b = 1 , c = 0;

    for(int i = 0; i <10;i++){
    if(i<=8){
      System.out.print(a + ","); 
      c = a + b;
      a = b;
      b = c;
   
     }else{
        System.out.print(a); 
      }
   }
System.out.println(" ");

     a = 0;
     b = 1;
     c = 0;
     int i = 0;
     while(i<10){
     i++;
     if(i<=9){
        System.out.print(a + ","); 
        c = a + b;
        a = b;
        b = c;
     }else{
        System.out.print(a);
      }
    } 

System.out.println(" ");

     a = 0;
     b = 1;
     c = 0;
     i = 0;


    do{
     i++;
     if(i<=9){
        System.out.print(a + ","); 
        c = a + b;
        a = b;
        b = c;
     }else{
        System.out.print(a);
      }

    }while(i < 10);  


 }
}