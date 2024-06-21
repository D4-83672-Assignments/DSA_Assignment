package Q3;

import java.util.Scanner;

public class BSTreeMain {

	public static void main(String[] args) {
		BSTree bst=new BSTree();
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(6);
		bst.addNode(1);
		bst.addNode(14);
		bst.addNode(13);
		bst.addNode(7);
		bst.addNode(4);
		//bst.addNode(15);
		//bst.preorder();
		BSTree.Node ret=bst.BinarySearchR(1);
		if(ret==null)
			System.out.println("Not Found");
		else
			System.out.println("Found");
		
		//bst.delete(1);
		bst.preorder();
		System.out.println();
		
		System.out.println("leaf nodes "+bst.leafNodesI());
//		System.out.println("Non leaf nodes "+bst.nonLeafNodes());
		
//		System.out.println("Enter node to find depth:");
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		System.out.println("Depth:"+bst.depth1(num));
		
//		System.out.println("Enter node to find parent:");
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		System.out.println("Parent:"+bst.parent(num));
//		sc.close();
		

//		System.out.println("Enter node to find child:");
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		bst.child(num);
//		sc.close();
		
//		System.out.println("Siblings");
//		bst.sibling();
		//sc.close();
	}

}
