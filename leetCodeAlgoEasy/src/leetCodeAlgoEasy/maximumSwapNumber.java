//package leetCodeAlgoEasy;
//
//import java.util.Arrays;
//
//public class maximumSwapNumber {
//
//	public static void main(String[] args) {
//		int num = 2736;
//		System.out.println(maximumSwap(num));
//	}
//    public static int maximumSwap(int num) {
//    	int number = 0;
//    	char max = 0;
// 
//    	char[] digits = Integer.toString(num).toCharArray();
//    	
//    		for(int i = 0 ; i < digits.length ; i++){
//    			if(digits[i] > max){
//    				max = digits[i]; 				
//    			}  			
//    		}
//    		int intMax = Integer.parseInt(String.valueOf(max)); 
//    		for(int i = 0 ; i < digits.length; i++){
//    			if(intMax != digits[i]){
//    				
//    			}
//    		}
//		return Integer.parseInt(String.valueOf(digits)) ;
//      
//    }
//
//}
