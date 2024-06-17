package Q8;

import java.util.Scanner;



public class CircularQueueMain {

	public static void main(String[] args) {
		CircularQueue q=new CircularQueue(4);
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("0.EXIT\n1.push\n2.pop\n3.peek");
			System.out.println("Enter choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Exit");
				break;
			case 1:
				System.out.println("Enter value: ");
				q.push(sc.nextInt());
				break;
			case 2:
				System.out.println("Element popped: "+q.pop());
				break;
			case 3:
				System.out.println("Element peeked: "+q.peek());
				break;
			default:
				System.out.println("Invalid choice");
				break;
				
			}
		}while(choice!=0);
		sc.close();
	}

}
