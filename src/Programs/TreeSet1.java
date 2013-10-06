package Programs;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 1, 67, 92, 0, 23, 78 };
		Set<Integer> ts = new TreeSet<Integer>();
		Set<Integer> hs = new LinkedHashSet<Integer>();
		for (int i : arr) {
			ts.add(i);
			hs.add(i);
		}

		java.util.Iterator<Integer> tt = ts.iterator();
		java.util.Iterator<Integer> ht = hs.iterator();

		while (tt.hasNext()) {
			System.out.print(tt.next());
		}
		while (ht.hasNext()) {
			System.out.println(ht.next());
		}

	}

}
