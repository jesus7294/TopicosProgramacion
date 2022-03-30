package Practica2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado extends Canvas{
	public Cuadrado() {

	}
	public void paint(Graphics Js) {

		Js.setColor(Color.RED);
		Js.fillRect(50, 100, 150, 150);
		Js.setColor(Color.black);
		Js.drawLine(300, 200, 350, 150);
		Js.drawLine(300, 200, 350, 250);
		Js.drawLine(400, 200, 350, 150);
		Js.drawLine(400, 200, 350, 250);	
	}
}
