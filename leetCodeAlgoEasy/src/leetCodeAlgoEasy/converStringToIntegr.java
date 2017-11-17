package leetCodeAlgoEasy;

public class converStringToIntegr {

	public static void main(String[] args) {
		String str = "";
		int result = myAtoi(str);
		System.out.println(result);
		

	}
	
    public static int myAtoi(String str) {
        if(str.length() == 0){
            return 0;
        }
    	int x = Integer.parseInt(str);
		return x;
        
    }

}
