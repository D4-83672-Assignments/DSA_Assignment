package Q2;

public class LinearSearch {
	public static int linearSearch(int arr[],int N,int key) {
		int lastOccurnece=-1;
		for(int i=0;i<N;i++) {
			if(key==arr[i]) {
				lastOccurnece=i;
			}
		}
		if(lastOccurnece==-1)
		return -1;
		else
			return lastOccurnece;
	}

	public static void main(String[] args) {
		int arr[]= {33,22,11,44,11,66,88,11};
		int key=11;
		int index=linearSearch(arr,arr.length,key);
		System.out.println("Index "+index);
		

	}

}
