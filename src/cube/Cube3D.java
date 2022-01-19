package cube;

import com.jogamp.opengl.GL2;

import cube.Shape3D;

public class Cube3D  extends Shape3D{
	
	int a; 
	int b; 
	int c; 
	double d;

	public Cube3D (int a, int b, int c, double d) {
		this.a = a; 
		this.b = b; 
		this.c = c; 
		this.d = d;
	}
	
	public void display(GL2 gl, float angle)
	{
		
		gl.glPushMatrix();
		gl.glTranslatef(this.a, this.b, this.c);

		gl.glScaled(this.d, this.d, this.d);
		gl.glRotated(angle * 10, 0, 1, 0);
		gl.glBegin(GL2.GL_QUADS);
		// Front
		gl.glColor3d(0.184314, 0.184314, 0.309804);
		gl.glVertex3d(-1, -1, 1);
		gl.glVertex3d(1, -1, 1);
		gl.glVertex3d(1, 1, 1);
		gl.glVertex3d(-1, 1, 1);
		// Rear
		gl.glColor3d(0.137255, 0.137255, 0.556863);
		gl.glVertex3d(-1, -1, -1);
		gl.glVertex3d(1, -1, -1);
		gl.glVertex3d(1, 1, -1);
		gl.glVertex3d(-1, 1, -1);
		// Left
		gl.glColor3d(0.258824, 0.258824, 0.435294);
		gl.glVertex3d(-1, -1, -1);
		gl.glVertex3d(-1, -1, 1);
		gl.glVertex3d(-1, 1,  1);
		gl.glVertex3d(-1, 1, -1);
		// Right
		gl.glColor3d(0.196078, 0.8, 0.6);
		gl.glVertex3d(1, -1, -1);
		gl.glVertex3d(1, -1, 1);
		gl.glVertex3d(1, 1,  1);
		gl.glVertex3d(1, 1, -1);
		// Bottom
		gl.glColor3d(0.22, 0.69, 0.87);
		gl.glVertex3d(-1, -1, 1);
		gl.glVertex3d(1, -1, 1);
		gl.glVertex3d(1, -1, -1);
		gl.glVertex3d(-1, -1, -1);
		// Up
		gl.glColor3d(0.372549, 0.623529, 0.623529);
		gl.glVertex3d(-1, 1, 1);
		gl.glVertex3d(1, 1, 1);
		gl.glVertex3d(1, 1, -1);
		gl.glVertex3d(-1, 1, -1);
		gl.glEnd();	
		gl.glPopMatrix();
	    		
	}
}
