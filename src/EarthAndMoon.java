//deleted comments, testing
import java.lang.Thread;
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class EarthAndMoon extends GraphicsProgram {
	
	public static final int MOON_RADIUS = 3 * 10;
	public static final int EARTH_RADIUS = 13 * 10;
	public static double moonWidth;
	public static double moonHeight;
	
	public void run() {
		this.resize(2500,2500);
		//setSize(600, 400);
		//this.resize(1500,1500);
		
		moonWidth = (getWidth() + 1700) / 2;
		moonHeight = (getHeight() + 1250) / 2;
		
		int earthWidth = (getWidth() + 900) / 2;
		int earthHeight = (getHeight()+ 700) / 2;
		
		//moon(moonWidth, moonHeight, MOON_RADIUS, true, Color.BLACK);
		earth(earthWidth, earthHeight, EARTH_RADIUS, true, Color.RED);
		AnimatedMoon startAnimation = new AnimatedMoon();
		Thread moonAni = new Thread(startAnimation);
		moonAni.start();
		startAnimation.run();
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