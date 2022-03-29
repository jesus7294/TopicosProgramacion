package EventosEjercicio5;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.*;
public class Main extends Frame implements MouseMotionListener, MouseListener, KeyListener{
	Panel p;
	Mundo mundo;
	public Main() {
		p= new Panel();
		mundo = new Mundo();
		p.setLayout(new BorderLayout());
		p.add(mundo,BorderLayout.CENTER);
		
		mundo.addMouseListener(this);
		
		mundo.addMouseMotionListener(this); 
		p.addKeyListener(this);    
		
		mundo.addKeyListener(this);
		
		this.setLayout(new BorderLayout());
		this.add(p,BorderLayout.CENTER);
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

	
	public void mouseClicked(MouseEvent e) {
		System.out.println("Click");
		
		mundo.setX(e.getX());
		mundo.setY(e.getY());
		mundo.repaint();
		
	}
	
	public void mousePressed(MouseEvent e) {
		System.out.println("Presed");
		
	}
	
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released");
		
	}
	
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered");
		
	}
	
	public void mouseExited(MouseEvent e) {
		System.out.println("Exit");
		
	}
	public void mouseDragged(MouseEvent e) { 
		System.out.println("Dragged");
		mundo.setX(e.getX());
		mundo.setY(e.getY());
		mundo.repaint();
	}

	
	public void keyTyped(KeyEvent e) {
		
		
	}


	public void keyPressed(KeyEvent e) { 
			
		
		switch(e.getKeyCode()){
		
		case 'a':
		case KeyEvent.VK_A:
			mundo.setX(mundo.getX()-1);
			break;
		case 's':
		case KeyEvent.VK_S: 
			mundo.setY(mundo.getY()+1);
			break; 
		case 'd':
		case KeyEvent.VK_D:
			mundo.setX(mundo.getX()+1);
			break; 
		case 'w':
		case KeyEvent.VK_W:
			mundo.setY(mundo.getY()-1);
			break; 
		default:
				break; 
		}
		
		mundo.repaint();	
	}

	
	public void keyReleased(KeyEvent e) {
		
		
	}

	
	public void mouseMoved(MouseEvent e) {
		
		
	}

}
