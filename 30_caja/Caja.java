import javax.swing.*;
import java.awt.event.*;

public class Caja extends JFrame implements ItemListener{

  private JComboBox lista;
  private JButton cerrar;

 public Caja(){
   setLayout(null);

   lista = new JComboBox();
   lista.setBounds(10,10,100,30);
   add(lista);
   lista.addItem("Rojo");
   lista.addItem("Azul");
   lista.addItem("Verde");
   lista.addItem("Naranja");
   lista.addItemListener(this);


   cerrar = new JButton("cerrar");
   cerrar.setBounds(10,60,100,30);
   add(cerrar);   
   cerrar.addItemListener(this);
  }

 public void itemStateChanged(ItemEvent e){
   if(e.getSource() == lista){

     String texto = lista.getSelectedItem().toString();
     setTitle(texto);

     }
   if(e.getSource() == cerrar){
     
     System.exit(0);  
     }
 }

 public static void main (String args[]){
 
   Caja a1 = new Caja();
   a1.setBounds(0,0,300,200);
   a1.setVisible(true);
   a1.setResizable(false);
   a1.setLocationRelativeTo(null); 

 }
}  