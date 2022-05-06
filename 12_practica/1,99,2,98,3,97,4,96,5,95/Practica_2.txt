public class Practica_2{
  public static void main(String args[]){
     int n = 100;
    for(int i = 1;i<=5;i++){
      n--;
       if(i <= 4){
      System.out.print(i + ", ");
      System.out.print(n + ", ");
      }else{
      System.out.print(i + ", ");
      System.out.print(n);
        }
    }

    System.out.println(" ");

    int a = 0 , b = 100 ;
    while(a <= 3){
     a++; 
     b--;
     System.out.print(a + ", ");
     System.out.print(b + ", ");
   }
   System.out.print("5, ");
   System.out.print("95");
   System.out.println(" ");
   
   int c = 0, d = 100;    

   do{
      c++;
      d--;
if(c <= 4){
      System.out.print(c + ", ");
      System.out.print(d + ", ");
      }else{
      System.out.print(c + ", ");
      System.out.print(d);
        }

    }while(c <= 4);


 }
}