package Q1;



public class Queue {
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

	public Queue() {
		head = tail = null;

	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = tail = newnode;
			tail.next = head;
		} else {
			newnode.next = head;
			head = newnode;
			tail.next = head;
		}
	}

	public void deleteLast() {
		if (isEmpty())
			return;
		else if (tail == tail.next) {
			head=tail = null;
		} else {
			Node trav = head;
			while (trav.next != tail) {
				trav = trav.next;
			}
			trav.next = head;
			tail = trav;

		}
		// count--;
	}

	public void display() {
		if (isEmpty()) {
			return;
		} else {
			Node trav = head;

			System.out.println("Queue: ");
			 do {
		            System.out.print(trav.data + " ");
		            trav = trav.next;
		        } while (trav != head);
			System.out.println();
		}
	}
}
