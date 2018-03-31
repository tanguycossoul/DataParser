import processing.core.PApplet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class arraylist_experiment extends PApplet {
	ArrayList<Dot> myList = new ArrayList<Dot>();
	int numBalls = 3;
	int speed = 5;
	
	public void setup() {
		size(800, 400);
		setup2();
	}
	
	public void draw() {
		for (int i=0; i<myList.size(); i++) {
			Dot dot = myList.get(i);
			dot.moveLeft( dot.getSpeed() );
			dot.draw();			
		}		
	}
	
	public void setup1(float sp) {
		for (int i=0; i<numBalls; i++) {
			float x = (float)Math.random()*800;
			float y = (float)Math.random()*400;
			Dot dot = new Dot(this, x, y, sp);
			myList.add(dot);
			System.out.println( "Ball #" + myList.size() + " speed:" + sp );
		}
	}
	
	public void setup2() {
		numBalls = 50;
		setup1(-2);
		setup1(-10);
		setup1(-15);
	}
}