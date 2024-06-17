package Q4;

public class LinearQueue {
	private int arr[];
	private int front;
	private int rear;
	private int SIZE;

	public LinearQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}

	public void push(int value) {
		if (!isFull()) {
			//rear++;
			arr[rear] = value;
			rear++;
		} else {
			System.out.println("q full!!!");
		}

	}

	public int pop() {
		if (!isEmpty()) {
			int value=arr[front];
			front++;
			return value;
		} else {
			
			System.out.println("q empty!!!");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return arr[front];
		} else {
			System.out.println("q empty!!!");
			return -1;
		}

	}

	public boolean isFull() {
		if (rear == SIZE )
			return true;
		return false;
	}

	public boolean isEmpty() {
		if (rear == front)
			return true;
		return false;
	}

}
