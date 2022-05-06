import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{

 private JMenuBar menu;
 private JMenu ventana;
 private JMenuItem opcion1;
 private JMenuItem opcion2;
 private JMenuItem opcion3;

 public Menu(){
   setLayout(null);
 
   menu = new JMenuBar();
   setJMenuBar(menu);
 
   ventana = new JMenu ("opciones");
   menu.add(ventana);

   opcion1 = new JMenuItem("Rojo");
   opcion1.addActionListener(this);
   ventana.add(opcion1);

   opcion2 = new JMenuItem("Verde");
   opcion2.addActionListener(this);
   ventana.add(opcion2);
   
   opcion3 = new JMenuItem("Azul");
   opcion3.addActionListener(this);
   ventana.add(opcion3);

 }
 public void actionPerformed(ActionEvent e){
   Container fondo = this.getContentPane();

   if(e.getSource() == opcion1){

   	fondo.setBackground(new Color(255,0,0)); 
     }

   if(e.getSource() == opcion2){

   	fondo.setBackground(new Color(0,255,0));
     }

   if(e.getSource() == opcion3){

    	fondo.setBackground(new Color(0,0,255));
     }
 }

 public static void main(String args[]){
 
   Menu po = new Menu();
   po.setBounds(0,0,300,500);
   po.setVisible(true);
   po.setResizable(true);
   po.setLocationRelativeTo(null);  

 }
}