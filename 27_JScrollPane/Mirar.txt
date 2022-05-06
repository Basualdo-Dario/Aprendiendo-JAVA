import javax.swing.*;
import java.awt.event.*;

public class Mirar extends JFrame implements ActionListener{
 private JButton bt;
 private JTextField txt;
 private JScrollPane abajo,al;
 private JTextArea book;

 public Mirar(){
   setLayout(null);
   bt = new JButton("cerrar");
   bt.setBounds(10,400,100,30);
   add(bt);
   bt.addActionListener(this);

   txt = new JTextField();
   al = new JScrollPane(txt);
   al.setBounds(10,10,200,30);
   add(al);

   book = new JTextArea();
   abajo = new JScrollPane(book);
   abajo.setBounds(10,50,200,300);
   add(abajo); 

 }

 public void actionPerformed(ActionEvent evento){
   if(evento.getSource() == bt){
     
     System.exit(0); 
   }
 }

 public static void main (String args[]){

   Mirar a1 = new Mirar();
   a1.setBounds(0,0,300,500);
   a1.setVisible(true);
   a1.setResizable(false);
   a1.setLocationRelativeTo(null);
  }
}