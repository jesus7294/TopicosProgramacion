package Ej3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
public class Main extends Frame implements MouseMotionListener, MouseListener, KeyListener{
	Panel p;
	Mundo d;
	public Main() {
		p= new Panel();
		d = new Mundo();
		p.setLayout(new BorderLayout());
		p.add(d,BorderLayout.CENTER);
		d.addMouseListener(this);
		d.addMouseMotionListener(this);
		d.addKeyListener(this);
		this.setLayout(new BorderLayout());
		this.add(p,BorderLayout.CENTER);
		this.addKeyListener(this);
		p.addKeyListener(this);
		this.setSize(500,400);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
	}
	
	public static void main(String args[]) {
		Main canvasi= new Main();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}
	

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Presed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exit");
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	
		
	}
	public void mover(MouseEvent g, Mundo d) {
		d.setLocation(
		        d.getX() + g.getX() - d.getWidth() / 2,
		        d.getY() + g.getY() - d.getHeight() / 2
		        
		    );
		System.out.println("X:"+d.getX());
		System.out.println("Y:"+d.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Moved");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	int mov=0;
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 'a':
		case KeyEvent.VK_A:
			d.setX(d.getX()-3);
			d.repaint();
			break;
		case 'd':
		case KeyEvent.VK_D:
			d.setX(d.getX()+3);
			d.repaint();
			break;
		case 'w':
		case KeyEvent.VK_W:
			d.setY(d.getY()-3);
			d.repaint();
			break;
		case 's':
		case KeyEvent.VK_S:
			d.setY(d.getY()+3);
			d.repaint();
			break;
		default:
			System.out.println("baboso");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}