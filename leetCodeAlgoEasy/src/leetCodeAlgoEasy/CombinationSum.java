package leetCodeAlgoEasy;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {

	public static void main(String[] args) {
		int[] arr1 = {2,3,6,7};
		int target = 7;
		combinationSum(arr1, target);

	}
	public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> innerlist = new ArrayList<Integer>();
       
        int currentSum = 0;        
        for(int i = 0; i < candidates.length; i++){
            if(target == candidates[i]){
                innerlist.add(target);
                result.add(innerlist);
            }
        }
        
        for(int i = 0; i < candidates.length; i++){
        	
        }
        System.out.println(result);
        return result;
    }

}
