class TNode{
    int data;
    TNode left;
    TNode right;
    TNode(int data){
        this.data = data;
    }

}
public class FindIfSubTreeMirrorExistsInTree {
	
	private boolean FindIfSubTreeMirrorExistsInTree(TNode root1, TNode root2){
		root2 = getMirror(root2);
		return isSubtree(root1, root2);
		
	}
	private TNode getMirror(TNode root2) {
		if(root2 == null){
			return null;
		}
		TNode temp = getMirror(root2.left);
		root2.left = getMirror(root2.right);
		root2.right = temp;
		
		return root2;
	}
	
	public boolean isSubtree(TNode root1, TNode root2) {
		if(root2 == null){
			return true;
		}
		if(root1 == null){
			return false;
		}
		
		if(root1.data == root2.data){
			return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
		}
		return isSubtree(root1.left, root2.left) || isSubtree(root1.right, root2.right);

	}

	
	

	public static void main(String[] args) {
		
		/* Tree 1
		     2
		   /   \
		  4     7
		 / \   / \
		8   9 11 12
		 
	    */
		
        TNode root1 = new TNode(2);
        root1.left = new TNode(4);
        root1.left.left = new TNode(8);
        root1.left.right = new TNode(9);
        root1.right = new TNode(7);
        root1.right.left = new TNode(11);
        root1.right.right = new TNode(12);
        
        // creating tree 2
        /*
                    7
                   / \
                  12  11
         */
        TNode root2 = new TNode(3);
        root2.left = new TNode(7);
        root2.right = new TNode(6);
        FindIfSubTreeMirrorExistsInTree t = new FindIfSubTreeMirrorExistsInTree();
        System.out.println(t.FindIfSubTreeMirrorExistsInTree(root1, root2));


	}


}
