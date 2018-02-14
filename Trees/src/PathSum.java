
public class PathSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		hasPathSum(root, 3);

	}
	 public static boolean hasPathSum(TreeNode root, int sum) {
	        int res = 0;
	        if(root == null){
	            return false;
	        }
	        res = res + root.val;
        	System.out.println("res " + res);
	        if(root.left == null && root.right == null){
	            if(res == sum){
	                return true;
	            }
	        }else {	         
	            hasPathSum(root.left, sum);
	            hasPathSum(root.right, sum);
	        }
	        return false;
	    }

}
