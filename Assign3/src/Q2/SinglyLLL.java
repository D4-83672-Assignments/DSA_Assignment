package Q2;

public class SinglyLLL {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public SinglyLLL() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		// 1. create newnode for given value
		Node newnode = new Node(value);
		// 2. add first node into next of newnode
		newnode.next = head;
		// 3. move head on newnode
		head = newnode;
	}

	public void insertAfter(int value, int afterValue) {
		if (isEmpty()) {
			System.out.println("List is empty. Cannot insert after.");
			return;
		}
		Node newnode = new Node(value);
		Node trav = head;
		while (trav != null && trav.data != afterValue) {
			trav = trav.next;
		}
		if (trav == null) {
			System.out.println("Value " + afterValue + " not found in list.");
			return;
		}
		newnode.next = trav.next;
		trav.next = newnode;
	}

	public void insertBefore(int value, int beforeValue) {
		if (isEmpty()) {
			System.out.println("List is empty. Cannot insert before.");
			return;
		}
		Node newnode = new Node(value);
		if (head.data == beforeValue) {
			newnode.next = head;
			head = newnode;
			return;
		}
		Node trav = head;
		while (trav.next != null && trav.next.data != beforeValue) {
			trav = trav.next;
		}
		if (trav.next == null) {
			System.out.println("Value " + beforeValue + " not found in the list.");
			return;
		}
		newnode.next = trav.next;
		trav.next = newnode;
	}

	public void display() {

		Node trav = head;
		System.out.print("List : ");
		System.out.println();
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
			System.out.println("");
		}
	}
}
