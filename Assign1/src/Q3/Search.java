package Q3;

public class Search {

	public static int linearSearch(int arr[],int N, int key) {
		int count=0;
		for(int i=0;i<N;i++) {
			count++;
			if(key==arr[i]) {
				return count;
			}
		}
		return count;
	}
	public static int binarySearch(int arr[],int N, int key) {
		int count=0;
		int left=0,right=N-1,mid;
		while(left<=right) {
			count++;
			mid=(left+right)/2;
			if(key==arr[mid]) {
				return count;
			}
			else if(key<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {66,55,44,11,33,22,77};
		int arr2[]= {11,22,33,44,55,66,77};
		int key = 55;
		System.out.println("LS comps : "+linearSearch(arr1,arr1.length,key));
		System.out.println("BS comps : "+binarySearch(arr2,arr2.length,key));
	}

}
