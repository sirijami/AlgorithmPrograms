package leetCodeAlgoEasy;

public class RotataeArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int k = 4;
		rotate(arr, k);
	}
    public static void rotate(int[] nums, int k) {
        int numsLength = nums.length;
        if(k == 0 ){
            return;
        }
        if(numsLength == k ){
            return;
        }
        if(numsLength == 1 && numsLength < k){
            return;
        }
        int p = Math.abs(numsLength - k);
        int s = 0;
        if(numsLength == 2){
            int m = 0;
            int n = 1;
        	for(int i = 0 ; i < k; i++){
        		int temp = nums[m];
        		nums[m] = nums[n];
        		nums[n] = temp;               
        	}
        	printArray(nums);
        }
        
        if(numsLength > 2){
            while (p < numsLength){
                int temp = nums[p];
                nums[p] = nums[s];
                nums[s] = temp;
                
                 printArray(nums);
                 int temp2 = nums[p];
                 nums[p] = nums[p-1];
                 nums[p-1] = temp2;
                 printArray(nums);
                 p++;
                 s++;       	
             }       	
        }
    }
	private static void printArray(int[] nums) {
		for(int i = 0; i < nums.length ; i++){
			System.out.print(nums[i] + " ");
		}
		System.out.println();		
	}

}
