package Programs;

public class ReorderSynchronization implements Runnable {

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("hello");
			System.out.println("world");
		}

	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ReorderSynchronization obj = new ReorderSynchronization();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);

		t1.start();
		t2.start();

	}

}
