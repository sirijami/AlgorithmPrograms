import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class AverageOfLevelsInBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode (3);
		root.left = new TreeNode (9);
		root.right = new TreeNode (20);
		root.right.left = new TreeNode (15);
		root.right.right = new TreeNode (7);
		averageOfLevels(root);
		
	}
	
	 public static List<Double> averageOfLevels(TreeNode  root) {
		 ArrayList<Double> result = new ArrayList<Double>();
		 Queue<TreeNode> q = new LinkedList<TreeNode>();
		    
		    if(root == null) return result;
		    q.add(root);
		    
		    while(!q.isEmpty()) {
		        int n = q.size();
		        double sum = 0.0;
		        for(int i = 0; i < n; i++) {
		            TreeNode node = q.poll();
		            sum += node.val;
		            if(node.left != null){
		            	q.add(node.left);
		            }
		            if(node.right != null){
		            	q.add(node.right);
		            }
		        }

		        result.add(sum / n);
		    }
		    System.out.println(result);
		    return result;
	        
	    }

}
