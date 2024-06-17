package Q1;

import java.util.Arrays;

public class InsertionSortC {

	public static void insertionSort(int arr[], int N) {
		int comps=0;
		for (int i = 1; i < N; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				comps++;
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		System.out.println("No. of COmpaarisons: "+comps);
	}

	public static void main(String[] args) {
		int arr[] = { 55, 44, 33, 22, 11 };
		System.out.println("befor: "+Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("after: "+Arrays.toString(arr));

	}

}
