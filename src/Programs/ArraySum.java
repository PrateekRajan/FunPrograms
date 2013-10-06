package Programs;

import java.util.HashSet;

public class ArraySum {

	public static void hasSum(int[] input, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : input) {
			if (set.contains(i)) {
				System.out.println("The elemets that add up to " + sum
						+ " are " + i + " and " + (sum - i));
			} else {
				set.add(sum - i);
			}
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, -5, 7, 8, 9 };
		hasSum(arr, 0);
	}

}
