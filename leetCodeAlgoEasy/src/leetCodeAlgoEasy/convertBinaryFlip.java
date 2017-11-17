package leetCodeAlgoEasy;

public class convertBinaryFlip {

	public static void main(String[] args) {
		int num = 0;
		System.out.println(swapbinaryNumbers(num));
	}
	public static int swapbinaryNumbers(int num){
		String binaryNum = Integer.toBinaryString(num);
		char[] ch = binaryNum.toCharArray();
		for(int i = 0; i < ch.length; i++){
			if(ch[i] == '0'){
				ch[i] = '1';
			}else {
				ch[i] = '0';
			}
		}
		
		String str = new String(ch);
	    Integer res = Integer.parseInt(str, 2);
		return res;
	}

}
