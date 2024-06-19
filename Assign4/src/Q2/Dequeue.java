package Q2;

public class Dequeue {
	static class Node {
		private Node prev;
		private Node next;

		private int data;

		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}

	private Node head;

	public Dequeue() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int value) {
		Node newnode=new Node(value);
		if(isEmpty()) {
			head=newnode;
			newnode.next=newnode.prev=head;
		}else {
			newnode.next=head;
			newnode.prev=head.prev;
			head.prev.next=newnode;
			head.prev=newnode;
			head=newnode;
		}
	}
	public void addLast(int value) {
		Node newnode=new Node(value);
		if(isEmpty()) {
			head=newnode;
			newnode.next=newnode.prev=head;
		}else {
			newnode.next=head;
			newnode.prev=head.prev;
			head.prev.next=newnode;
			head.prev=newnode;
		}
	}
	public void deleteFirst() {
		if(isEmpty()) {
			return;
		}else if(head==head.next) {
			head=null;
		}else {
			head.prev.next=head.next;
			head.next.prev=head.prev;
			head=head.next;
		}
	}
	public void deletelast() {
		if(isEmpty()) {
			return;
		}else if(head==head.next) {
			head=null;
		}else {
			head.prev=head.prev.prev;
			head.prev.next=head;
		}
	}

	public void display() {
		if (isEmpty()) {
			return;
		} else {
			Node trav = head;
			System.out.println("Dequeue: ");
			do {
				System.out.println(" " + trav.data);
				trav = trav.next;
			} while (trav != head);
			System.out.println();
		}
	}

}
