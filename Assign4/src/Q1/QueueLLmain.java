package Q1;

public class QueueLLmain {

	public static void main(String[] args) {
		Queue ql = new Queue();

		ql.addFirst(10);
		ql.display();
		ql.addFirst(20);
		ql.display();
		ql.addFirst(30);
		ql.display();
		ql.addFirst(40);
		ql.display();
		ql.deleteLast();
		ql.display();
		ql.deleteLast();
		ql.display();
		ql.deleteLast();
		ql.display();
		ql.deleteLast();
		ql.display();

	}

}
