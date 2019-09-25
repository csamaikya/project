
public class AddTime {
	int hour, mintue;
	double second;
	 
	public static Time addTime (Time t1, Time t2) {
		Time sum = new Time (); 
		sum.hour = t1.hour + t2.hour; 
		sum.minute = t1.minute + t2.minute; 
		sum.second = t1.second + t2.second;
		if (sum.second >= 60.0) { 
		sum.second -= 60.0;
		sum.minute += 1;
		} if (sum.minute >= 60){
			sum.minute -= 60; 
			sum.hour += 1;
		}
		return sum;
}
	public static void printTime (Time t) {
		System.out.println (t.hour + ":" + t.minute + ":" + t.second);
		} 
	public static void main(String args[]){
		 
		Time t1 = new Time();
        Time t2=new Time();
        t1.hour = 9;
        t1.minute =14;
        t1.second = 30.0;
        t2.hour = 3;
        t2.minute = 35;
        t2.second = 0.0;
        Time t = addTime (t1,t2); 
	  	printTime(t);
		
	}
}
