package Programs;


public class SynchronizationTest implements Runnable {

	static int var = 0;

	@Override
	public void run() {
		test();
	}

	private static synchronized void test() {
		System.out.println(Thread.currentThread().getName());
		var++;
		System.out.println(var);
		try {
			Thread.yield();
			
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("I am awake now " + Thread.currentThread().getName());
	}

}
