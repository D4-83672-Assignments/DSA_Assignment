package Q8;

import java.util.Arrays;

public class Rank {
	public static void bubbleSort(int arr[],int N) {
		int flag;
		for(int i=1;i<N;i++) {
			flag=0;
			for(int j=0;j<N-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
				
			}if(flag==0) break;
		}
		//System.out.println(Arrays.toString(arr));
	}
	public static int binarySearch(int arr[],int N, int key) {
		int count=0;
		int left=0,right=N-1,mid;
		while(left<=right) {
			count++;
			mid=(left+right)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
	int arr[]= {10, 20, 15, 3, 4, 4, 1,10};
	bubbleSort(arr,arr.length);
	int key=10;
	//System.out.println(Arrays.toString(arr));
	if(binarySearch(arr, arr.length, key)==-1)
		System.out.println("not found");
	//System.out.println(Arrays.toString(arr));
	System.out.println("Element Rank: "+(binarySearch(arr, arr.length, key)+1));

	}

}
