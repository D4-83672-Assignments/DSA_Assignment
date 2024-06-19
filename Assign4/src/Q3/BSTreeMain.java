package Q3;

//package com.sunbeam;

public class BSTreeMain {

	public static void main(String[] args) {
		
		BSTree bst = new BSTree();
		
		bst.addNodeRecursively(8);
		bst.addNodeRecursively(3);
		bst.addNodeRecursively(10);
		bst.addNodeRecursively(6);
		bst.addNodeRecursively(1);
		bst.addNodeRecursively(14);
		bst.addNodeRecursively(13);
		bst.addNodeRecursively(7);
		bst.addNodeRecursively(4);
		
		bst.preorder();

	}

}

