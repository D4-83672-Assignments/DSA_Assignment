package PriorityQueue;

public class Heap {
	private int arr[];
	private int SIZE;
	public Heap(int size) {
		SIZE=0;
		arr=new int[size+1];
	}
	
	public void add(int value) {
		SIZE++;
		arr[SIZE]=value;
		
		int ci=SIZE;
		int pi=ci/2;
		while(pi>=1) {
			if(arr[pi]<arr[ci])
				break;
			int temp=arr[ci];
			arr[ci]=arr[pi];
			arr[pi]=temp;
			ci=pi;
			pi=ci/2;
		}
	}
	
	public int delete() {
		int max=arr[1];
		arr[1]=arr[SIZE];
		SIZE--;
		int pi=1;
		int ci=pi*2;
		while(ci<=SIZE) {
			
			
			if((ci+1)<=SIZE&&arr[ci+1]<arr[ci]) {
				ci=ci+1;
			}
			if(arr[pi]<arr[ci])
				break;
			int temp=arr[ci];
			arr[ci]=arr[pi];
			arr[pi]=temp;
			
			pi=ci;
			ci=pi*2;
			
		}
		return max;
	}
	
	public boolean isEmpty() {
		return SIZE==0;
	}
	public boolean isFull() {
		return SIZE==arr.length-1;
	}
	public int getMax() {
		return arr[1];
	}
}
