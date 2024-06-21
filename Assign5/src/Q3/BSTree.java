package Q3;

import java.util.LinkedList;
import java.util.Queue;

public class BSTree {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;
	// private int count;

	public BSTree() {
		root = null;
		// count = 0;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		if (isEmpty()) {
			root = new Node(value);
			return;
		}

		addNodeR(root, value);
	}

	public void addNodeR(Node trav, int value) {
		if (value < trav.data) {
			if (trav.left == null) {
				trav.left = new Node(value);
				return;
			} else {
				addNodeR(trav.left, value);
			}
		} else {
			if (trav.right == null) {
				trav.right = new Node(value);
				return;
			} else {
				addNodeR(trav.right, value);
			}
		}
	}

	public Node BinarySearchR(int key) {
		return BinarySearchR(root, key);
	}

	public Node BinarySearchR(Node trav, int key) {

		if (trav == null)
			return null;
		if (key == trav.data)
			return trav;
		if (key < trav.data)
			return BinarySearchR(trav.left, key);
		if (key > trav.data)
			return BinarySearchR(trav.right, key);

		return null;

	}

	public Node[] BinarySearchP(int key) {
		Node trav = root;
		Node parent = null;
		while (trav != null) {
			if (key == trav.data)
				break;
			parent = trav;
			if (key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		if (trav == null)
			parent = null;
		Node arr[] = new Node[] { trav, parent };
		return arr;
	}

	public void delete(int key) {
		Node[] arr = BinarySearchP(key);
		Node temp = arr[0];
		Node parent = arr[1];
		if (temp == null) {
			return;
		}
		if (temp.left != null && temp.right != null) {
			Node insuc = temp.right;
			parent = temp;
			while (insuc.left != null) {
				parent = insuc;
				insuc = insuc.left;
			}
			temp.data = insuc.data;
			temp = insuc;
		}
		if (temp.left == null) {
			if (temp == root) {
				root = temp.right;
			} else if (temp == parent.left) {
				parent.left = temp.right;
			} else if (temp == parent.right) {
				parent.right = temp.right;

			}
		} else {
			if (temp == root) {
				root = temp.left;
			} else if (temp == parent.left) {
				parent.left = temp.left;
			} else if (temp == parent.right) {
				parent.right = temp.left;

			}
		}
	}

	public int leafNodes() {
		return leafNodes(root);
	}

	public int leafNodes(Node trav) {
		if (trav == null)
			return 0;
		// Node trav=root;
		if (trav.left == null && trav.right == null) {
			return 1;
		}

		return leafNodes(trav.left) + leafNodes(trav.right);
	}
	
	public int leafNodesI() {
		Queue<Node> q=new LinkedList<BSTree.Node>();
		q.offer(root);
		int leafNode=0;
		while(!q.isEmpty()) {
			Node trav=q.poll();
			if(trav.left==null&&trav.right==null)
				leafNode++;
			if(trav.left!=null)
				q.offer(trav.left);
			if(trav.right!=null)
				q.offer(trav.right);
				
		}
		return leafNode;
		
	}

	public int nonLeafNodes() {
		return nonLeafNodes(root);
	}

	public int nonLeafNodes(Node trav) {
		if (trav == null || (trav.left == null && trav.right == null))
			return 0;
		// Node trav=root;
//		if (trav.left == null || trav.right == null || (trav.left != null && trav.right != null)) {
//			return 1;
//		}

		return 1 + leafNodes(trav.left) + leafNodes(trav.right);
	}

	public void preorder() {
		preorder(root);
	}

	public int depth1(int key) {
		return depth(root, key, 0);
	}

	public int depth(Node trav, int key, int depth) {

		if (trav == null) {
			return -1;
		}
		if (key == trav.data) {
			return depth;
		}
		if (key < trav.data)
			depth = depth(trav.left, key, depth + 1);
		else
			depth = depth(trav.right, key, depth + 1);
		return depth;

	}

	public int parent(int key) {
		Node trav = root;
		Node parent = null;
		while (trav != null) {
			if (trav.data == key) {
				break;
			}
			parent = trav;
			if (trav.data > key) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}
		if (trav == null)
			parent = null;
		return parent.data;
	}

	public void child(int key) {
		Node trav = root;
		while (trav != null) {
			if (trav.data == key) {
				break;
			}
			if (trav.data > key) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}
		if (trav.left == null) {
			System.out.println("Left child " + "no child");
		} else
			System.out.println("Left child " + trav.left.data);
		if (trav.right == null) {
			System.out.println("right child " + "no child");
		} else
			System.out.println("right child " + trav.right.data);

	}

	public void sibling() {
		siblings(root);
	}

	public void siblings(Node trav) {
		if(trav==null)
			return;
		if (trav.left != null && trav.right != null) {
			System.out.println("Left child " + trav.left.data);
			System.out.println("right child " + trav.right.data);
			
		}
		
		siblings(trav.left);
		siblings(trav.right);

	}

	public void preorder(Node trav) {
		// trav=root;
		if (trav == null) {
			return;
		}
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}
}
