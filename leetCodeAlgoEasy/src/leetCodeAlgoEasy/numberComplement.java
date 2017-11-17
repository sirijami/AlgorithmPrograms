package leetCodeAlgoEasy;

public class numberComplement {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(findComplement(num));

	}
	public static int findComplement(int num) {
		String b = Integer.toBinaryString(num);
		char[] x = b.toCharArray();
		for(int i = 0 ; i < x.length; i++){
			if( x[i] == '1'){
				x[i]  = '0';
			}else {
				x[i] = '1';
			}
		}
		String res =  new String(x);
	    return Integer.parseInt(res, 2);
        
    }

}
