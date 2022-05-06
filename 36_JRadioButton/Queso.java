import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Queso extends JFrame implements ActionListener, ChangeListener{
	private JRadioButton btchico,btmediano,btgrande;
	private ButtonGroup bg;
	private JButton cerrar;
  public Queso(){
	setLayout(null);

	bg = new ButtonGroup();

	btchico = new JRadioButton("Chico");
	btchico.setBounds(10,20,100,30);
	btchico.addChangeListener(this);
	add(btchico);
	bg.add(btchico);

	btmediano = new JRadioButton("Mediano");
	btmediano.setBounds(120,20,100,30);
	btmediano.addChangeListener(this);
	add(btmediano);
	bg.add(btmediano);

	btgrande = new JRadioButton("Grande");
	btgrande.setBounds(230,20,100,30);
	btgrande.addChangeListener(this);
	add(btgrande);
	bg.add(btgrande);

	cerrar = new JButton("Cerrar");
	cerrar.setBounds(120,60,100,30);
	add(cerrar);
	cerrar.addActionListener(this);

  }

  public void stateChanged(ChangeEvent e){
    if(btchico.isSelected()){

	setSize(400,200);
	}
    if(btmediano.isSelected()){

	setSize(600,400);
	}
    if(btgrande.isSelected()){

	setSize(800,600);
	}

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == cerrar){
	System.exit(0);
	}
 }

  public static void main(String args[]){
	Queso pio = new Queso();
	pio.setBounds(0,0,400,150);
	pio.setVisible(true);
	pio.setResizable(false);
	pio.setLocationRelativeTo(null);
 }
}