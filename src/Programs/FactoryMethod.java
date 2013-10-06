package Programs;

/**
 * 
 * @author Prateek
 * @brief Factory method is different from factory design pattern
 * 
 */
public class FactoryMethod {
	static FactoryMethod instance = null;
	int x;

	private FactoryMethod() {
	}

	public static FactoryMethod provideInstance() {
		if (instance == null) {
			instance = new FactoryMethod();
			return instance;
		} else {
			return instance;
		}
	}

	public static void main(String[] args) {
		FactoryMethod obj = FactoryMethod.provideInstance();
//		FactoryMethod obj = new FactoryMethod();
		obj.x = 20;
		System.out.println("From 1st Object " + obj.x);
		FactoryMethod obj1 = FactoryMethod.provideInstance();
//		FactoryMethod obj1 = new FactoryMethod();
		System.out.println("From 2nd Object " + obj1.x);
	}

}
