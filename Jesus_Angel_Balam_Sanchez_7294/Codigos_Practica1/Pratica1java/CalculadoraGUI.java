package Practica1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculadoraGUI extends JFrame {

	private static final long serialVersionUID =1L;
	private OperacionesCalculadora op;
	
	public CalculadoraGUI(String nombre){
		super(nombre);
		initComponents();
	}
	// Aquí lo que hice fue declarar las variables para cada botón 
	JTextField txtResultado;
	JButton btnC;
	JButton btnUno;
	JButton btnDos;
	JButton btnTres;
	JButton btnCuatro;
	JButton btnCinco;
	JButton btnSeis;
	JButton btnSiete;
	JButton btnOcho;
	JButton btnNueve;
	JButton btnCero;
	JButton btnSuma;
	JButton btnResta;
	JButton btnDiv;
	JButton btnMult;
	JButton btnElevado;
	JButton btnIgual;
	JPanel barraMenu;
	JPanel contenedorNumeros;
	int primerNumero;
	int segundoNumero;
	String operador;
	
	public void initComponents(){
		
		
		//Aquí es la parte de la pantalla donde podemos ver los numero a ingresar al igual que el resultado
		op= new OperacionesCalculadora();
		txtResultado=new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Open Sans",1,18));
		txtResultado.setForeground(new Color(51,51,51));
		txtResultado.setPreferredSize(new Dimension(233,104));
		
		
		btnC=new JButton("C");
		btnC.setFocusable(false);
		btnC.setFont(new Font ("open Sans", 1, 16));
		btnC.addActionListener(evt -> btnCActionPerformed(evt));
		
		/*Este es el apartado donde se le asigna su
		 * valor a las secciones de la calculadora con su simbología correspondiente
			 *   y se le da los detalles del tamaño */
		
		btnUno=new JButton("1");
		btnUno.setFocusable(false);
		btnUno.setFont(new Font ("Open Sans", 1,16));
		btnUno.addActionListener(evt ->btnUnoActionPerformed(evt));

		btnDos=new JButton("2");
		btnDos.setFocusable(false);
		btnDos.setFont(new Font ("Open Sans", 1, 16));
		btnDos.addActionListener(evt ->btnDosActionPerformed(evt));
		
		btnTres=new JButton("3");
		btnTres.setFocusable(false);
		btnTres.setFont(new Font ("open Sans", 1, 16));
		btnTres.addActionListener(evt ->btnTresActionPerformed(evt));
		
		btnCuatro=new JButton("4");
		btnCuatro.setFocusable(false);
		btnCuatro.setFont(new Font ("open Sans", 1, 16));
		btnCuatro.addActionListener(evt ->btnCuatroActionPerformed(evt));
		
		btnCinco=new JButton("5");
		btnCinco.setFocusable(false);
		btnCinco.setFont(new Font ("open Sans", 1, 16));
		btnCinco.addActionListener(evt ->btnCincoActionPerformed(evt));
		
		btnSeis=new JButton("6");
		btnSeis.setFocusable(false);
		btnSeis.setFont(new Font ("open Sans", 1, 16));
		btnSeis.addActionListener(evt ->btnSeisActionPerformed(evt));
		
		btnSiete=new JButton("7");
		btnSiete.setFocusable(false);
		btnSiete.setFont(new Font ("open Sans", 1, 16));
		btnSiete.addActionListener(evt ->btnSieteActionPerformed(evt));
		
		btnOcho=new JButton("8");
		btnOcho.setFocusable(false);
		btnOcho.setFont(new Font ("open Sans", 1, 16));
		btnOcho.addActionListener(evt ->btnOchoActionPerformed(evt));
		
		btnNueve=new JButton("9");
		btnNueve.setFocusable(false);
		btnNueve.setFont(new Font ("open Sans", 1, 16));
		btnNueve.addActionListener(evt ->btnNueveActionPerformed(evt));
		
		btnCero=new JButton("0");
		btnCero.setFocusable(false);
		btnCero.setFont(new Font ("open Sans", 1, 16));
		btnCero.addActionListener(evt ->btnCeroActionPerformed(evt));
		
		btnSuma=new JButton("+");
		btnSuma.setFocusable(false);
		btnSuma.setFont(new Font ("open Sans", 1, 16));
		btnSuma.addActionListener(evt ->btnSumaActionPerformed(evt));
		
		btnResta=new JButton("-");
		btnResta.setFocusable(false);
		btnResta.setFont(new Font ("open Sans", 1, 16));
		btnResta.addActionListener(evt ->btnRestaActionPerformed(evt));
		
		btnDiv=new JButton("/");
		btnDiv.setFocusable(false);
		btnDiv.setFont(new Font ("open Sans", 1, 16));
		btnDiv.addActionListener(evt ->btnDivActionPerformed(evt));
		
		btnMult=new JButton("*");
		btnMult.setFocusable(false);
		btnMult.setFont(new Font ("open Sans", 1, 16));
		btnMult.addActionListener(evt ->btnMultActionPerformed(evt));
		
		btnElevado=new JButton("^");
		btnElevado.setFocusable(false);
		btnElevado.setFont(new Font ("open Sans", 1, 16));
		btnElevado.addActionListener(evt ->btnElevadoActionPerformed(evt));
		
		btnIgual=new JButton("=");
		btnIgual.setFocusable(false);
		btnIgual.setFont(new Font ("open Sans", 1, 16));
		btnIgual.addActionListener(evt ->btnIgualActionPerformed(evt));
		
		barraMenu=new JPanel();
		barraMenu.add(txtResultado,BorderLayout.WEST);
		barraMenu.add(btnC,BorderLayout.EAST);
		
		//Aquí es donde especificamos donde va cada votos dentro de la calculadora 
		contenedorNumeros=new JPanel();
		contenedorNumeros.setLayout(new GridLayout(4,4,5,20));
		contenedorNumeros.add(btnUno);
		contenedorNumeros.add(btnDos);
		contenedorNumeros.add(btnTres);
		contenedorNumeros.add(btnSuma);
		contenedorNumeros.add(btnCuatro);
		contenedorNumeros.add(btnCinco);
		contenedorNumeros.add(btnSeis);
		contenedorNumeros.add(btnResta);
		contenedorNumeros.add(btnSiete);
		contenedorNumeros.add(btnOcho);
		contenedorNumeros.add(btnNueve);
		contenedorNumeros.add(btnDiv);
		contenedorNumeros.add(btnMult);
		contenedorNumeros.add(btnCero);
		contenedorNumeros.add(btnElevado);
		contenedorNumeros.add(btnIgual);
		
		
		this.add(barraMenu,BorderLayout.NORTH);
		this.add(contenedorNumeros, BorderLayout.CENTER);
		
		this.setSize(309,489);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	private void btnCActionPerformed(ActionEvent e){
		
		this.txtResultado.setText("");
		
	}
	
	private void btnUnoActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btnUno.getText());
		validarRango();
	}
	
	private void btnDosActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btnDos.getText());
		validarRango();
	}
	private void btnTresActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btnTres.getText());
		validarRango();
	}
	private void btnCuatroActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btnCuatro.getText());
		validarRango();
	}
	
	private void btnCincoActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btnCinco.getText());
		validarRango();
	}
	
	private void btnSeisActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btnSeis.getText());
		validarRango();
	}
	
	private void btnSieteActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btnSiete.getText());
		validarRango();
	}
	
	private void btnOchoActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btnOcho.getText());
		validarRango();
	}
	
	private void btnNueveActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btnNueve.getText());
		validarRango();
	}
	
	
	private void btnCeroActionPerformed(ActionEvent e){
		txtResultado.setText(txtResultado.getText()+btnCero.getText());
		validarRango();
	}
	
	private void btnSumaActionPerformed(ActionEvent e){
		primerNumero=Integer.parseInt(txtResultado.getText());
		operador="+";
		txtResultado.setText("");
	}
	private void btnRestaActionPerformed(ActionEvent e){
		primerNumero=Integer.parseInt(txtResultado.getText());
		operador="-";
		txtResultado.setText("");
	}
	private void btnDivActionPerformed(ActionEvent e){
		primerNumero=Integer.parseInt(txtResultado.getText());
		operador="/";
		txtResultado.setText("");
	}
	
	private void btnMultActionPerformed(ActionEvent e){
		primerNumero=Integer.parseInt(txtResultado.getText());
		operador="*";
		txtResultado.setText("");
	}
	
	private void btnElevadoActionPerformed(ActionEvent e){
		primerNumero=Integer.parseInt(txtResultado.getText());
		operador="^";
		txtResultado.setText("");
	}
	
	private void btnIgualActionPerformed(ActionEvent e){
		segundoNumero=Integer.parseInt(txtResultado.getText());
		txtResultado.setText(op.opResultado(operador,primerNumero, segundoNumero));
	}
	
	private void validarRango(){
		if(txtResultado.getText().length()>20){
			JOptionPane.showMessageDialog(null,"Cantidad sobre pasada: Solo se puede dijitar 20 numeros");
			btnC.doClick();
		}
	}
	
	public static void main(String[] args){
		CalculadoraGUI c=new CalculadoraGUI("Calculadora Simple");
		c.addWindowListener(new WindowAdapter(){
			public void windowClosin(WindowEvent e){
				System.exit(0);
			}
		});
	}
		
}