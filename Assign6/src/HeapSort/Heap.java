package HeapSort;



public class Heap {
	private int SIZE;

	public Heap() {
		SIZE = 0;
	}

	public void add(int arr[]) {
		SIZE++;
		int ci = SIZE;
		int pi = ci / 2;
		while (pi >= 1) {
			if (arr[ci] > arr[pi])
				break;
			int temp = arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = temp;

			ci = pi;
			pi = ci / 2;
		}

	}
	
	public int delete(int arr[]) {
		int max=arr[1];
		arr[1]=arr[SIZE];
		arr[SIZE]=max;
		SIZE--;
		int pi=1;
		int ci=pi*2;
		while(ci<=SIZE) {
			
			if((ci+1)<=SIZE&&arr[ci+1]<arr[ci])
				ci=ci+1;
			if(arr[pi]<arr[ci]) {
				break;
			}
			int temp=arr[ci];
			arr[ci]=arr[pi];
			arr[pi]=temp;
			
			pi=ci;
			ci=pi*2;
			
		}
		return max;
	}

	public void heapSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			add(arr);
		}
		for (int i = 1; i < arr.length; i++) {
			delete(arr);
		}
	}
}
