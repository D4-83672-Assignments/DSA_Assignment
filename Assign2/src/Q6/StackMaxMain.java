package Q6;

import java.util.Scanner;

public class StackMaxMain {

	public static void main(String[] args) {
		Stack st=new Stack(4);
		Scanner sc=new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		for(int i=0;i<4;i++) {
			System.out.println("Enter Value");
			int value=sc.nextInt();
			if(value>max)
				max=value;
			st.push(value);
			
		}
		System.out.println("Max: "+max);
		

	}

}
