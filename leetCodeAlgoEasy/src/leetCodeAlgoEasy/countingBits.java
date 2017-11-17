package leetCodeAlgoEasy;

public class countingBits {

	public static void main(String[] args) {
		int number = 2;
		countBits(number);

	}
    private static void printArray(int[] array) {
		for(int i = 0 ; i < array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();		
	}
    
	public static int[] countBits(int num) {
    	int[] res = new int[num+1];
    	for(int i = 0 ; i <= num ; i++){
    		 res[i] = res[i/2] + i % 2; 
    		 System.out.println(res[i/2]);
    		 System.out.println(i % 2);
    	}
		printArray(res);
    	return res;
        
    }

}
