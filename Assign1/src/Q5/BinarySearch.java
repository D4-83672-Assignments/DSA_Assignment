package Q5;

public class BinarySearch {
	public static int binarySearch(int arr[],int N, int key) {
		//int count=0;
		int left=0,right=N-1,mid;
		while(left<=right) {
			//count++;
			mid=(left+right)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {99,88,77,66,55,44,33,22,11};
		int key=44;
		System.out.println("index: "+binarySearch(arr, arr.length,key));
		
	}

}
