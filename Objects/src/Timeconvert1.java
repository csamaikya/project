
public class Timeconvert1 {
	int hour, minute;
    static double second;
	public static double convertToSeconds (Time t) {
		int minutes = t.hour * 60 + t.minute;
		double seconds = minutes * 60 + t.second; 
		return seconds;
		}  
	public Timeconvert1 (double second) { 
		this.hour = (int) (second / 3600.0);
		second -= this.hour * 3600.0;
		this.minute = (int) (second / 60.0);
		second -= this.minute * 60; 
		this.second = second;
		} 
	public static Timeconvert1 increment (Time t, double seconds) { 
		double second = convertToSeconds (t) + seconds;
		return new Timeconvert1 (second);
		} 
	public static void printTime (Timeconvert1 time) {
		System.out.println (time.hour + ":" + time.minute + ":" + time.second);
} 
		public static void main(String args[]){
		 Time t = new Time(9, 60, 30.0);
		    Timeconvert1 time1 = increment (t,second); 
		  	System.out.println(convertToSeconds(t));
		    printTime(time1);
			}
}

