
public class Time2 {
	int hour, minute;
    double second;
    public Time2() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }
    public static boolean after (Time2 time1, Time2 time2) {
    	if (time1.hour > time2.hour) 
    		return true; 
    	if (time1.hour < time2.hour) 
    		return false;
        if (time1.minute > time2.minute)
    	return true; 
    if (time1.minute < time2.minute) 
    	return false;
    if (time1.second > time2.second) 
    	return true; 
    return false;
    } 
	public static void main(String[] args) {
	        Time2 t1 = new Time2();
	        Time2 t2=new Time2();
	        t1.hour = 10;
	        t1.minute = 5;
	        t1.second = 8.124;
	        t2.hour = 10;
	        t2.minute = 5;
	        t2.second = 8.124;
	        
	      System.out.println( after(t1,t2));

	}	      
}
