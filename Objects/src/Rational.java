
public class Rational {
	int numerator, denominator;
	public Rational() {
		this.numerator = 0;
		this.denominator = 0;
	}
	public static void printRational(Rational r) {
		System.out.println(r.numerator +  "/"  + r.denominator);
	}
	public Rational(int n, int d) {
		this.numerator = n;
		this.denominator = d;
	}
	public static void reset(Rational r) {
		r.numerator = 5;
		r.denominator =35;
	}
	public static void negate(Rational r) {
		r.numerator =r.numerator * -1;
		r.denominator =r.denominator * -1;
		}
	
	public static void invert(Rational r) {
		int N = r.numerator;
		int D = r.denominator;
		
		r.numerator = D;
		r.denominator = N;
	}
	public static double toDouble(Rational r) {
		double result = (double)r.numerator / (double)r.denominator;
		return result;
	}
	public static void reduce(Rational r) {
		int reminder,gcd,n1, n2;
		n1 = r.numerator;
		n2 = r.denominator;
		reminder = n1 % n2;
		while(reminder != 0) {
			reminder = n1 % n2 ;
			n1 = n2;
			n2 = reminder;
		}
		gcd = n1;
		Rational res = new Rational(r.numerator/gcd, r.denominator/gcd);
		printRational(res);
	}
	
	
	public static void main(String[] args) {
		Rational r = new Rational(0, 0);
		reset(r);
		printRational(r);
		reset(r);
		negate(r);
		printRational(r);
		reset(r);
		invert(r);
		printRational(r);
		reset(r);
		double doubleVal = toDouble(r);
		System.out.println(doubleVal);
		reset(r);
		reduce(r);
	
	}
}
	