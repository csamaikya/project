import java.awt.*;
public class Rect {
	public static Point findCenter (Rectangle box) { 
	int x = box.x + box.width/2; 
	int y = box.y + box.height/2; 
	return new Point (x, y); 
	} 
	public static void moveRect (Rectangle box, int dx, int dy) {
	box.x = box.x + dx; 
	box.y = box.y + dy; 
	} 
	public static void translate( int dx, int dy) { 
		Rectangle box = null;
		box.x = box.x + dx; 
		box.y = box.y + dy; 
		 } 
	public static void main(String args[]){
	Rectangle box = new Rectangle (0, 0, 100, 200); 
	findCenter(box);
	System.out.println(box);
	moveRect (box, 50, 100);
	System.out.println (box);
	box.translate (50, 100);
	System.out.println (box);
} 
}
