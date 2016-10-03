import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.Color;
import java.lang.Math;

import javax.xml.bind.ParseConversionEvent;

public class AnimatedMoon extends GraphicsProgram  {
	
	private double x, y;
	private double length = 375;
	private double angle = 0.0;
	private double angle_stepsize = 0.01;
	
	//This needs to be worked on. Moon needs to circle the Earths Center Point.
	public void run () {
		
		while (angle < 2 * Math.PI)
	    {
			
	        // calculate x, y from a vector with known length and angle
	        x = length * Math.cos(angle);
	        y = length * Math.sin(angle);
	        
	        EarthAndMoon.moonWidth = (int)x;
	        EarthAndMoon.moonHeight = (int)y;
	        
	        angle += angle_stepsize;
	        moon(EarthAndMoon.moonWidth, EarthAndMoon.moonHeight, EarthAndMoon.MOON_RADIUS, true, Color.GRAY);
	    }
		
	}
	public void moon(int x, int y, int radius, boolean isFilled, Color color) {
		
		
		
		GOval circle = new GOval(x, y, radius, radius);
		circle.setFilled(true);
		circle.setColor(color);
		pause(30);
		
		add(circle);
		
	}

}
