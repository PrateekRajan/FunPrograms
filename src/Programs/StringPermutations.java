package Programs;

public class StringPermutations {

	public void perm(String s) {
		if (s.length() < 2) {
			System.out.println(s);
		} else {
			permHelper("", s);
		}
	}

	private void permHelper(String s, String rest) {
		if (rest.isEmpty()) {
			System.out.println(s);
		} else {
			for (int i = 0; i < rest.length(); i++) {
				String next = s + rest.charAt(i);
				String remaining = rest.substring(0, i) + rest.substring(i + 1);
				permHelper(next, remaining);
			}
		}
	}

	public static void main(String[] args) {
		StringPermutations obj = new StringPermutations();
		String s = "pratek";
		obj.permHelper("", s);
	}
}
