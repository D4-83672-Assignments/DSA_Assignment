package Q8;

public class CircularQueue {
	private int front;
	private int rear;
	private int SIZE;
	private int counter;
	private int arr[];

	public CircularQueue(int size) {
		SIZE = size;
		front = rear = -1;
		counter = 0;
		arr = new int[size];
	}

	public void push(int value) {
		if (!isFull()) {
			counter++;
			rear = (rear + 1) % SIZE;
			arr[rear] = value;
		} else {
			System.out.println("q Full");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			counter--;
			front = (front + 1) % SIZE;
			return arr[front];
		} else {
			System.out.println("q Empty");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return arr[front];
		}
		System.out.println("q EMpty");
		return -1;
	}

	public boolean isEmpty() {
		if (counter == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (counter == SIZE) {
			return true;
		}
		return false;
	}

}
