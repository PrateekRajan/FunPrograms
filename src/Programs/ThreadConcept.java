package Programs;

public class ThreadConcept implements Runnable {
	MyInteger myInteger;

	ThreadConcept(MyInteger i) {
		myInteger = i;
	}

	public void run() {
		while (true) {
			synchronized (this) {

				if (myInteger.getValue() < 6) {
					myInteger.increament();
					System.out.println("ThreadConcept  ThreadId : "
							+ Thread.currentThread().getId() + " Value :"
							+ myInteger.getValue());
				} else {

					return;
				}
			}
			Thread.yield();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyInteger x = new MyInteger(0);
		// MyInteger y = new MyInteger(0);

		ThreadConcept obj = new ThreadConcept(x);
		// ThreadConcept obj1 = new ThreadConcept(x);

		Thread t = new Thread(obj);
		Thread t1 = new Thread(obj);
		t.start();
		t1.start();
		t.join();
		// System.out.println("NOW STARTIN THREAD T1");
		t1.join();
		// while (x.getValue() < 6) {
		// x.increament();
		// System.out.println("main " + Thread.currentThread().getId() + " "
		// + x.getValue());
		// }

		System.out.println("done");
	}

}
