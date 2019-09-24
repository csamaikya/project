import java.awt.*;
public class Point2 {
	public static void main (String[] args) {
		Point blank =new Point(4,6); 
		System.out.println (blank.x + ", " + blank.y);
		int distance = blank.x * blank.x + blank.y * blank.y; 
		System.out.println(distance);
		}

}
