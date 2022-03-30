package Ej4;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
public class Mundo extends Canvas{
	Random ran = new Random();
	int x,y,xcomida,ycomida;
	int w,h;
	public Mundo() {
		xcomida =80;
		ycomida = 80;
		x=20;
		y=20;
		w=h=100;
		centroX();
		centroY();
	}
	public void paint(Graphics g) {
			g.setColor(Color.green);
			g.fillOval(xcomida, ycomida, 50, 50);
			g.setColor(Color.black);
			g.fillOval(x, y, w, h);
			g.setColor(Color.white);
			g.drawString("Hola Enfermera", x,(y+h/2));
			
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double centroX() {
		double centrox;
		centrox = (getX()+(100/2));
		System.out.println(centrox);
		return centrox;
	}
	public double centroY() {
		double centroy;
		centroy = (getY()+(100/2));
		System.out.println(centroy);
		return centroy;
	}
	public int getXcomida() {
		return xcomida;
	}
	public void setXcomida(int xcomida) {
		this.xcomida = xcomida;
	}
	public int getYcomida() {
		return ycomida;
	}
	public void setYcomida(int ycomida) {
		this.ycomida = ycomida;
	}
	public double centroXComida() {
		double centroxCom;
		centroxCom = (getXcomida()+(100/2));
		System.out.println(centroxCom);
		return centroxCom;
	}
	public double centroYComida() {
		double centroyCom;
		centroyCom = (getYcomida()+(100/2));
		System.out.println(centroyCom);
		return centroyCom;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
}