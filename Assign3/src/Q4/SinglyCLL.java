package Q4;

public class SinglyCLL {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	Node head;
	Node tail;
	int count;

	public SinglyCLL() {
		head = tail = null;
		count = 0;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void addFirst(int value) {
		Node newnode=new Node(value);
		if(isEmpty()) {
			tail=head=newnode;
			newnode.next=newnode;
		}else {
		newnode.next=head;
		tail.next=newnode;
		head=newnode;
		}
		count++;
		
	}
	
	public void insertSort(int value) {
		Node newnode=new Node(value);
		if(isEmpty()||head.data>=value) {
			
			newnode.next=head;
			tail=head=newnode;
			return;
		}else {
			Node trav=head;
			while(trav.next!=null&&trav.next.data<value) {
				trav=trav.next;
			}
			newnode.next=trav.next;
			trav.next=newnode;
		}
		count++;
	}
	
	public void display() {
		if(isEmpty()) {
			return;
		}
		Node trav=head;
		System.out.println("List: ");
		do {
			System.out.println(" "+trav.data);
			trav=trav.next;
		}while(trav!=head);
		System.out.println("Count: "+count);
	}
}
