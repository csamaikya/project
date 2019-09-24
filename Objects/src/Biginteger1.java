import java.math.BigInteger;
public class Biginteger1 {
public static void main(String args[]){
int x=2; 
BigInteger small = BigInteger.valueOf (2); 
BigInteger big = BigInteger.valueOf (15); 
BigInteger sum = small.add (big); 
BigInteger mul = small.multiply (big);
BigInteger power =small.pow (x);
System.out.println(small);
System.out.println(big);
System.out.println(sum);
System.out.println(mul);
System.out.println(power);
}
}
