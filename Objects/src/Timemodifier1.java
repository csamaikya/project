
public class Timemodifier1 {
	int hour, mintue;
	static double second;
	public static void increment (Time time, double secs) {
		time.second += secs;
		while (time.second >= 60.0) { 
			time.second -= 60.0;
			time.minute += 1; 
			}
		while (time.minute >= 60) {
			time.minute -= 60; 
			time.hour += 1;
			}
	}
	public static void printTime (Time t) {
			System.out.println (t.hour + ":" + t.minute + ":" + t.second);
	} 
	public static void main(String args[]){
		    Time time = new Time();
	        time.hour = 9;
	        time.minute =60;
	        time.second = 30.0;
	        increment(time,second);
			printTime(time);
	
	}
	}


