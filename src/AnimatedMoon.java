import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.lang.Math;

public class AnimatedMoon extends GraphicsProgram  {
	
	private double x, y;
	private double length = 50;
	private double angle = 0.0;
	private double angle_stepsize = 0.1;
	
	//This needs to be worked on. Moon needs to circle the Earths Center Point.
	public void run () {
		
		while (angle < 2 * Math.PI)
	    {
	        // calculate x, y from a vector with known length and angle
	        x = length * Math.cos(angle);
	        y = length * Math.sin(angle);
	        
	        
	        angle += angle_stepsize;
	    }
		
	}

}
