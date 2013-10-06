package Programs;

public class IsPalindrome {

	public static boolean isPalin(int input) {
		int reverse = 0;
		int mod = 0;
		int temp = input;
		while (temp > 0) {
			mod = temp % 10;
			temp = temp / 10;
			reverse = reverse * 10 + mod;
		}
		return (reverse == input);
	}

	public static void main(String[] args) {
		System.out.println(isPalin(030));
	}

}
