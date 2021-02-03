package inclasswork;

public class Thread1 extends Thread {

	public static void main(String[] args) {
		Thread1 th = new Thread1();
		th.start();
	}
	
	public void run() {
		try {
			System.out.println("Thread extending from thread class is running: ");
		}catch(Exception e) {
			System.out.println("Outta nowhere");
		}
	}

}
