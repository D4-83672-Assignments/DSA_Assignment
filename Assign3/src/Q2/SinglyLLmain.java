package Q2;

public class SinglyLLmain {
	public static void main(String[] args) {
		SinglyLLL l1 = new SinglyLLL();
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		//l1.insertAfter(50,30);
		l1.insertBefore(50,40);
		l1.display();
	}
}
