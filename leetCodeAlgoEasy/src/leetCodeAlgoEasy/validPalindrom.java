package leetCodeAlgoEasy;

public class validPalindrom {

	public static void main(String[] args) {
		String str = "a.";
		System.out.println(isPalindrome(str));

	}
    public static boolean isPalindrome(String s) {
    	 if(s.isEmpty() || s.length() == 1){
     		return true;
     	}
     	String str = s.replaceAll("[^A-Za-z0-9]", "");
     	System.out.println(str);
     	char[] x = str.toLowerCase().toCharArray();

     	int start = 0;
     	int end = x.length-1;
     	
     	for(int i = 0 ; i < (x.length)/2; i++){
     		if(x[start] != x[end]){
     			return false;
     		}
     		start ++;
     		end --;
     	}
 		return true;
    }

}
