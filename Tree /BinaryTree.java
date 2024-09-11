package chap7;

public class BinaryTree {
	Node root;
	
	public BinaryTree() {
		root = null;
	}
	public boolean isEmpty() {
		return root == null;
	}

	public Node insertNode(Node root, int data) {
		if(root==null) {
			root = new Node(data);
			return root;
		}
		if(data < root.data)
			root.left = insertNode(root.left,data);
		else if(data > root.data) {
			root.right = insertNode(root.right,data);
		}
		return root;
	}

	public boolean searchNode(Node root, int data) {
		if(root==null){
			return false;
		}
		if(root.data == data) {
			return true;
		}
		return data < root.data ? searchNode(root.left, data) : searchNode(root.right, data);
	}
	
	public int minData(Node root) {
		int min = root.data;
		while(root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}
	
	public Node deleteNode(Node root, int data) {
		if(root == null)
			return root;
		if(data < root.data) {
			root.left = deleteNode(root.left, data);
		}
		else if(data > root.data) {
			root.right = deleteNode(root.right, data);
		}
		else {
			if(root.left == null)     
				return root.right; 
			else if(root.right == null)
				return root.left;
			root.data = minData(root.right); 
			root.right = deleteNode(root.right, root.data);
		}
		return root;
	}
	
	public void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	public void preorder(Node root) {
		if(root != null) {
			System.out.print(root.data+ " ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void postorder(Node root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+ " ");
		}
	}
}
