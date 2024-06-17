package Q7;

import java.util.Arrays;

public class ArrayRev {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44};
		int arrRev[]=new int[4];
		Stack st=new Stack(arr.length);
		System.out.println("before"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arrRev[i]=st.pop();
		}
		System.out.println("after"+Arrays.toString(arrRev));

	}

}
