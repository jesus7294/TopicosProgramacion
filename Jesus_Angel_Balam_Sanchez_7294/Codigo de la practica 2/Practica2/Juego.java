package Practica2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Juego extends Frame implements MouseMotionListener, MouseListener{

	//Aquí se declaran las figuras que vamos a usar que vamos a usar 
	Button figura1;
	Button figura2;
	Button figura3;
	Button figura4;
	Button figura5;
	Controles circulo;
	Cuadrado d;
	public Juego() {

		d= new Cuadrado();
		d.addMouseListener(this);
		//Aquí sele da los valores a definir de las figuras, su tamaño, color al igual que la posición donde debe ir 
		figura1= new Button();
		figura1.setBackground(Color.red);
		figura1.setBounds(350, 200, 15, 15);
		figura1.addMouseMotionListener(this);
		figura1.addMouseListener(this);
		
		figura2= new Button();
		figura2.setBackground(Color.green);
		figura2.setBounds(360, 225, 15, 15);
		figura2.addMouseMotionListener(this);
		figura2.addMouseListener(this);
		
		figura3= new Button();
		figura3.setBackground(Color.blue);
		figura3.setBounds(350, 240, 15, 15);
		figura3.addMouseMotionListener(this);
		figura3.addMouseListener(this);
		
		figura4= new Button();
		figura4.setBackground(Color.yellow);
		figura4.setBounds(345, 200, 15, 15);
		figura4.addMouseMotionListener(this);
		figura4.addMouseListener(this);
		
		figura5= new Button();
		figura5.setBackground(Color.orange);
		figura5.setBounds(335, 225, 15, 15);
		figura5.addMouseMotionListener(this);
		figura5.addMouseListener(this);
		
		//Aquí lo que hacemos es que agregamos todo ya a la venta para poder visualizarlo 

		circulo= new Controles("",Color.green,Color.orange);
		circulo.setBounds(200, 50, 100, 50);
		this.add(figura1);
		this.add(figura2);
		this.add(figura3);
		this.add(figura4);
		this.add(figura5);
		this.add(circulo);
		this.add(d);
		this.setBounds(125, 50, 550, 400);
		this.setVisible(true);
		cerrar();

		//Este a partado solo es para que la ventana se pueda cerrar sin ningun problema 
	}
	public void cerrar() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	//Aquí lo que ara es especificar si al mover un cuadro donde debe quedar y donde debe regresar si no está dentro del elemento 
	public static void main(String args[]) {
		Juego miventana = new Juego();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource()==figura1) {
			validar(figura1);
		}if(e.getSource()==figura2) {
			validar(figura2);
		}if(e.getSource()==figura3) {
			validar(figura3);
		}if(e.getSource()==figura4) {
			validar(figura4);
		}if(e.getSource()==figura5) {
			validar(figura5);
		}
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource()==figura1) {
			mover(e,figura1);
		}
		if(e.getSource()==figura2) {
			mover(e,figura2);
		}
		if(e.getSource()==figura3) {
			mover(e,figura3);
		}
		if(e.getSource()==figura4) {
			mover(e,figura4);
		}
		if(e.getSource()==figura5) {
			mover(e,figura5);
		}
	}
	public void mover(MouseEvent g, Button btn) {
		btn.setLocation(
		        btn.getX() + g.getX() - btn.getWidth() / 2,
		        btn.getY() + g.getY() - btn.getHeight() / 2
		        
		    );
		System.out.println("X:"+btn.getX());
		System.out.println("Y:"+btn.getY());
	}
	
	public void validar(Button btn) {
		int x = btn.getX();
		int y = btn.getY();
		if(x>=50 & x<=185 & y>115 & y<250) {
		}else {
			regresar(btn);
		}
		
	}
	public void regresar(Button btn) {
		if(btn.equals(figura1)) {
			figura1.setBounds(350, 200, 15, 15);
		}if(btn.equals(figura2)) {
			figura2.setBounds(350, 225, 15, 15);
		}if(btn.equals(figura3)) {
			figura3.setBounds(345, 175, 15, 15);
		}if(btn.equals(figura4)) {
			figura4.setBounds(325, 200, 15, 15);
		}if(btn.equals(figura5)) {
			figura5.setBounds(335, 225, 15, 15);
		}
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}


