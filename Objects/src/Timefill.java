
public class Timefill {
	int hour, mintue;
	static double second;
	public static void addTimeFill (Time t1, Time t2, Time sum) { 
		sum.hour = t1.hour + t2.hour; 
		sum.minute = t1.minute + t2.minute; 
		sum.second = t1.second + t2.second;
	if (sum.second >= 60.0) {
		sum.second -= 60.0;
		sum.minute += 1; 
		}
	if (sum.minute >= 60) { 
		sum.minute -= 60;
		sum.hour += 1; 
		}
	} 
	public static void printTime (Time t) {
			System.out.println (t.hour + ":" + t.minute + ":" + t.second);
	} 
	public static void main(String args[]){
		Time t1 = new Time();
        Time t2=new Time();
        Time sum=new Time();
        t1.hour = 9;
        t1.minute =14;
        t1.second = 30.0;
        t2.hour = 3;
        t2.minute = 35;
        t2.second = 0.0;
        addTimeFill (t1,t2,sum); 
	  	printTime(sum);
		
	}
}
