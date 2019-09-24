import java.awt.*;
public class Null {
	public static void main (String[] args) {
	Point blank = new Point (3, 4); 
    blank = null;
	int x = blank.x; 
	blank.translate (50, 50);
}
}
