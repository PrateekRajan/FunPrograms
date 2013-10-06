package Programs;

import java.util.Random;

public class RandominzeArray {

	public static long SEED = System.currentTimeMillis();
	public static Random RANDOM = new Random(SEED);

	public static void shuffle(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int swap = RANDOM.nextInt(i + 1);
			System.out.print(swap + " ");
			int temp = numbers[swap];
			numbers[swap] = numbers[i];
			numbers[i] = temp;
		}

		// for (int i = 0; i < numbers.length; i++) {
		// System.out.print(numbers[i] + ", ");
		// }
	}

	public static void main(String[] args) {
		shuffle(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 });
	}

}
