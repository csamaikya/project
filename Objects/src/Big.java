import java.math.BigInteger;
public class Big {

	public static BigInteger factorial(int n) {
		if (n > 0) {
		return BigInteger.valueOf(n).multiply(factorial(n - 1));
		}
		else
		return BigInteger.valueOf(1);
		}
		public static void main(String[] args) {
			for(int i=0; i<= 30;i++) {
			System.out.println( factorial(i));
			}
	}
}

