package HeapSort;

import java.util.Arrays;

public class HeapSortMain {

	public static void main(String[] args) {
		int arr[]= {0,6,14,3,26,8,18,21,9,5};
		Heap h=new Heap();
		System.out.println("Before Heapsort"+Arrays.toString(arr));
		h.heapSort(arr);
		System.out.println("After Heapsort"+Arrays.toString(arr));
	}

}
