import javax.swing.*;
import java.awt.event.*;

public class Cartel extends JFrame implements ActionListener{
  private JLabel lb;
  private JButton bt_1,bt_2;
  private JTextField txt;

  public Cartel(){
    setLayout(null);
    lb = new JLabel("Usuario:");
    lb.setBounds(10,10,100,30);
    add(lb);
    
    txt = new JTextField();
    txt.setBounds(120,17,150,20);
    add(txt);

    bt_1 = new JButton("Aceptar");
    bt_1.setBounds(10,80,100,30);
    add(bt_1);
    bt_1.addActionListener(this);

    bt_2 = new JButton("cerrar");
    bt_2.setBounds(180,80,100,30);
    add(bt_2);
    bt_2.addActionListener(this);

  }
  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == bt_1){
      String texto = txt.getText();
      setTitle(texto); 

    }
    if(evento.getSource() == bt_2){

      System.exit(0);
    }
  }
  public static void main(String args[]){
  
    Cartel c1 = new Cartel();
    c1.setBounds(0,0,300,200);
    c1.setVisible(true);
    c1.setResizable(false);
    c1.setLocationRelativeTo(null);

  }
}