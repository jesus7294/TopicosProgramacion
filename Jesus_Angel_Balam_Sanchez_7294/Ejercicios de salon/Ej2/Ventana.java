package Ej2;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ventana extends Frame implements ActionListener {
	
	Button aceptar;
	Button igual;
	Button borrar;
	TextField text;
	Panel central;
	TextArea resultado;
	
	
	public Ventana () {

		aceptar= new Button("       Aceptar");
		text = new TextField ("");
		central= new Panel();
		resultado= new TextArea("");
		igual= new Button(" = ");
		borrar= new Button("Borrar ");
		aceptar.addActionListener(this);
		aceptar.setBackground(new Color(125,125,125));
        igual.addActionListener(this);
        igual.setBackground(new Color(125,125,125));
		borrar.addActionListener(this);
		borrar.setBackground(new Color(125,125,125));
		central.setLayout(new BorderLayout());
		central.add(text, BorderLayout.NORTH);
		central.add(aceptar, BorderLayout.CENTER);
		central.add(igual, BorderLayout.EAST);
		central.add(borrar, BorderLayout.AFTER_LAST_LINE);
		this.setLayout(new BorderLayout());
		this.add(central, BorderLayout.NORTH);
		this.add(resultado, BorderLayout.CENTER);
		setSize(600, 400);
        setVisible(true); 
		cerrarVentana(); 
       
	}
	
	public static void main(String args[]){
		Ventana Ven= new Ventana();
	}	
	public void cerrarVentana() {
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	private void num(TextField a) {
		a.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c= e.getKeyChar();
				if(!Character.isDigit(c) && c!='.') {
					e.consume();
				}
				if(c== '.' && text.getText().contains(".")) {
					e.consume();
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	 	String c= text.getText();
	 	if (e.getSource() == aceptar) {
			 resultado.append(c + "\n");
	 	}else if (e.getSource() == igual){
			 String Texto= resultado.getText();
			 Texto = Texto.trim();
			 String[] Arreglo= Texto.split("\n");
			 int n=  Arreglo.length;
			 int aux, Suma=0;
			 for(int i=0; i<n; i++) {
				 aux = Integer.parseInt(Arreglo[i]);
				 Suma += aux;
			 }
			 resultado.append("\n La suma total es de " + Suma);
		 }else {
			 resultado.setText("");
	 }
	}	
}
