package Programs;

public class SubStringCheck {

	public static boolean Substring(String s1, String s2) {
		boolean is_substring = true;
		if (s2.length() > s1.length()) {
			return false;
		}
		char[] input = s1.toCharArray();
		char[] sub = s2.toCharArray();

		for (int i = 0; i < input.length; i++) {
			if (input[i] == sub[0] && (input.length - i > sub.length)) {
				int temp = i + 1;
				for (int j = 1; j < sub.length; j++) {
					if (input[temp] == sub[j]) {
						is_substring = true;
					} else {
						is_substring = false;
					}
					temp++;
				}
			}
		}
		return is_substring;
	}

	public static void main(String[] args) {
		System.out.println(Substring("This is the test", " "));
	}
}
