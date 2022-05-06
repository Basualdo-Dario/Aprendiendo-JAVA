import javax.swing.*;
import java.awt.event.*;

public class Sumar extends JFrame implements ActionListener{
 private JLabel texto1;
 private JLabel texto2;
 private JLabel resultado_m;

 private JTextField num1;
 private JTextField num2;

 private JButton sumar;
 private JButton cerrar; 
  
 public Sumar(){
   setLayout(null);

   texto1 = new JLabel("primer num:");
   texto1.setBounds(10,10,100,30);
   add(texto1);  

   texto2 = new JLabel("segundo num:");
   texto2.setBounds(10,50,100,30);
   add(texto2);

   resultado_m = new JLabel("Resultado:");
   resultado_m.setBounds(10,90,100,30);
   add(resultado_m); 

   num1 = new JTextField();
   num1.setBounds(120,10,100,30);
   add(num1);
   
   num2 = new JTextField();
   num2.setBounds(120,50,100,30);
   add(num2);

   sumar = new JButton("sumar");
   sumar.setBounds(10,130,100,30);
   add(sumar);
   sumar.addActionListener(this);

   cerrar = new JButton("cerrar");
   cerrar.setBounds(120,130,100,30);
   add(cerrar); 
   cerrar.addActionListener(this);
     
 }

 public void actionPerformed(ActionEvent e){
   if(e.getSource() == sumar){
     int valor1 = 0 , valor2 = 0 , resultado = 0;

     valor1 = Integer.parseInt(num1.getText()); 
     valor2 = Integer.parseInt(num2.getText());
    
     resultado = valor1 + valor2 ;

      resultado_m.setText("Resultado: "+ resultado); 


   }

   if(e.getSource() == cerrar){
     System.exit(0);  
   }
 }
 public static void main(String args[]){
   
  Sumar a22 = new Sumar();
  a22.setBounds(0,0,300,220);
  a22.setVisible(true);
  a22.setResizable(false);
  a22.setLocationRelativeTo(null); 

 }
}