import java.awt.*;
public class Objparameter {
	public static void printPoint (Point p) {
    System.out.println ("(" + p.x + ", " + p.y + ")");
    } 
	public static void main (String[] args) {
		Point blank; 
		blank = new Point (3, 4); 
		System.out.println (blank);
		 printPoint (blank);
}
}
