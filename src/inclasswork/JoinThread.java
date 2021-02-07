package inclasswork;

public class JoinThread extends Thread {

	public Object ob = "";

	public void run() {
		synchronized (ob) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		JoinThread t1 = new JoinThread();
		JoinThread t2 = new JoinThread();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
