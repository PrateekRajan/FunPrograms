package Programs;

import java.util.Random;

public class StringTest {
	public static long SEED = System.currentTimeMillis();
	public static Random RANDOM = new Random(SEED);

	public boolean isEqual() {
		String b = "";
		System.out.println(b.length());
		return b.isEmpty();
	}

	public static void main(String[] args) {
		int i = 0;
		while (i < 100) {
			System.out.println(RANDOM.nextInt(100));
			i++;
		}
	}

}
