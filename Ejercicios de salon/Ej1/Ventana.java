package Ej1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends Frame implements ActionListener{
	Button aceptar;
	TextField text;
	Panel central;
	TextArea txt;
	Button igual;
	public Ventana() {
		aceptar= new Button("Aceptar");
		aceptar.addActionListener(this);
		aceptar.setBackground(new Color(125,125,125));
		text = new TextField();
		igual = new Button("=");
		igual.addActionListener(this);
		central = new Panel();
		txt = new TextArea("Resultado "+'\n');
		central.setLayout(new BorderLayout());
		central.add(aceptar,BorderLayout.EAST);
		central.add(text,BorderLayout.CENTER);
		central.add(txt,BorderLayout.SOUTH);
		this.setLayout(new BorderLayout());
		this.add(central,BorderLayout.CENTER);
		this.add(igual,BorderLayout.EAST);
		this.setSize(300,300);
		this.setVisible(true);
		cerrar();
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void cerrar() {
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String args[]) {
		Ventana miventana = new Ventana();
	}
}