package cube;

import java.util.ArrayList;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;

import cube.Cube3D;
import cube.Shape3D;

public class GLUHandler implements GLEventListener {
	
	private GLU glu;
	private float angle, angle2; 
	private Cube3D cube1, cube2, cube3;
	private float posX, posY;
	private ArrayList<Shape3D> items3D;
	
	
	public GLUHandler()
	{
		this.glu = new GLU();
		this.angle = 0;
		this.angle2 = -10; 
		this.cube1 = new Cube3D(-1, 4, -35, 2);
		this.cube2 = new Cube3D(-1, -1, -35, 3);
		this.cube3 = new Cube3D(-1, -8, -35, 3.5);
	}
	
	public void display(GLAutoDrawable draw) {
		// TODO Auto-generated method stub
		GL2 gl = draw.getGL().getGL2();
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity();
		this.cube1.display(gl,  this.angle);	 
		this.cube2.display(gl,  this.angle2);
		this.cube3.display(gl,  this.angle);
		this.angle += 0.5;
		this.angle2 -= 0.5;
		
	}

	// LORSQUE L'ON QUITTE 
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	
	// INITIALISATION
	public void init(GLAutoDrawable draw ){
		// TODO Auto-generated method stub
		GL2 gl = draw.getGL().getGL2();
		gl.glClearColor(0,0,0,0);
		gl.glEnable(GL2.GL_DEPTH_TEST);
		
	}
	

	public void reshape(GLAutoDrawable draw, int x, int y, int width, int height) {
		GL2 gl = draw.getGL().getGL2();
		float aspect = (float) width / height; 
		gl.glViewport(0,0,width,height);
		gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        GLU glu = new GLU();
        glu.gluPerspective(45.0, aspect, 0.1, 100);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }
}
