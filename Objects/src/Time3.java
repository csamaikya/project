
public class Time3 {
int hour, minute;
double second;
 public static void printTime (Time t) {
	System.out.println (t.hour + ":" + t.minute + ":" + t.second );
	} 	
	 public static Time addTime (Time t1, Time t2) {
		 Time sum = new Time (); 
		 sum.hour = t1.hour + t2.hour; 
		 sum.minute = t1.minute + t2.minute; 
		 sum.second = t1.second + t2.second; 
		 return sum; 
		 } 
	 public static void addTime1() {
		 Time currentTime = new Time (9, 14, 30.0); 
	  	 Time breadTime = new Time(3, 35, 0.0); 
	  	 Time doneTime = addTime (currentTime, breadTime); 
	  	 printTime (doneTime);  
	 }
		
public static void main(String[] args) {
	       
	  addTime1();
	     
	    }
}
