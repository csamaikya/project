import java.math.BigInteger;
public class Bigpower {
	public static BigInteger power(int x, int n) {
		if (n == 0) 
		return BigInteger.valueOf(1);
		BigInteger b = BigInteger.valueOf (x); 
		BigInteger p = b.pow (n/2);
		BigInteger big= p.multiply(p); 
		if (n%2 == 0) { 
			return  big;
			} 
		else {
			return big.multiply(b);
			}
	}
  
		public static void main(String[] args) {
		int x=120, n=10;
			System.out.println(power(x,n));
			}
	}

