package leetCodeAlgoEasy;
 class TreeNode {
	int val;
    TreeNode left;
	TreeNode right;
	TreeNode(int x) { 
		val = x; 
	}
}
public class binaryTree {
	TreeNode root;
	public binaryTree() {
		root = null;
	}


	public static void main(String[] args) {
		binaryTree t1 = new binaryTree();
		t1.root = new TreeNode(1);
		t1.root.left = new TreeNode(3);
		t1.root.right = new TreeNode(2);
		t1.root.left.left = new TreeNode(5);
		
		binaryTree t2 = new binaryTree();
		t2.root = new TreeNode(2);
		t2.root.left = new TreeNode(1);
		t2.root.right = new TreeNode(3);
		t2.root.left.right = new TreeNode(4);
		t2.root.right.right = new TreeNode(7);
		System.out.println(mergeTrees(t1.root, t2.root));

	}
    public static TreeNode mergeTrees(TreeNode a, TreeNode b) {
    	if(a == null){
    		return b;
    	}
    	if(b == null){
    		return a;
    	}
    	a.val = a.val + b.val;
    	a.left = mergeTrees(a.left, b.left);
    	a.right = mergeTrees(a.right, b.right);
    	return a;
    }

}
