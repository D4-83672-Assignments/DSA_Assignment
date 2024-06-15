package Q9;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int arr[],int N) {
		int comps=0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				comps++;
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("comparisons: "+comps);
		
	}
	public static void main(String[] args) {
		int arr[]= {55,44,33,22,11};
		System.out.println(Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
