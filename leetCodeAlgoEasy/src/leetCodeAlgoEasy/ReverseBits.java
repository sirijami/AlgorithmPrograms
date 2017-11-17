package leetCodeAlgoEasy;

public class ReverseBits {

	public static void main(String[] args) {
		int num = 429497295;
		System.out.println(reverseBits(num));

	}
	 public static int reverseBits(int n) {
		    long x = Integer.toUnsignedLong(n);
	        String binaryNum = Integer.toBinaryString(n);
	        System.out.println(binaryNum);
			char[] ch = binaryNum.toCharArray();
	        int j = ch.length-1;      
			for(int i = 0; i < j; i++){
	            char temp = ch[i];
	            ch[i] = ch[j];
	            ch[j] = temp;
	            j--;
			}
			System.out.println(ch);
			String str = new String(ch);
		    Integer res = Integer.parseInt(str, 2);
			return res;
	        
	  }

}
