package Programs;

public class StrCompression {

	public static String strCompression(String input) {
		String output = "";
		int count = 1;
		char last = input.charAt(0);
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == last) {
				count++;
			} else {
				output = output + last + "" + count;
				last = input.charAt(i);
				count = 1;
			}
		}
		return output + last + count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(strCompression("aabb cc"));
	}

}
