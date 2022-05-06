import javax.swing.*;

public class Cuadrado extends JFrame{

  public Cuadrado(){
   setLayout(null);

}
  public static void main(String args[]){
   
  Cuadrado inicio = new Cuadrado();
  inicio.setBounds(0,0,400,550);
  inicio.setVisible(true); 
  inicio.setLocationRelativeTo(null);
  inicio.setResizable(false);

 } 
}