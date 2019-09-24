public class Time {
    int hour, minute;
    double second;
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }
    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.hour = 10;
        t1.minute = 5;
        t1.second = 8.124;
        System.out.println(t1);

        Time t2 = new Time(10, 5, 8.124);
        System.out.println(t2);
    }
}

