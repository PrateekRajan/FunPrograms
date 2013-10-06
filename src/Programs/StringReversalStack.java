package Programs;

import java.util.Stack;

public class StringReversalStack {

	public String reverse(String input) {
		if (input.isEmpty() || input == null) {
			return input;
		}
		return reverseHelper(input);
	}

	private String reverseHelper(String input) {
		Stack<Character> stk = new Stack<Character>();
		String output = "";
		String word = "";
		for (int i = 0; i < input.length(); i++) {
			stk.push(input.charAt(i));
		}
		while (!stk.isEmpty()) {
			char temp = stk.pop();
			if (temp == ' ') {
				output = output + " " + word;
				word = "";
			} else {
				word = temp + word;
				if (stk.isEmpty()) {
					output = output + " " + word;
					word = "";
				}
			}
		}
		return output.trim();
	}

	public static void main(String[] args) {
		StringReversalStack obj = new StringReversalStack();
		System.out.println(obj.reverse("This is test"));
	}
}
