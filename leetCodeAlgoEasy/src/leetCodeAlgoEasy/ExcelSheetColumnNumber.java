package leetCodeAlgoEasy;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		String s = "AB";
		System.out.println(titleToNumber(s));
	}
	
    public static int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length();i++){
            result = result * 26 + (s.charAt(i) - 'A' + 1);
            System.out.println(result);
        }
        return result;
        
    }
	

}
