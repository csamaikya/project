
public class Timeconvert {
	int hour, minute;
    static double second;
	public static double convertToSeconds (Time t) {
		int minutes = t.hour * 60 + t.minute;
		double seconds = minutes * 60 + t.second; 
		return seconds;
		}  
	public Timeconvert (double second) { 
		this.hour = (int) (second / 3600.0);
		second -= this.hour * 3600.0;
		this.minute = (int) (second / 60.0);
		second -= this.minute * 60; 
		this.second = second;
		} 
	public static Timeconvert addTime (Time t1, Time t2) { 
		double seconds = convertToSeconds (t1) + convertToSeconds (t2);
		return new Timeconvert (seconds);
		} 
	public static void printTime (Timeconvert time) {
		System.out.println (time.hour + ":" + time.minute + ":" + time.second);
} 
		public static void main(String args[]){
		 Time t = new Time(9, 14, 30.0);
		 Time t1 = new Time();
	     Time t2=new Time();
	        t1.hour = 9;
	        t1.minute =14;
	        t1.second = 30.0;
	        t2.hour = 3;
	        t2.minute = 35;
	        t2.second = 0.0;
	        Timeconvert time1 = addTime (t1,t2); 
	        Timeconvert time=new Timeconvert(33270);
		  	System.out.println(convertToSeconds(t));
		    printTime(time);
            printTime(time1);
			}
}

