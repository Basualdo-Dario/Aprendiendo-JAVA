import javax.swing.*;

public class Formulario extends JFrame{
private JLabel label1 ;


public Formulario(){
  setLayout(null);
  label1 = new JLabel("Dario crack");
  label1.setBounds(150,200,500,600); 
  add(label1);

  }

public static void main(String args[]){

  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,200,200);
  formulario1.setVisible(true);
  formulario1.setLocationRelativeTo(null);

 }
}