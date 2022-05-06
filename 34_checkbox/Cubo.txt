import javax.swing.*;
import javax.swing.event.*;

public class Cubo extends JFrame implements ChangeListener{

	private JCheckBox cubo1,cubo2,cubo3,salir;

  public Cubo(){
	setLayout(null);
	
	cubo1 = new JCheckBox("HTML");
	cubo1.setBounds(10,20,100,30);
	cubo1.addChangeListener(this);
	add(cubo1);
	
	

	cubo2 = new JCheckBox("CSS");
	cubo2.setBounds(120,20,100,30);
	cubo2.addChangeListener(this);
	add(cubo2);
	
	

	cubo3 = new JCheckBox("JAVA");
	cubo3.setBounds(230,20,100,30);
	cubo3.addChangeListener(this);
	add(cubo3);
	
	salir = new JCheckBox("Salir");
	salir.setBounds(10,60,100,30);
	salir.addChangeListener(this);
	add(salir);
	

 }

 public void stateChanged(ChangeEvent e){
	String cadena ="";
   if(cubo1.isSelected() == true){
	
	cadena = cadena + "HTML-";
	}
   if(cubo2.isSelected() == true){
	
	cadena = cadena + "CSS-";
	}
   if(cubo3.isSelected() == true){
	
	cadena = cadena + "JAVA-";
	}
	setTitle(cadena);
   if(salir.isSelected() == true){

	System.exit(0);
	}

 }
 public static void main(String args[]){
	Cubo pio = new Cubo();
	pio.setBounds(0,0,320,150);
	pio.setVisible(true);
	pio.setResizable(false);
	pio.setLocationRelativeTo(null);

 }
}