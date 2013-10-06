package Programs;

public class SingletonThreadSafe {

	int counter;

	private static class loader {
		static SingletonThreadSafe instance = new SingletonThreadSafe();
	}

	public static SingletonThreadSafe getInstance() {
		return loader.instance;
	}

	public static void main(String[] args) {
		SingletonThreadSafe obj = SingletonThreadSafe.getInstance();
		SingletonThreadSafe obj1 = SingletonThreadSafe.getInstance();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());

	}

}
