package Q6;

public class LinearSearch {
	public static int linearSearch(int arr[],int N,int key,int occurence) {
		int count=0,pos=-1;
		for(int i=0;i<N;i++) {
			if(key==arr[i]) {
				count++;
				pos=i;
				if(count==occurence) {
					return pos;
				}
			}
		}
//		if(count>=occurence) {
//			return pos;
//		}
		
			return -1;
	}
	public static void main(String[] args) {
		int arr[]= {11,22,11,22,11,33,11};
		int key =11;
		int n=3;
		System.out.println("index: "+linearSearch(arr,arr.length,key,n));
		// TODO Auto-generated method stub

	}

}
