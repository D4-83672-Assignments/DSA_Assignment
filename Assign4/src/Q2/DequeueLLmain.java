package Q2;

public class DequeueLLmain {
	public static void main(String[] args) {
		Dequeue dl = new Dequeue();
		dl.addFirst(20);
		dl.display();
		dl.addFirst(10);
		dl.display();
		dl.addLast(30);
		dl.display();
		dl.addLast(40);
		dl.display();
		dl.deleteFirst();
		dl.display();
		dl.deleteFirst();
		dl.display();
		dl.deletelast();
		dl.display();
		dl.deletelast();
		dl.display();

	}
}
