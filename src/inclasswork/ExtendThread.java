package inclasswork;

public class ExtendThread extends Thread {

	public static void main(String[] args) {
		ExtendThread th = new ExtendThread();
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
