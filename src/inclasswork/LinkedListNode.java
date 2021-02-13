package inclasswork;

public class LinkedListNode {

	int data;
	LinkedListNode next;

	public LinkedListNode(int i, LinkedListNode next) {
		// TODO Auto-generated constructor stub
		data = i;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

}
