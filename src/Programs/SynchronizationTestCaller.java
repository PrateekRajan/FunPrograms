package Programs;

public class SynchronizationTestCaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SynchronizationTest obj = new SynchronizationTest();
		SynchronizationTest obj1 = new SynchronizationTest();


		Thread thread1 = new Thread(obj);
		Thread thread2 = new Thread(obj);

		thread1.start();
		thread2.start();
	}

}
