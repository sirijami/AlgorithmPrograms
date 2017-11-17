class Nodes {
	    int data;
	    Nodes left, right;
	 
	    public Nodes(int value) {
	        data = value;
	        left = right = null;
	    }
	}
public class Tree {
	
	Nodes root;
	
	public Tree(){
		root = null;
	}

	public static void main(String[] args) {
		Tree t = new Tree();
		t.root = new Nodes(2);
        t.root.left = new Nodes(5);
        t.root.right = new Nodes(3);
        t.root.left.left = new Nodes(4);
        t.root.left.right = new Nodes(5);
        t.root.right.left = new Nodes(6);
        t.root.right.right = new Nodes(7);
        t.printNodesKLevel(t.root, 2);
	}
	
	public void printNodesKLevel(Nodes node, int k){
		if(node == null){
			return;
		}
		if(k == 0){
			System.out.println(node.data);
		}else {
			printNodesKLevel(node.left, k-1);
			printNodesKLevel(node.right, k-1);
		}
		
		
	}

}
