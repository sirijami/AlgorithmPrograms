/* 0110 1101*/
public class BitManipulation {

	public static void main(String[] args) {
		System.out.println(isBitSet(2, 2));
		System.out.println(numOFBitsToSwap(1000, 1001));

	}
	private static boolean isBitSet(int num, int pos){
		int mask = 1 << pos;
		if((mask & num) == 0){
			return false;
		}
		return true;		
	}
	private static int setBitPos(int num, int pos){
		int mask = 1 << pos;
		return mask | num;		
	}
	
	private static int clearBit(int num, int pos){
		int mask = 1 << pos;
		mask = ~mask;
		return (mask & num);	
	}
	
	/* from MSB till pos if we want to set to zero and other to be one */
	/* sol : shift it pos + 1 (1000) and then substract 1 and do a & */
	
	private static int clearFromMsbToPos(int num, int pos){
		int mask = 1 << (pos + 1);
		mask = mask -1;
		return (num & mask);
	}
	
	private static int clearPosToLsb(int num, int pos){
		int mask = 1 << (pos + 1);
		mask = mask -1;
		mask = ~mask;
		return (num & mask);
	}
	
	/* num -1  then do num & num-1 */
	private static int clearFirstOneFromLSB(int num , int pos){
		num = num -1;
		return (num & num -1);
	
	}
	/* Key points: if num & num-1 is equal to zero that means either the num is zero or num is 2^n */
	private static boolean isPowOfTwo(int num){
		if(num == 0){
			return false;
		}		
		if((num & (num-1)) == 0){
			return true;
		}
		return false;
	}
	
	/* Count total number of set bits (1's)
	 * while (num > 0) then num = num & (num-1) then count++ */
	private static int countSetBits(int num){
		int count = 0;
		while (num > 0){
			num = (num & (num -1));
			count++;
		}
		return count;
	}
	/* how many bits to swap to convert from one num to another 
	 * xor them and count how many sets (1's are there)*/
	private static int numOFBitsToSwap(int num1, int num2){
		int count = 0;
		int num = (num1 ^ num2);
		while (num > 0){
			num = (num & (num -1));
			count++;
		}
		return count;
	}
	/* Bit is palindrome or not */
	private static boolean isPalindrom(int num){
		return (num == reverseNum(num));
	}
	private static int reverseNum(int num) {
		int res = 0;
		while(num > 0){
			res = (res << 1 | ( num & 1));
			num = (num >>1);			
		}
		return res;
	}
	/* Swap even pos and odd pos number */
	private static int swapEvenPosWithOdd(int num){
		int maskOfEven = 0x55555555;
		int maskOfOdd = 0xAAAAAAAA ;
		
		maskOfEven = (num & maskOfEven);
		maskOfEven  = maskOfEven << 1;
		
		maskOfOdd = (num & maskOfOdd);
		maskOfOdd = maskOfOdd >> 1;
		
		return maskOfEven | maskOfOdd;		
	}
	private static int replaceBitsWithNum(int num, int replace, int i, int j){
		// i > j
		int rightMask = (1 << (j+1)) -1 ;
		int leftMask = (1 >> (i+1)) -1 ;
		
		 leftMask = ~leftMask;
		 /*Incomplete */
		 return 0;
	}
	
	
	
	
	
	

}
