package Programs;

public class LongestMatchingSequence {

	public int longestIndex(int[] s1, int[] s2) {
		if (s1.length != s2.length) {
			return -1;
		}
		int index = -1;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < s1.length; i++) {
			sum1 = sum1 + s1[i];
			sum2 = sum2 + s2[i];
			if (sum1 == sum2) {
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int[] arr1 = { 1, 0, 0, 1, 0, 1, 1 };
		int[] arr2 = { 1, 1, 0, 1, 0, 0, 0 };
		LongestMatchingSequence lobj = new LongestMatchingSequence();
		System.out.println(lobj.longestIndex(arr1, arr2));
	}
}
