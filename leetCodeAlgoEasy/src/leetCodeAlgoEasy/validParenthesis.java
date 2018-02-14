package leetCodeAlgoEasy;

public class validParenthesis {

	public static void main(String[] args) {
		String s = "()";
		System.out.println(isValid(s));
	}
	
	 public static boolean isValid(String s) {
	        if(s.length() == 1){
	            return true;
	        }
	        
	        for(int i = 0 ; i < s.length(); ){
	            char temp = s.charAt(i);
	            System.out.println("tfw " + temp);
	            System.out.println("hsabjd" + s.charAt(i+1));
	            if(temp == s.charAt(i+1)){
	            	System.out.println("hi there");
	                i++;
	            }else {
	                return false;
	            }
	        }
	        return true;
	    }

}
