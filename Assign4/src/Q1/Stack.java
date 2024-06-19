package Q1;

public class Stack {
	static class Node{
		private int data;
		//private Node prev;
		private Node next;
		public Node(int value) {
			data=value;
		}
	}
	private Node head;
	public Stack() {
		head=null;
	}
	
	public void addFirst(int value) {
		Node newnode=new Node(value);
		if(isEmpty()) {
			head=newnode;
		}else {
			newnode.next=head;
			head=newnode;
		}
	}
	
	public void deleteFirst() {
		//Node newnode=new Node(value);
		if(isEmpty()) {
			return;
		}else {
			head=head.next;
		}
	}
	
	public void display() {
		if(isEmpty()) {
			return;
		}else {
			Node trav=head;
			
			System.out.println("Stack: ");
			while(trav!=null){
				System.out.println(" "+trav.data);
				trav=trav.next;
			}
			System.out.println();
		}
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void deleteAll() {
		head=null;
	}
	
}
