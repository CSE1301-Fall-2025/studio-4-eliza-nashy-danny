package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

StdDraw.setPenColor (251,116,168);
StdDraw.filledRectangle(.5,.5,.4,.2);
StdDraw.setPenColor (255,165,0);
StdDraw.filledRectangle(.5,.5,.4,.1);
StdDraw.setPenColor (StdDraw.YELLOW);
StdDraw.filledCircle(.5,.5,.075);
StdDraw.setPenColor (StdDraw.RED);
StdDraw.setPenRadius(0.025);
StdDraw.arc(0.5, 0.4, .2, 0.0, 180.0);
		
	}
}