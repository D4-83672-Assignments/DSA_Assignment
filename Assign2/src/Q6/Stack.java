package Q6;

public class Stack {
	private int arr[];
	private int top;
	private int SIZE;
	
	public Stack(int size) {
		SIZE=size;
		top=-1;
		arr=new int[SIZE];
		// TODO Auto-generated constructor stub
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("stack is full");
		}else {
			top++;
			arr[top]=value;
		}
		
	}
	public int pop() {
		if(isEmpty())
		System.out.println("stack empty");
		else
			return arr[top--];
		return -1;
	}
	public int peek() {
		return arr[top];
	}
	public boolean isFull() {
		if(top==SIZE-1) {
			return true;
		}return false;
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}return false;
	}
}

