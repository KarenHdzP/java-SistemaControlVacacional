import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
  
  private JLabel label1,label2;
  private JCheckBox check1;
  private JButton boton1,boton2;
  private JScrollPane scroll1;
  private JTextArea textarea1;
  private ImageIcon imagen1;
  String nombre="";
  
  public Licencia(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("LICENCIA DE USO");
   getContentPane().setBackground(new Color(30,96,128));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   
   Bienvenida aux= new  Bienvenida();
   nombre=aux.texto;  
    
   label1=new JLabel("TERMINOS Y CONDICIONES");
   label1.setFont(new Font("Bookman Old Style",3,14)); 
   label1.setForeground(new Color(246,242,242));
   label1.setBounds(200,3,200,100);
   add(label1); 

   textarea1=new JTextArea();
   textarea1.setEditable(false);
   scroll1=new JScrollPane(textarea1);
   scroll1.setBounds(35,70,570,230);
   textarea1.setText("\n           TERMINOS Y CONDICIONES \n   "+
                     "\n\n                A. PROHIBIDA SU VENTA O DISTRIBUCI\u00d3N SIN AUTORIZACI\u00d3N DEL CENTRO DIAGN\u00d3STICO."+
                     "\n\n                B. PROHIBIDA LA ALTERACI\u00d3N DEL CODIGO FUENTE O DISE\u00d1O DE LAS INTERFACES GRAF\u00cdCAS."+
                     "\n\n                C. EL CENTRO DIAGNOSTICO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                     "\n\n\n        LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACI\u00d3N RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE."+
                     "\n\n        (EL CENTRO DIAGN\u00d3STICO Y EL AUTOR).NO SE RESPONZABILIZAN DEL USO QUE USTED HAGA CON ESTE Y SUS"+
                     "\n\n        SERVICIOS PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN EN LA CASILLA DE ACEPTO Y POSTERIORMENTE EN"+
                     "\n\n        EL  BOTON  CONTINUAR  DE  LO CONTRARIO  SI  USTED NO  ACEPTA  ESTOS  TERMINOS HAGA  CLIC  EN  EL"+
                     "\n\n        BOTON RECHAZAR.\n"+
                     "\n\n\n       PARA MAS INFORMACI\u00d3N SOBRE NUESTRO TRABAJO, POR FAVOR VISITE NUESTRO SITIO" +
                     "\n\n       Http://www.centrodiagnosticoradioscan.com \n\n");                  
  textarea1.setFont(new Font("Arial",1,9));
  add(scroll1);
  
  check1=new JCheckBox("Yo "+nombre.toUpperCase()+" Acepto");
  check1.setBounds(35,310,150,30);
  check1.addChangeListener(this);
  check1.setForeground(new Color(30,96,128));
  add(check1);

  boton1=new JButton("Aceptar");
  boton1.setBounds(35,350,100,30);
  boton1.setEnabled(false);
  add(boton1);
  boton1.addActionListener(this);

  boton2=new JButton("Rechazar");
  boton2.setBounds(150,350,100,30);
  boton2.setEnabled(true);
  add(boton2);
  boton2.addActionListener(this);
  
  imagen1=new ImageIcon("images/cdradioscan.png");
  label2=new JLabel (imagen1);
  label2.setBounds(300,320,300,70);
  add(label2);
 }

 public void stateChanged(ChangeEvent e){
  if(check1.isSelected()==true){
   boton1.setEnabled(true);
   boton2.setEnabled(false);
  }else {
    boton1.setEnabled(false);
    boton2.setEnabled(true);
   }
 }
  public void actionPerformed(ActionEvent e){
   if(e.getSource()==boton2){
    this.dispose();
    Bienvenida b = new Bienvenida();
    b.setVisible(true);
    b.setBounds(0,0,350,500);
    b.setResizable(false);
    b.setLocationRelativeTo(null);
    this.setVisible(false);
   }
    if(e.getSource()==boton1){
    this.dispose();
    Principal p = new Principal();
    p.setVisible(true);
    p.setBounds(0,0,650,510);
    p.setResizable(false);
    p.setLocationRelativeTo(null);
    this.setVisible(false);
   }
  }
  public static void main(String args[]){
   Licencia formulario1=new Licencia();
   formulario1.setBounds(0,0,650,450);
   formulario1.setVisible(true);
   formulario1.setResizable(false);
   formulario1.setLocationRelativeTo(null); 
  }
}