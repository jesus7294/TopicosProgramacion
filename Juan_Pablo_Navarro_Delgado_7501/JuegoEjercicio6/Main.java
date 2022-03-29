package JuegoEjercicio6;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame implements MouseMotionListener, MouseListener, KeyListener {
	Panel p;
	Ventana m;
	
	public Main() {
		p= new Panel();
		m = new Ventana();
		p.setLayout(new BorderLayout());
		p.add(m,BorderLayout.CENTER);
		
		m.addMouseListener(this);
		
		m.addMouseMotionListener(this); 
		p.addKeyListener(this);    
		
		m.addKeyListener(this);
		
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

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Click");
		
		m.setX(e.getX());
		m.setY(e.getY());
		m.repaint();
		
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
		m.setX(e.getX());
		m.setY(e.getY());
		m.repaint();
	}

	
	public void keyTyped(KeyEvent e) {
		
		
	}

	
	public void keyPressed(KeyEvent e) { 
		switch(e.getKeyCode()){
		
		case 'a':
		case KeyEvent.VK_A:
			m.setX(m.getX()-1);
			break;
		case 's':
		case KeyEvent.VK_S: 
			m.setY(m.getY()+1);
			break; 
		case 'd':
		case KeyEvent.VK_D:
			m.setX(m.getX()+1);
			break; 
		case 'w':
		case KeyEvent.VK_W:
			m.setY(m.getY()-1);
			break; 
		default:
				break; 
		}
		m.setSprite();
		
		m.repaint();	
	}

	
	public void keyReleased(KeyEvent e) {
		
		
	}

	
	public void mouseMoved(MouseEvent e) {
		
	}
}
