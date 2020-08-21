import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
 private JTextField textfield1;
 private JLabel label1,label2,label3,label4;
 private JButton boton1;
 private ImageIcon imagen1;
 public static String texto;

  public Bienvenida (){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("-BIENVENIDO-");
   getContentPane().setBackground(new Color(30,96,128));

   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   imagen1=new ImageIcon("images/cdradioscan.png");
   label1=new JLabel (imagen1);
   label1.setBounds(20,40,300,70);
   add(label1);
   
   label2=new JLabel("SISTEMA DE CONTROL VACACIONAL");
   label2.setFont(new Font("Bookman Old Style",3,14)); 
   label2.setForeground(new Color(246,242,242));
   label2.setBounds(40,120,300,40);
   add(label2); 
   
   label3=new JLabel("INGRESE SU NOMBRE:");
   label3.setFont(new Font("Bodoni MT",1,11)); 
   label3.setForeground(new Color(246,242,242));
   label3.setBounds(60,180,200,30);
   add(label3); 
   
   label4=new JLabel (" © 2020 | RadioScan");
   label4.setFont(new Font("Dubai Light",3,9)); 
   label4.setForeground(new Color(246,242,242));
   label4.setBounds(120,400,200,30);
   add(label4);
   
   textfield1=new JTextField();
   textfield1.setBounds(60,210,220,30);
   add(textfield1);
   
   boton1=new JButton("Ingresar");
   boton1.setBounds(120,300,100,30);
   add(boton1);
   boton1.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
   if(e.getSource()==boton1){
      texto=textfield1.getText();
     if(texto.equals("")){
     JOptionPane.showMessageDialog(null, "Ingresa tu nombre ");     
    }else{
      this.dispose();
      Licencia l = new Licencia();
      l.setVisible(true);
      l.setBounds(0,0,650,450);
      l.setResizable(false);
      l.setLocationRelativeTo(null);
      this.setVisible(false);
    }
   }
  }
   public static void main(String args[]){
    Bienvenida ventanaB =new Bienvenida();
    ventanaB.setBounds(0,0,350,500);
    ventanaB.setVisible(true);
    ventanaB.setResizable(false);
    ventanaB.setLocationRelativeTo(null); 
 }
}
