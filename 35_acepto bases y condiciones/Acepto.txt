import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Acepto extends JFrame implements ActionListener, ChangeListener{

	private JCheckBox acepto;
	private JButton continuar;

 public Acepto(){
	setLayout(null);
	
	acepto = new JCheckBox("Aceptar");
	acepto.setBounds(10,20,100,30);
	acepto.addChangeListener(this);
	add(acepto);

	continuar = new JButton("Continuar");
	continuar.setBounds(10,60,100,30);
	add(continuar);
	continuar.addActionListener(this);
	continuar.setEnabled(false);

  }

 public void stateChanged(ChangeEvent e){
   if(acepto.isSelected() == true){
	continuar.setEnabled(true);
		}
  }

 public void actionPerformed(ActionEvent e){
   if(e.getSource() == continuar){

	System.exit(0);
	}
 }


 public static void main(String args[]){

	Acepto pio = new Acepto();
	pio.setBounds(0,0,200,150);
	pio.setVisible(true);
	pio.setResizable(false);
	pio.setLocationRelativeTo(null);

  }  
}