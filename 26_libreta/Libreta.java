import javax.swing.*;


public class Libreta extends JFrame{
 private JTextField txt;
 private JTextArea book;

 public Libreta(){
 setLayout(null);
 txt = new JTextField();
 txt.setBounds(10,10,200,30);
 add(txt);

 book = new JTextArea(); 
 book.setBounds(10,50,200,300);
 add(book);

 }

 public static void main(String args[]){

 Libreta casa = new Libreta();
 casa.setBounds(0,0,300,500);
 casa.setVisible(true);
 casa.setResizable(false);
 casa.setLocationRelativeTo(null);
 }
}

