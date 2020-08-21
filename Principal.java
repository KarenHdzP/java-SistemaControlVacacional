import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
  
  private JMenuBar menubar;
  private JMenu menuOpciones, menuCalcular, menuAcercade, menuColor;
  private JMenuItem mnocturno, mclaro, moriginal,nuevo,salir, vacaciones,creador;
  private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
  private JTextField nombre,apaterno,amaterno;
  private JComboBox departamento,antiguedad;
  private JTextArea textarea1;
  private JScrollPane scroll1;
  String nombreb="";

  public Principal(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("PRINCIPAL");
   getContentPane().setBackground(new Color(30,96,128));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   
   
   Bienvenida aux= new  Bienvenida();
   nombreb=aux.texto;     

   menubar=new JMenuBar();
   setJMenuBar(menubar);
   menuOpciones=new JMenu("Opciones");
   menubar.add(menuOpciones);
   
   menuColor=new JMenu("Color de fondo");
   menuOpciones.add(menuColor);

   mnocturno=new JMenuItem("Modo nocturno");
   mnocturno.addActionListener(this);
   menuColor.add(mnocturno);
   
   mclaro=new JMenuItem("Modo claro");
   mclaro.addActionListener(this);
   menuColor.add(mclaro);
   
   moriginal=new JMenuItem("Modo original");
   moriginal.addActionListener(this);
   menuColor.add(moriginal);

   salir=new JMenuItem("Salir");
   salir.addActionListener(this);
   menuOpciones.add(salir);
      
   menuCalcular=new JMenu("Calcular");
   menubar.add(menuCalcular);

   nuevo=new JMenuItem("Nuevo");
   nuevo.addActionListener(this);
   menuCalcular.add(nuevo);
   
   vacaciones=new JMenuItem("Vacaciones");
   vacaciones.addActionListener(this);
   menuCalcular.add(vacaciones);  

   menuAcercade=new JMenu("Acerca de");
   menubar.add(menuAcercade);

   creador=new JMenuItem("Creador");
   creador.addActionListener(this);
   menuAcercade.add(creador);
   
   ImageIcon imagen1=new ImageIcon("images/cdradioscan.png");
   label1=new JLabel (imagen1);
   label1.setBounds(20,10,300,70);
   add(label1);
      
   label2=new JLabel("*BIENVENIDO "+nombreb.toUpperCase()+" *");
   label2.setFont(new Font("Bookman Old Style",3,23)); 
   label2.setForeground(new Color(246,242,242));
   label2.setBounds(330,10,350,70);
   add(label2);
  
   label3=new JLabel("DATOS DEL TRABAJADOR PARA EL C\u00c1LCULO DE VACACIONES");
   label3.setFont(new Font("Bookman Old Style",3,15)); 
   label3.setForeground(new Color(246,242,242));
   label3.setBounds(70,100,500,30);
   add(label3);
   
   label4=new JLabel("Nombre Completo");
   label4.setFont(new Font("Corbel",1,11)); 
   label4.setForeground(new Color(246,242,242));
   label4.setBounds(40,140,100,20);
   add(label4);
  
   nombre=new JTextField();
   nombre.setBounds(40,160,200,30);
   add(nombre);
  
   label5=new JLabel("Apellido Paterno");
   label5.setFont(new Font("Corbel",1,11)); 
   label5.setForeground(new Color(246,242,242));
   label5.setBounds(40,210,100,20);
   add(label5);
  
   apaterno=new JTextField();
   apaterno.setBounds(40,230,200,30);
   add(apaterno);
    
   label6=new JLabel("Apellido Materno");
   label6.setFont(new Font("Corbel",1,11)); 
   label6.setForeground(new Color(246,242,242));
   label6.setBounds(40,280,100,20);
   add(label6);  

   amaterno=new JTextField();
   amaterno.setBounds(40,300,200,30);
   add(amaterno);
   
   label7=new JLabel("Departamento");
   label7.setFont(new Font("Corbel",1,11)); 
   label7.setForeground(new Color(246,242,242));
   label7.setBounds(320,140,100,20);
   add(label7);
   
   departamento=new JComboBox();
   departamento.setBounds(320,160,250,30);
   departamento.addItem(String.valueOf(""));
   departamento.addItem(String.valueOf("Atenci\u00f3n a Clientes"));
   departamento.addItem(String.valueOf("Departamento de Log\u00edstica"));
   departamento.addItem(String.valueOf("Departamento de Gerencia"));
   add(departamento);
   
   label8=new JLabel("Antiguedad");
   label8.setFont(new Font("Corbel",1,11)); 
   label8.setForeground(new Color(246,242,242));
   label8.setBounds(320,210,100,20);
   add(label8);
   
   antiguedad=new JComboBox();
   antiguedad.setBounds(320,230,250,30);
   antiguedad.addItem(String.valueOf(""));
   antiguedad.addItem(String.valueOf("1 a\u00f1o o menos"));
   antiguedad.addItem(String.valueOf("2 a 6 a\u00f1os"));
   antiguedad.addItem(String.valueOf("A partir de 7 a\u00f1os"));
   add(antiguedad);
    
   label9=new JLabel("Resultado del c\u00e1lculo:");
   label9.setFont(new Font("Corbel",1,11)); 
   label9.setForeground(new Color(246,242,242));
   label9.setBounds(320,280,200,20);
   add(label9);

   textarea1=new JTextArea();
   textarea1.setEditable(false);
   textarea1.setFont(new Font("Corbel",1,12));
   textarea1.setText("\n  Aqu\u00ed aparece el resultado del c\u00e1lculo \n de las vacaciones:");
   scroll1=new JScrollPane(textarea1);
   scroll1.setBounds(320,300,250,80);
   add(scroll1);
 
   label10=new JLabel (" © 2020 | RadioScan");
   label10.setFont(new Font("Dubai Light",3,9)); 
   label10.setForeground(new Color(246,242,242));
   label10.setBounds(250,400,200,30);
   add(label10);
   
  }
   public void actionPerformed(ActionEvent e){
  
    if(e.getSource()==mnocturno){
      getContentPane().setBackground(new Color(0,0,0));
    }
    if(e.getSource()==mclaro){
     getContentPane().setBackground(new Color(142,111,20));
    }
    if(e.getSource()==moriginal){
     getContentPane().setBackground(new Color(30,96,128));
    }
     if(e.getSource()==nuevo){
        nombre.setText("");
        apaterno.setText("");
   	amaterno.setText(""); 
	departamento.setSelectedIndex(0);
	antiguedad.setSelectedIndex(0);
        textarea1.setText("\n  Aqu\u00ed aparece el resultado del c\u00e1lculo \n de las vacaciones:");
     }
     if(e.getSource()==creador){
      JOptionPane.showMessageDialog(null, "Creador: *Karen Hernandez*"); 
     }
     if(e.getSource()==salir){
      this.dispose();
      Bienvenida b = new Bienvenida();
      b.setVisible(true);
      b.setBounds(0,0,350,500);
      b.setResizable(false);
      b.setLocationRelativeTo(null);
      this.setVisible(false);
     }  
      if(e.getSource()==vacaciones){
       String nombreT=nombre.getText();
       String Ap=apaterno.getText();
       String Am=amaterno.getText();
       String Depa=departamento.getSelectedItem().toString();
       String Anti=antiguedad.getSelectedItem().toString();
      
       if(nombreT.equals("")||Ap.equals("")||Am.equals("")||Depa.equals("")||Anti.equals("")){
        JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");  
       }else{
         if(Depa.equals("Atenci\u00f3n a Clientes")){
           if(Anti.equals("1 a\u00f1o o menos")){
            textarea1.setText("\n   El trabajador " + nombreT + " " + Ap + " " + Am + 
                              "\n   qu\u00eden labora en " + Depa + "\n  con " + Anti + 
                              "   recibe 6 d\u00edas de vacaciones.");
           }if(Anti.equals("2 a 6 a\u00f1os")){
            textarea1.setText("\n   El trabajador " + nombreT + " " + Ap + " " + Am + 
                              "\n   qu\u00eden labora en " + Depa + "\n  con " + Anti + 
                              "   recibe 14 d\u00edas de vacaciones.");
           }if(Anti.equals("A partir de 7 a\u00f1os")){
            textarea1.setText("\n   El trabajador " + nombreT + " " + Ap + " " + Am + 
                              "\n   quien labora en " + Depa + "\n   " + Anti + 
                              "   recibe 20 d\u00edas de vacaciones.");
           }
         }if(Depa.equals("Departamento de Log\u00edstica")){ 
            if(Anti.equals("1 a\u00f1o o menos")){
             textarea1.setText("\n   El trabajador " + nombreT + " " + Ap + " " + Am + 
                              "\n   quien labora en " + Depa + "\n  con " + Anti + 
                              "   recibe 7 d\u00edas de vacaciones.");
            }if(Anti.equals("2 a 6 a\u00f1os")){
             textarea1.setText("\n   El trabajador " + nombreT + " " + Ap + " " + Am + 
                              "\n   quien labora en " + Depa + "\n  con " + Anti + 
                              "   recibe 15 d\u00edas de vacaciones.");
            }else if(Anti.equals("A partir de 7 a\u00f1os")){
             textarea1.setText("\n   El trabajador " + nombreT + " " + Ap + " " + Am + 
                              "\n   quien labora en " + Depa + "\n   " + Anti + 
                              "   recibe 22 d\u00edas de vacaciones.");
            }
          }if(Depa.equals("Departamento de Gerencia")){
            if(Anti.equals("1 a\u00f1o o menos")){
             textarea1.setText("\n   El trabajador " + nombreT + " " + Ap + " " + Am + 
                              "\n   quien labora en " + Depa + "\n  con " + Anti + 
                              "   recibe 10 d\u00edas de vacaciones.");
            }if(Anti.equals("2 a 6 a\u00f1os")){
             textarea1.setText("\n   El trabajador " + nombreT + " " + Ap + " " + Am + 
                              "\n   quien labora en " + Depa + "\n  con " + Anti + 
                              "   recibe 20 d\u00edas de vacaciones.");
            }if(Anti.equals("A partir de 7 a\u00f1os")){
             textarea1.setText("\n   El trabajador " + nombreT + " " + Ap + " " + Am + 
                              "\n   quien labora en " + Depa + "\n   " + Anti + 
                              "   recibe 30 d\u00edas de vacaciones.");
           }
         }
        }
      }
    }
      
   public static void main(String args[]){
    Principal formulario1=new Principal();
    formulario1.setBounds(0,0,650,510);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
}