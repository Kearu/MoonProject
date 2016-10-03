import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.Color;
import java.lang.Math;

public class AnimatedMoon extends GraphicsProgram  {
	
	private double x, y;
	private double length = 400;
	private double angle = 0.0;
	private double angle_stepsize = 0.1;
	
	//This needs to be worked on. Moon needs to circle the Earths Center Point.
	public void run () {
		
		while (angle < 2 * Math.PI)
	    {
			
	        // calculate x, y from a vector with known length and angle
	        x = length * Math.cos(angle);
	        y = length * Math.sin(angle);
	        EarthAndMoon.moonWidth = x;
	        EarthAndMoon.moonHeight = y;
	        
	        angle += angle_stepsize;
	        moon(EarthAndMoon.moonWidth, EarthAndMoon.moonHeight, EarthAndMoon.MOON_RADIUS, true, Color.GRAY);
	    }
		
	}
	public void moon(double x, double y, int radius, boolean isFilled, Color color) {
		
		GOval circle = new GOval(x, y, radius, radius);
		circle.setFilled(true);
		circle.setColor(color);
		pause(300);
		
		add(circle);
		
		
		//animate moon called as a thread, so it will run in the background.
	}

}
