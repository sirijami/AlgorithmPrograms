public class BinaryTree {
	Node root;

	public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        System.out.println(tree.AreAllLeavesSameLevel());
    }
	
	public void PrintAtLevel(Node node, int level){
		PrintAtLevelR(root, 1);
	}
	
	void PrintAtLevelR(Node node, int level){
		if(node == null){
			return;
		}
		if(level == 1){
			System.out.println(node.data + " ");
		}else {
			PrintAtLevelR(node.left, level-1);
			PrintAtLevelR(node.right, level+1);
		}		
	}
	
	public boolean AreAllLeavesSameLevel(){
		int maxLevel = 0;
		return AreAllLeavesSameLevelR(root, maxLevel, 1);
	}
	//Giving wrong output ref 
	public boolean AreAllLeavesSameLevelR( Node node, int maxLevel, int level) {
		if(node == null){
			return false;
		}
		if(node.left == null && node.right == null){
			maxLevel = level;
		}else {
			if(level != maxLevel){
				return false;
			}else {
				return true;
			}
		}
		return AreAllLeavesSameLevelR(node.left, maxLevel, level + 1) && AreAllLeavesSameLevelR(node.right, maxLevel, level+1);		
	}
	
//	public void getMaxLeafSum(){
//		int maxSum = 0;
//		Node leafNode = null;
//		getMaxLeafSumR(root, ref maxSum, );
//	}
//	
//	public void getMaxLeafSumR(Node node,  ref int maxSum, int currSum, ref Node leafNode){
//		if(node == null){
//			return;
//		}
//		currSum += node.data;
//		if(node.left == null ** node.right == null){
//			if(currSum > maxSum){
//				maxSum = currSum;
//				leafNode = node;
//			}
//		}
//		getMaxLeafSumR(node.left , ref maxSum, currSum, ref leafNode);
//		getMaxLeafSumR(node.right, ref maxSum, currSum, ref leafNode;		
//	}
//	boolean printPath(Node node, Node target){
//		
//	}

	

}
