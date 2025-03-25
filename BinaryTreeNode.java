public class BinaryTreeNode {
	Student data; // holds the student information
	BinaryTreeNode left; // acts as the pointer to the left child of this node
	BinaryTreeNode right; // acts as the pointer to the right child of this node
	BinaryTreeNode parent; // pointer to the parent of this node
	int depth; // depth of this node
	
	public BinaryTreeNode(Student data) { // constructor for the new node
		this.data = data; // having this as the only line ensures the left and right values will be null by default
	}
}
