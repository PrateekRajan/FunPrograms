package Programs;

public class SumOfIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long sum = 0L;// Long is an object and long a primitive type
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.currentTimeMillis();
			sum += i;
		}
		long t2 = System.currentTimeMillis();

		System.out.print(sum + "\nTime " + (t2 - t1));
	}
}
