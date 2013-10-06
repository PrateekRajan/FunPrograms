package Programs;

public class ClosestPalindrome {

	public static boolean isPalindrome(int input) {
		int rev = 0;
		int n = input;
		while (n > 0) {
			int temp = n % 10;
			rev = rev * 10 + temp;
			n = n / 10;
		}
		if (input == rev) {
			return true;
		}
		return false;
	}

	public static void firstPalindrome(int num) {
		int forward = num;
		int backward = num;
		int countf = 0;
		int countb = 0;
		while (!isPalindrome(forward) && !isPalindrome(backward)) {
			countf++;
			countb++;
			forward++;
			backward--;
		}
		if (isPalindrome(forward)) {
			countb++;
		}
		if (isPalindrome(backward)) {
			countf++;
		}
		if (countf == countb) {
			System.out.println(forward + " " + backward);
		}
		if (countf > countb) {
			System.out.println(backward);
		}
		if (countf < countb) {
			System.out.println(forward);
		}
	}

	public static void main(String[] args) {
		firstPalindrome(500);
	}

}
