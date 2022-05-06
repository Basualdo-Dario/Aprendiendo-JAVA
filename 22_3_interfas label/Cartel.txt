import javax.swing.*;

public class Cartel extends JFrame{
  private JLabel letra;
  private JLabel letra_2;
  private JLabel letra_3;

 public Cartel(){

  setLayout(null);
  letra = new JLabel("Nombre :");
  letra.setBounds(10,20,300,30);
  add(letra);
  
  letra_2 = new JLabel("Dario Basualdo");
  letra_2.setBounds(65,20,300,30);
  add(letra_2);

  letra_3 = new JLabel ("***** Bienvenido *****");
  letra_3.setBounds(10,40,300,30);
  add(letra_3);

  }

 public static void main(String args[]){

  Cartel foto = new Cartel();
  foto.setBounds(0,0,200,120);
  foto.setVisible(true);
  foto.setLocationRelativeTo(null);
  foto.setResizable(false);	

 }
}
