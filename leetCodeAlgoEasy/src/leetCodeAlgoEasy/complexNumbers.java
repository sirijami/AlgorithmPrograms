package leetCodeAlgoEasy;

public class complexNumbers {

	public static void main(String[] args) {
		String a = "1+1i";
		String b = "1+1i";
		System.out.println(complexNumberMultiply(a,b));

	}
    public static String complexNumberMultiply(String a, String b) {
    	String[] num1 = a.split("\\+");
        String[] num2 = b.split("\\+");
        int x1 = Integer.valueOf(num1[0]);
        System.out.println(x1);
        int y1 = Integer.valueOf(num1[1].substring(0, num1[1].length() - 1));
        System.out.println(y1);
        int x2 = Integer.valueOf(num2[0]);
        int y2 = Integer.valueOf(num2[1].substring(0, num2[1].length() - 1));
        return x1 * x2 - y1 * y2 + "+" + (x1 * y2 + x2 * y1) + "i";
    	
    }

}
