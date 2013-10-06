package Programs;

public class ThreadTest implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadTest obj = new ThreadTest();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();
	}

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				if (i % 2 == 0) {
					Thread.currentThread().yield();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
