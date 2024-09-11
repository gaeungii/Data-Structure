package chap7;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree tree =  new BinaryTree();
		
		tree.root = tree.insertNode(tree.root, 50);
		tree.insertNode(tree.root, 30);
        tree.insertNode(tree.root, 20);
        tree.insertNode(tree.root, 40);
        tree.insertNode(tree.root, 70);
        tree.insertNode(tree.root, 60);
        tree.insertNode(tree.root, 80);
        
        System.out.print("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println();
        
        System.out.print("Preorder traversal:");
        tree.preorder(tree.root);
        System.out.println();
        
        System.out.print("Postorder traversal:");
        tree.postorder(tree.root);
        System.out.println();
        
        int key = 40;
        if (tree.searchNode(tree.root, key)) {
            System.out.println(key + " is found in the tree.");
        } else {
            System.out.println(key + " is not found in the tree.");
        }
        
        tree.deleteNode(tree.root, 20);
        System.out.println("Deleting");
        System.out.print("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println();
        
	}

}
