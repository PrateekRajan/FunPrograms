package Programs;

public class String2Int {

	public int stringInt(String s) {
		if (s.length() < 1) {
			return 0;
		} else {
			return stringIntHelper(s);
		}
	}

	private int stringIntHelper(String s) {
		int i = 0;
		char[] temp = s.toCharArray();
		boolean isnegative = false;
		if (temp[0] == '-') {
			isnegative = true;
		}
		int begin = 0;
		if (isnegative) {
			begin = 2;
		} else {
			begin = 1;
		}
		i = Integer.parseInt("" + temp[begin - 1]);
		for (int x = begin; x < temp.length; x++) {
			i = i * 10 + Integer.parseInt("" + temp[x]);
		}
		if (isnegative) {
			i = i * -1;
		}

		return i;
	}

	public static void main(String[] args) {
		String2Int obj = new String2Int();
		String s = "2300";
		System.out.println(obj.stringInt(s));
	}

}
