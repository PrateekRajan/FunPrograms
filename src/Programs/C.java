package Programs;

public class C extends A {

	public void fromMethod() {
		System.out.println("I am from class C");
	}

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		A a = new C();
		a.fromMethod();
	}

}
