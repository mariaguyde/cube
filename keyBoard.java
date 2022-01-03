package cube;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import cube.GLUHandler;

public class keyBoard implements KeyListener {
	
private GLUHandler events;
	
	public keyBoard (GLUHandler events) {
		this.events = events;

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == 'z')
			this.events.goUp();
		if (e.getKeyChar() == 'q')
			this.events.goLeft();
		if (e.getKeyChar() == 's')
			this.events.goDown();
		if (e.getKeyChar() == 'd')
			this.events.goRight();
	
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
