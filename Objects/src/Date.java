
public class Date {
    int year,month,day;

    public Date() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }
    public Date(int year, int month, int day) {
        this.year= year;
        this.month = month;
        this.day = day;
    }
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.year = 1989;
        d1.month = 10;
        d1.day = 21;
        System.out.println(d1);
        Date d2 = new Date(1989 , 10, 21);
        System.out.println(d2);
    }
}


