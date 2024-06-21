package PriorityQueue;

public class PriorityQueueMain {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue(4);
		
		p.push(6);
		p.push(14);
		p.push(3);
		p.push(26);
		
		System.out.println("peek: "+p.peek());
		System.out.println("pop: "+p.pop());
		System.out.println("peek: "+p.peek());
	}

}
