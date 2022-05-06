import javax.swing.*;
import java.awt.event.*;


public class Boton_2 extends JFrame implements ActionListener{
 private JLabel  cartel;
 private JButton bt_1,bt_2,bt_3,cerrar;
 
  public Boton_2(){
  setLayout(null);
  bt_1 = new JButton("1");
  bt_1.setBounds(10,100,90,30); 
  add(bt_1);
  bt_1.addActionListener(this);

  bt_2 = new JButton("2");
  bt_2.setBounds(110,100,90,30);
  add(bt_2);
  bt_2.addActionListener(this);

  bt_3 = new JButton("3");
  bt_3.setBounds(210,100,90,30);
  add(bt_3);
  bt_3.addActionListener(this);

  cerrar = new JButton("X");
  cerrar.setBounds(210,0,30,30);
  add(cerrar);
  cerrar.addActionListener(this);
  
  cartel = new JLabel("bienvenido");
  cartel.setBounds(10,10,300,30);
  add(cartel);

  }
  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == bt_1){
      cartel.setText("deja de");
    }   
    if(evento.getSource() == bt_2){
      cartel.setText("presionar");
    }
    if(evento.getSource() == bt_3){
      cartel.setText("botones");
    } 
    if(evento.getSource() == cerrar){
      System.exit(0);
    } 
  }
  public static void main(String args[]){
    
    Boton_2 abrir = new Boton_2();
    abrir.setBounds(0,0,350,200);
    abrir.setVisible(true);
    abrir.setResizable(false);
    abrir.setLocationRelativeTo(null);

  }
}
