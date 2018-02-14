package leetCodeAlgoEasy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleLeetCode {

	public static void main(String[] args) {
	int n = 5;
	generate(n);
	}
    public static List<List<Integer>> generate(int numRows) {
    	ArrayList<List<Integer>> outputAl = new ArrayList<List<Integer>>();
    	ArrayList<Integer> innerAl = new ArrayList<Integer>();
    	
    	for(int i = 0; i < numRows ; i++){
    		innerAl.add( 0, 1);
    		for(int j = 1 ; j < innerAl.size() -1; j++){
    			innerAl.set(j, innerAl.get(j) + innerAl.get(j + 1));  			
    		}
			outputAl.add(new ArrayList<Integer>(innerAl));
    	}   	
    	return outputAl;
        
    }

}
