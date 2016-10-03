//deleted comments, testing
import java.lang.Thread;
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.lang.Math;

//////////////////////////////////////////////////////////////////////////////////////////////
///////REFERENCE FOR PROJECT//////////////////////////////////////////////////////////////////
//http://firsttimeprogrammer.blogspot.com/2014/12/earth-moon-system-orbiting-around-sun.html//
//////////////////////////////////////////////////////////////////////////////////////////////
public class EarthAndMoon extends GraphicsProgram {
	
	public static final int MOON_RADIUS = 3 * 10;
	public static final int EARTH_RADIUS = 13 * 10;
	public static int moonWidth;
	public static int moonHeight;
	private Thread moonAni;
	
	int earthWidth;
	int earthHeight;
	
	public void run() {
		this.resize(2500,2500);
		//setSize(600, 400);
		//this.resize(1500,1500);
		
		moonWidth = 800;
		moonHeight = 500;
		
		earthWidth = 900;
		earthHeight = 700;
		
		
		earth(earthWidth, earthHeight, EARTH_RADIUS, true, Color.GREEN);
		AnimatedMoon startAnimation = new AnimatedMoon();
		moonAni = new Thread(startAnimation);
		moonAni.start();
		//startAnimation.run();
	}
	
	public void earth(int x, int y, int radius, boolean isFilled, Color color) {
		GOval circle = new GOval(x, y, radius, radius);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}
	
	public void moon(double x, double y, int radius, boolean isFilled, Color color) {
		
		GOval circle = new GOval(x, y, radius, radius);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
		
		//animate moon called as a thread, so it will run in the background.
		
		AnimatedMoon startAnimation = new AnimatedMoon();
		Thread moonAni = new Thread(startAnimation);
		moonAni.start();
		
		
	}
	
	public void moonOrbit () {
		
	}
	
	public void missile() {
		
	}

}