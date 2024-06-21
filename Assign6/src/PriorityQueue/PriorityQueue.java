package PriorityQueue;

public class PriorityQueue {
	private Heap h;
	private int pSIZE;

	public PriorityQueue(int size) {
		pSIZE = size;
		h=new Heap(pSIZE);
	}

	public void push(int value) {
		h.add(value);
	}

	public int pop() {
		return h.delete();
	}

	public int peek() {
		return h.getMax();
	}
}
