package Q5;

import java.util.Scanner;



public class StackMain {

	public static void main(String[] args) {
		StackDesc st=new StackDesc(4);
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
				st.push(sc.nextInt());
				break;
			case 2:
				System.out.println("Element popped: "+st.pop());
				break;
			case 3:
				System.out.println("Element peeked: "+st.peek());
				break;
			default:
				System.out.println("Invalid choice");
				break;
				
			}
		}while(choice!=0);
		sc.close();

	}

}
