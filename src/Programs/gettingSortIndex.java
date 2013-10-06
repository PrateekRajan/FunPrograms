package Programs;

import java.util.Arrays;
import java.util.HashMap;

public class gettingSortIndex {

	public static void gettingIndexVector(int[] input) {
		// Putting Values,Index as Key,Value pair in HashMap
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			hs.put(input[i], i);
		}
		// Sorting values from input
		Arrays.sort(input);
		// Getting Index from the hashmap in order of keys input
		for (int j = 0; j < input.length; j++) {
			System.out.print(hs.get(input[j]) + " ");
		}
	}

	public static void main(String[] args) {
		int[] input = { 100, 23, 1, 4, 78, 33, 90, 44, 12, 33 };
		gettingIndexVector(input);
	}
}
