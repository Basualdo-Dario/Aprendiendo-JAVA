import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Submenu extends JFrame implements ActionListener{

	private JMenuBar menu;

	private JMenu principal;
	private JMenu secundario;

	private JMenu primeraopcion1;
	private JMenu primeraopcion2;

	private JMenuItem rojo;
	private JMenuItem verde;
	private JMenuItem azul;

	private JMenuItem grande;
	private JMenuItem chico;

	private JMenuItem cerrar;
	

 public Submenu(){
   setLayout(null);

   menu = new JMenuBar();
   setJMenuBar(menu);

   principal = new JMenu("opciones");
   menu.add(principal);

   secundario = new JMenu("X");
   menu.add(secundario);

   cerrar = new JMenuItem("Salir");
   cerrar.addActionListener(this);
   secundario.add(cerrar);

   primeraopcion1 = new JMenu("Tamaño");
   principal.add(primeraopcion1);

   primeraopcion2 = new JMenu("Color");
   principal.add(primeraopcion2);

   rojo = new JMenuItem("Rojo");
   primeraopcion2.add(rojo);
   rojo.addActionListener(this);

   verde = new JMenuItem("Verde");
   primeraopcion2.add(verde);
   verde.addActionListener(this);

   azul = new JMenuItem("Azul");
   primeraopcion2.add(azul);
   azul.addActionListener(this);

   grande = new JMenuItem("Grande");
   primeraopcion1.add(grande);
   grande.addActionListener(this);

   chico = new JMenuItem("Chico");
   primeraopcion1.add(chico);
   chico.addActionListener(this);

  }

 public void actionPerformed(ActionEvent e){
   Container fondo = this.getContentPane();   

   if(e.getSource() == rojo){

	fondo.setBackground(new Color(255,0,0));
	}
   if(e.getSource() == verde){

	fondo.setBackground(new Color(0,255,0));
	}

   if(e.getSource() == azul){

	fondo.setBackground(new Color(0,0,255));
	}

   if(e.getSource() == grande){

	setSize(800,600);
	}

   if(e.getSource() == chico){

	setSize(200,100);
	}

   if(e.getSource() == cerrar){

	System.exit(0);
	}


  }
 public static void main(String args[]){

	Submenu pio = new Submenu();
	pio.setBounds(0,0,300,400);
	pio.setVisible(true);
	pio.setResizable(false);
	pio.setLocationRelativeTo(null);
  
 }
}