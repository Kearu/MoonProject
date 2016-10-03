// Class EarthAndMoon
// this is ANOTHER comment

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class EarthAndMoon extends GraphicsProgram {
	
	public static final int MOON_RADIUS = 3 * 5;
	public static final int EARTH_RADIUS = 13 * 5;
	
	public void run() {
		setSize(600, 400);
		
		int moonWidth = (getWidth() - 75) / 2;
		int moonHeight = (getHeight() - 75) / 2;
		
		int earthWidth = (getWidth()) / 2;
		int earthHeight = (getHeight()) / 2;
		
		moon(moonWidth, moonHeight, MOON_RADIUS, true, Color.BLACK);
		earth(earthWidth, earthHeight, EARTH_RADIUS, true, Color.RED);
	}
	
	public void earth(int x, int y, int radius, boolean isFilled, Color color) {
		GOval circle = new GOval(x, y, radius, radius);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}
	
	public void moon(int x, int y, int radius, boolean isFilled, Color color) {
		GOval circle = new GOval(x, y, radius, radius);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}
	
	public void moonOrbit () {
		
	}
	
	public void missile() {
		
	}

}