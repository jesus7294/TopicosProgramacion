package Ej5;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
public class Mundo extends Canvas{
	Random ran = new Random();
	int x,y,xcomida,ycomida;
	int w,h;
	int sprite;
	public Mundo() {
		xcomida =(int)(Math.random()* 400);//this.getWidth();
		ycomida = (int)(Math.random()* 300);//this.getHeight();
		sprite=1;
		x=20;
		y=20;
		w=h=100;
		centroX();
		centroY();
	}
	public void paint(Graphics g) {
			colision();
			g.setColor(Color.green);
			g.fillOval(xcomida, ycomida, 50, 50);
			g.setColor(Color.black);
			switch(sprite) {
			case 1:
				g.fillOval(x, y, w, h);
				break;
			case 2:
				g.fillArc(x, y, w, h, 0, 270);
				break;
			case 3:
				g.fillArc(x, y, w, h, 0, 200);
				break;
			default:
				break;
			}
			
			
			g.setColor(Color.white);
			g.drawString("Hola mundo", x,(y+h/2));
			
	}
	
	public void colision() {
		if((getXcomida()>=getX()) && ((getXcomida()+50)<=(getX()+100)) && (getYcomida()>=getY()) && ((getYcomida()+50)<=(getY()+100))) {
			xcomida =(int)(Math.random()* 400);//this.getWidth();
			ycomida = (int)(Math.random()* 300);//this.getHeight();
		}
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
	
	public void setSprite() {
		sprite++;
		if(sprite>3) {
			sprite=1;
		}
	}
	
}