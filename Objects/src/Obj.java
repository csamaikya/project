import java.awt.*;
public class Obj {
	public static void main (String[] args) { 
	int x = 5; 
	Point blank = new Point (3,5);
	System.out.println (fred (x, blank)); 
	System.out.println (x);
	System.out.println (blank.x); 
	System.out.println (blank.y);
	}
	public static int fred (int x, Point p) { 
	x = x + 7; 
	return x + p.x + p.y; 
	}
}
