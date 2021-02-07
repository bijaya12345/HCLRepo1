package inclasswork;

public class SleepWaitSync {
	static Object LOCK = new Object();

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("Thread " + Thread.currentThread().getName() + " wake up after sleeping for 10 second");
		synchronized (LOCK) {
			LOCK.wait(10000);
			System.out.println("Object " + LOCK + " is woken up after waiting for 10 second");

		}
	}

}
