
public class Timemodifier {
	int hour, mintue;
	static double second;
	public static void increment (Time time, double second) { 
		if (time.second >= 60.0) { 
		time.second -= 60.0; 
		time.minute += 1;
		} 
	if (time.minute >= 60) {
		time.minute -= 60;
		time.hour += 1;
		}
	} 
	public static void printTime (Time t) {
			System.out.println (t.hour + ":" + t.minute + ":" + t.second);
	} 
	public static void main(String args[]){
		    Time time = new Time();
	        time.hour = 10;
	        time.minute = 60;
	        time.second = 60.0;
	        increment(time,second);
			printTime(time);
	
	}
	}

