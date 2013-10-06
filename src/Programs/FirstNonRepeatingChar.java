package Programs;

public class FirstNonRepeatingChar {

	public char firstNonRepeating(String s) {
		char return_char = 0;
		if (s == null || s.isEmpty()) {
			return 0;
		}
		int[] arr = new int[256];
		for (char i : s.toCharArray()) {
			int index = (int) i;
			arr[index]++;
		}
		for (char i : s.toCharArray()) {
			int index = (int) i;
			if (arr[index] == 1) {
				return_char = Character.toChars(index)[0];
				break;
			}
		}
		return return_char;
	}

	public static void main(String[] args) {
		FirstNonRepeatingChar obj = new FirstNonRepeatingChar();
		System.out.println(obj.firstNonRepeating(""));

	}

}
