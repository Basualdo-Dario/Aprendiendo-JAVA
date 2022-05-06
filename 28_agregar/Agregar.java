import javax.swing.*;
import java.awt.event.*;

public class Agregar extends JFrame implements ActionListener{
 private JTextField txt;
 private JScrollPane sep;
 private JTextArea book;
 private JButton bt1,bt2;

 String texto = ""; 
 public Agregar(){

   setLayout(null);
   txt = new JTextField();
   txt.setBounds(10,10,200,30);
   add(txt);
  
   book = new JTextArea();
   sep = new JScrollPane (book);
   sep.setBounds(10,50,400,300);
   add(sep); 

   bt1 = new JButton ("Agregar");
   bt1.setBounds(250,10,100,30);
   add(bt1);
   bt1.addActionListener(this);
 
   bt2 = new JButton ("cerrar");
   bt2.setBounds(310,400,100,30);
   add(bt2);
   bt2.addActionListener(this);
  
  }

 public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == bt1){

    texto += txt.getText() + "\n";
    book.setText(texto);
    txt.setText("");

   }

   if(evento.getSource() == bt2){

   System.exit(0); 
   }
  }

 public static void main(String args[]){
   Agregar lis = new Agregar();
   lis.setBounds(0,0,450,500);
   lis.setVisible(true);
   lis.setResizable(false);
   lis.setLocationRelativeTo(null);

 }
}