package Q3;

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
	private Node tail;

	public SinglyLLL() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void addFirst(int value) {

		Node newnode = new Node(value);
		if (isEmpty()) {
			head = tail = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	private void displayReverse(Node node) {
        if (node == null) {
            return;
        }
        displayReverse(node.next);
        System.out.print(" " + node.data);
    }
	public void reverse() {
		System.out.println("Reverse: ");
		displayReverse(head);
	}

//	public void insertAfter(int value, int afterValue) {
//		if (isEmpty()) {
//			System.out.println("List is empty. Cannot insert after.");
//			return;
//		}
//		Node newnode = new Node(value);
//		Node trav = head;
//		while (trav != null && trav.data != afterValue) {
//			trav = trav.next;
//		}
//		if (trav == null) {
//			System.out.println("Value " + afterValue + " not found in list.");
//			return;
//		}
//		newnode.next = trav.next;
//		trav.next = newnode;
//	}
//
//	public void insertBefore(int value, int beforeValue) {
//		if (isEmpty()) {
//			System.out.println("List is empty. Cannot insert before.");
//			return;
//		}
//		Node newnode = new Node(value);
//		if (head.data == beforeValue) {
//			newnode.next = head;
//			head = newnode;
//			return;
//		}
//		Node trav = head;
//		while (trav.next != null && trav.next.data != beforeValue) {
//			trav = trav.next;
//		}
//		if (trav.next == null) {
//			System.out.println("Value " + beforeValue + " not found in the list.");
//			return;
//		}
//		newnode.next = trav.next;
//		trav.next = newnode;
//	}

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
