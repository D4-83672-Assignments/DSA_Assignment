package Q1head;

public class SinglyCLL_Tail {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	Node head;
	int count;

	public SinglyCLL_Tail() {
		head = null;
		count = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			newnode.next = newnode;
		} else {

			Node trav=head;
			while(trav.next!=head) {
				trav=trav.next;
			}
			newnode.next = head;
			trav.next=newnode;
			head = newnode;
			
			
			
		}
		count++;
	}

//	public void addLast(int value) {
//		Node newnode = new Node(value);
//		if (isEmpty()) {
//			tail = newnode;
//			newnode.next = newnode;
//		} else {
////			Node trav=tail;
////			trav=trav.next;
//			newnode.next = tail.next;
//			tail.next = newnode;
//			// newnode.next=trav;
//			tail = newnode;
//		}
//		count++;
//	}
//
//	public void addPosition(int value, int pos) {
//
//		if (pos < 1 || pos > count + 1) {
//			System.out.println("Invalid Position");
//			return;
//		}
//		Node newnode = new Node(value);
//		if (tail == null) {
//			tail = newnode;
//			newnode.next = newnode;
//		} else if (pos == 1) {
//			addFirst(value);
//		} else {
//			Node trav = tail.next;
//			for (int i = 1; i < pos - 1; i++) {
//				trav = trav.next;
//			}
//			newnode.next = trav.next;
//			trav.next = newnode;
//
//			if (trav == tail)
//				tail = newnode;
//
//		}
//		count++;
//
//	}
//
//	public void deletePosition(int pos) {
//		if (pos < 1 || pos > count) {
//			System.out.println("Invalid position");
//			return;
//		}
//		if (isEmpty()) {
//			return;
//		} else if (pos == 1) {
//			deleteFirst();
//			return;
//		}else if(tail==tail.next) {
//			tail=null;
//			
//		}else {
//			Node trav=tail.next;
//			for(int i = 1 ; i < pos - 1 ; i++)
//				trav = trav.next;
//			
//			if(trav.next==tail) {
//				tail=trav;
//			}
//			trav.next=trav.next.next;
//		}
//		count--;
//	}
//
//	public void deleteFirst() {
//		if (isEmpty())
//			return;
//		else if (tail == tail.next) {
//			tail = null;
//		} else {
//			tail.next = tail.next.next;
//
//		}
//		count--;
//	}
//
//	public void deleteLast() {
//		if (isEmpty())
//			return;
//		else if (tail == tail.next) {
//			tail = null;
//		} else {
//			Node trav = tail.next;
//			while (trav.next != tail) {
//				trav = trav.next;
//			}
//			trav.next = tail.next;
//			tail = trav;
//
//		}
//		count--;
//	}
//
	public void display() {
		if (isEmpty()) {
			return;
		}

		Node trav = head;
		System.out.println("List : ");
		do {
			System.out.println(" " + trav.data);
			trav = trav.next;
		} while (trav != head);
		System.out.println("");
		System.out.println("Node count : " + count);

	}

}
