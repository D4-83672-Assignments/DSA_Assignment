package Q7;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class NonRepeat {

	public static int search(int arr[],int N) {
		int count=0,pos=-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					pos=i;
				}
				if(count>1) {
					count=0;
					break;
				}
				
			}
			if(count==1) {
				return arr[pos];
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int arr[]= { 1, 2, 3, -1,3, 2, 1, 0, 4, -1, 7, 8};
		//LinkedHashMap<Integer,Integer> hashArr=new LinkedHashMap<Integer,Integer>();
		
		System.out.println("element: "+search(arr,arr.length));
	}

}
