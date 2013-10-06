package Programs;

public class TestReference1 {
	int x = 10;
	int y = 20;

	public void swap(TestReference1 obj) {
		System.out.println("Before swap in swap method" + obj.x + " " + obj.y);
		TestReference1 dummy = new TestReference1();
		obj = dummy;
		int temp;
		temp = obj.x;
		obj.x = obj.y;
		obj.y = temp;
		System.out.println("After swap in swap method" + obj.x + " " + obj.y);
	}

	public static void main(String[] args) {
		TestReference1 obj = new TestReference1();
		obj.swap(obj);
		System.out.println("After Swap method " + obj.x + " " + obj.y);
	}
}