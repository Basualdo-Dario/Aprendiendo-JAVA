public class Practica{
  public static void main(String args[]){
    
    for(int i = 1;i <= 10; i++){
        if(i <= 9){
     System.out.print(i + ", "); 

     }else{
       System.out.print(i);       
       }
     }

    System.out.println(" ");

    int i= 0;

    while(i<=9){
     i++;
     if(i <= 9){
     System.out.print(i + ", ");
       }else{
          System.out.print(i);
        }
      }
       System.out.println(" "); 

     int a= 0;

     do{
     a++;
     if(a <= 9){
     System.out.print(a + ", ");
       }else{
          System.out.print(a);
         }
     }while(a <= 9);
  
     
   }
}