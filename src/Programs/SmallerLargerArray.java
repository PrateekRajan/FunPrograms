package Programs;

import java.util.HashSet;

public class SmallerLargerArray {

	public static void calc(int[] input, int pivot) {
		int index = -1;
		int countl = 0;
		int countr = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] == pivot) {
				index = i;
			}
		}
		HashSet<Integer> hs = new HashSet<Integer>();
		int j = 0;
		int k = index + 1;
		while (j < index) {
			if (input[j] < pivot && !hs.contains(input[j])) {
				countl++;
				hs.add(input[j]);
			}
			j++;
		}
		while (k < input.length) {
			if (input[k] > pivot && !hs.contains(input[k])) {
				countr++;
				hs.add(input[k]);
			}
			k++;
		}
		System.out.println("Less than pivot " + countl + " Greater than pivot "
				+ countr);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 7, 7, 8, 9, 10, 9, 9, 9 };
		calc(arr, 5);
	}

}
