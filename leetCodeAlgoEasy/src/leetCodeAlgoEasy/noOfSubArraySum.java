package leetCodeAlgoEasy;

public class noOfSubArraySum {

	public static void main(String[] args) {
		int[] arr = {-1,-1,1};
		System.out.println(subarraySum(arr, 2));
		
	}
    public static int subarraySum(int[] nums, int k) {
    	int sumSoFar = 0;
    	int count = 0;
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] > k){
    			sumSoFar = 0;
    		}else {
    			sumSoFar = sumSoFar + nums[i];
    			System.out.println("sum so far " + sumSoFar);
    		}
    		if (sumSoFar == k ){
    			count ++;
    			sumSoFar = nums[i];
    			System.out.println("count" + count);
    		}
    	}
		return count;
        
    }

}
