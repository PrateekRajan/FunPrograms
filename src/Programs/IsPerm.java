package Programs;

public class IsPerm {

	public boolean isPerm(String S1, String S2) {
		if (S1.length() != S2.length()) {
			return false;
		}
		boolean[] arr = new boolean[256];
		for (int i = 0; i < S1.length(); i++) {
			int val = S1.charAt(i);
			arr[val] = true;
		}
		for (int i = 0; i < S2.length(); i++) {
			int val = S2.charAt(i);
			if (!arr[val]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IsPerm obj = new IsPerm();
		System.out.println(obj.isPerm("aabg", "bbag"));
	}

}
