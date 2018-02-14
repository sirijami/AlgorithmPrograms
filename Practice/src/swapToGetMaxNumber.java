
public class swapToGetMaxNumber {

	public static void main(String[] args) {
		int n = 7437;
		maximumSwap(n);
	}
	
	 public static int maximumSwap(int num) {
	        
	        char[] chNum = Integer.toString(num).toCharArray();
	        System.out.println(chNum);
	        
	        /*Find the max value from the array */
	        int maxVal = Integer.MIN_VALUE;
	        int maxValIndex = 0;
	        int maxValFromM = Integer.MIN_VALUE;
	        int maxValFromMIndex = 0;

	        for(int i = 0; i < chNum.length; i++){
	            if(chNum[i] > maxVal){
	                maxVal = chNum[i];
	                maxValIndex = i;
	            }          
	        }        
	        System.out.println("Max Value: " + (char) maxVal);
	        System.out.println(maxValIndex);
	        
	        for(int i = 0; i < chNum.length ; ){
	        	if(chNum[i] == (char) maxVal){
	        		i++;
	        	}else if(chNum[i] != (char) maxVal  && i < maxValIndex){
	        		/* swap with the max value */
	        		char temp = chNum[i];
	        		chNum[i] = chNum[maxValIndex];
	        		chNum[maxValIndex] = temp;
	        		break;
	        	}else {
	        		/* find the largest value from remaining list and swap */
	        		for(int m = i; m < chNum.length ; m++){
	        			System.out.println("m val" + chNum[m]);
	        			if(chNum[m] > maxValFromM){
	        				maxValFromM = chNum[m];
	        				maxValFromMIndex = m;
	        			}
	        		}
	        		System.out.println("Max val from m " + (char) maxValFromM);
	        		System.out.println("max val index" + maxValFromMIndex);
	        		System.out.println(chNum[i]);
	        		if(chNum[i] != (char) maxValFromM){
	        			char temp = chNum[i];
		        		chNum[i] = chNum[maxValFromMIndex];
		        		chNum[maxValFromMIndex] = temp;
		        	}
	        	}
        		maxValFromM = Integer.MIN_VALUE;
        		maxValFromMIndex = 0;
	        	i++;
	        }
            printArray(chNum);
         
	        return 0;
	       	        
	    }

	private static void printArray(char[] chNum) {
		for(int i = 0; i < chNum.length; i++){
			System.out.print(chNum[i] + " ");
		}
		System.out.println();
	}

}
