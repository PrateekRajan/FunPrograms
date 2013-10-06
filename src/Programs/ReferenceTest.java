package Programs;

public class ReferenceTest {
	int a = 10;
	int b = 20;

	public void foo(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);

	}

	public static void main(String[] args) {
		ReferenceTest obj = new ReferenceTest();
		obj.foo(obj.a, obj.b);
		System.out.println(obj.a + " " + obj.b);

	}
}
