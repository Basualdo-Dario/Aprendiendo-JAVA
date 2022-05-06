import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Colores extends JFrame implements ActionListener{

 private JComboBox com1,com2,com3;
 private JLabel    lab1,lab2,lab3;
 private JButton   bt1;

 public Colores(){
  setLayout(null);

  com1 = new JComboBox();
  com1.setBounds(150,10,50,50);
  for(int i = 0 ; i <= 255 ;i++){
  
    com1.addItem(String.valueOf(i));
  }
  add(com1);

  com2 = new JComboBox();
  com2.setBounds(150,50,50,50);
  for(int i = 0; i <= 255 ;i++){
  
    com2.addItem(String.valueOf(i));
  }
  add(com2);

  com3 = new JComboBox();
  com3.setBounds(150,90,50,50);
  for(int i = 0; i <= 255 ;i++){
  
    com3.addItem(String.valueOf(i));
  }
  add(com3);


  lab1 = new JLabel("Rojo");
  lab1.setBounds(10,10,100,30);
  add(lab1); 

  lab2 = new JLabel("Verde");
  lab2.setBounds(10,50,100,30);
  add(lab2);                
 
  lab3 = new JLabel("Azul");
  lab3.setBounds(10,90,100,30);
  add(lab3);  


  bt1 = new JButton("Mesclar");
  bt1.setBounds(10,130,100,30);
  add(bt1);
  bt1.addActionListener(this);              
                
  }

 public void actionPerformed(ActionEvent e){
   if(e.getSource() == bt1){
     String lom1 = com1.getSelectedItem().toString();
     String lom2 = com2.getSelectedItem().toString();
     String lom3 = com3.getSelectedItem().toString();

     int rojo = Integer.parseInt(lom1);
     int verde  = Integer.parseInt(lom2);
     int azul = Integer.parseInt(lom3); 

     Color color1 = new Color(rojo,verde,azul);

     bt1.setBackground(color1);

    }
  }

 public static void main(String args[]){

   Colores a21 = new Colores();
   a21.setBounds(0,0,250,250);
   a21.setVisible(true);
   a21.setResizable(false);
   a21.setLocationRelativeTo(null);  

  }
}