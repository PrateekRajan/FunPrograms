package Programs;

public class StringFinalTest {

	public static class Objt {
		public String talk = "hello";
	}

	public void stringTest(String s1, String s2) {
		s1 = s2;
		System.out.println(s1 + " " + s2);
	}

	public void objTest(Objt ob1) {
		ob1 = new Objt();
	}

	public static void main(String[] args) {
		StringFinalTest sobj = new StringFinalTest();

		String s1 = "hello";
		String s2 = "World";
		sobj.stringTest(s1, s2);
		System.out.println(s1 + " " + s2);
		Objt ob1 = new Objt();
		System.out.println(ob1.talk);
		sobj.objTest(ob1);
		System.out.println(ob1.talk);
	}

}
