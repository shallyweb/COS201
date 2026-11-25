java
import java.math.BigInteger;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 100;
        BigInteger t1 = BigInteger.ZERO;
        BigInteger t2 = BigInteger.ONE;

        System.out.println("The first " + n + " numbers of the Fibonacci sequence:");

        for (int i = 1; i <= n; i++) {
            System.out.println("Term " + i + ": " + t1);

            // then we'll compute the next term
            BigInteger sum = t1.add(t2);
            t1 = t2;
            t2 = sum;
        }
    }
}
