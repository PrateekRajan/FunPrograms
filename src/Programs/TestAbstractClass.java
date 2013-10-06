package Programs;

public class TestAbstractClass extends AbstractClassTest {

	public static int add(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		TestAbstractClass obj = new TestAbstractClass();
		System.out.println(obj.add(2, 4));
		AbstractClassTest act = new AbstractClassTest() {

		};// Curly braces are representing an anonymous class here we are not
			// actually creating an object of the abstract class but one of
			// anonymous class and having an abstract class reference pointing
			// to it.
		act.inAbstractClass();

	}
}
