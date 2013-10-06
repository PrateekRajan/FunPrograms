package Programs;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SquareRootInteger {

	public static boolean isPerfectSquare(long n) {
		if (n < 0)
			return false;

		long tst = (long) (Math.sqrt(n) + 0.5);
		return tst * tst == n;
	}

	public static void main(String[] args) {
		long iterator = 1;
		int precision = 10;
		long startTime = System.nanoTime();
		while (iterator < 1000000000) {
			isPerfectSquare(iterator);
			iterator++;
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		BigDecimal dur = new BigDecimal(duration);
		BigDecimal iter = new BigDecimal(iterator);
		System.out.println("Speed "
				+ dur.divide(iter, precision, RoundingMode.HALF_UP).toString()
				+ " nano secs");

	}
}
