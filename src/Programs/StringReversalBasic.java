package Programs;

public class StringReversalBasic {

	public static String reverse(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		String reverse = "";
		String word = "";
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		for (int j = 0; j < reverse.length(); j++) {
			if (reverse.charAt(j) == ' ') {
				output = output + " " + word;
				word = "";
			} else {
				word = reverse.charAt(j) + word;
				if (j == reverse.length() - 1) {
					output = output + " " + word;

				}
			}
		}
		return output.trim();
	}

	public static void main(String[] args) {
		System.out.println(reverse("APPLE"));
	}

}
