package inclasswork;

public class ImplementRunnable implements Runnable {

	static int count = 0;

	@Override
	public void run() {
		while (count <= 10) {
			try {
				System.out.println("ExplThread: " + (count++));
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println("Exception in thread: " + e.getMessage());

			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Printing from main thread: ");
		ImplementRunnable t = new ImplementRunnable();
		Thread th = new Thread(t);
		th.start();
		while (count <= 10) {
			try {
				System.out.println("Main Thread: " + (count++));
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println("Exception in thread: " + e.getMessage());

			}
		}

	}

}
