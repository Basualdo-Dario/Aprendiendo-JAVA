import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame implements ActionListener{
 JButton boton1; 

 public Boton(){
  setLayout(null);
  boton1 = new JButton("cerrar");
  boton1.setBounds(0,0,100,30);
  add(boton1);
  boton1.addActionListener(this);
   }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
   System.exit(0);

    }  
   } 

 public static void main(String args[]){
  Boton cerrar = new Boton();
  cerrar.setBounds(0,0,300,200);
  cerrar.setVisible(true);
  cerrar.setLocationRelativeTo(null);
  cerrar.setResizable(false);

 }
}