package inclasswork;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s = new int[5];

		try {
			s[5] = 7;
			s[4] = 3;

		}

		catch (Exception e) {
			System.out.println("Exception: " + e);

		} finally {
			// here we write logic for close and shutdown for resource class like
			// closable and auto-closable
			System.out.println("Finally will print anyhow");
		}

	}

}
