package inclasswork;

public class LinkedList {
	LinkedListNode head;
	LinkedListNode tail;

	public void append(int value) {
		tail.setNext(new LinkedListNode(value, null));
	}

	public void insertAtPosition(int value, int position) {
		LinkedListNode current = head;
		int currentPos = 0;
		while (currentPos < (position - 1)) {
			current = current.getNext();
			currentPos++;
		}
		LinkedListNode newNode = new LinkedListNode(value, current.getNext());
		current.setNext(newNode);
	}

}
