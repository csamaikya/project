
public class Time1 {
	int hour, minute;
    double second;
    public Time1() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }
    public Time1(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
   
	public static void printTime (Time1 t) {
		System.out.println (t.hour + ":" + t.minute + ":" + t.second);
		} 
	 public static void main(String[] args) {
	        Time1 t = new Time1();
	        t.hour = 10;
	        t.minute = 5;
	        t.second = 8.124;
	        System.out.println(t);

	        Time1 t1 = new Time1(10, 5, 8.124);
	        System.out.println(t1);
	        printTime(t);
	 }
}
