package cube;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;



public class Canva extends GLCanvas {
	
	private static final int GL_DEPTH_TEST = 0;
	private static final int GL_LEQUAL = 0;
	private GLU glu;
	private float angle; 
	
	public static void main (String[] args) {
		JFrame frame = new JFrame(); 
		GLCanvas canvas = new Canva();
		canvas.setPreferredSize(new Dimension(300,500));
		GLUHandler events = new GLUHandler();
		canvas.addGLEventListener(events);
		frame.getContentPane().add(canvas);
		frame.setTitle("Open GL Cube");
		frame.pack();
		frame.setVisible(true);
		FPSAnimator anim = new FPSAnimator(canvas,60);
		anim.start();
	}

}
