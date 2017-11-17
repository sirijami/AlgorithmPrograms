
public class reverseAString {

	public static void main(String[] args) {
		String str = "Program Structures and algorithm";
		System.out.println(reverseString(str)); 
	}
    //First Method: Reverse string in-place
	private static String reverseString(String str) {
		if(str == null){
			System.out.println("Null string");
			return null;
		}
		if(str.isEmpty()){
			System.out.println("Empty string");
			return null;
	    }
		if(str.length() <= 1){
			System.out.println(str);
			return str;			
		}		
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0 ; i < sb.length() /2 ; i++){
			char temp = sb.charAt(i);
			int EndIndex = sb.length() - i - 1;
			sb.setCharAt(i, sb.charAt(EndIndex));
			sb.setCharAt(EndIndex, temp);
		}
		String tempString = sb.toString();
		String[] words = tempString.split(" ");
		StringBuilder nsb = new StringBuilder();
		for(String word : words){
			nsb.append(new StringBuffer(word).reverse().toString() + " ");
		}
		String result = nsb.toString().trim();
		return result;
	}
	
	// Second Method: Swapping or 2 pointer Method
//	private static void reverseString(String str) {
//		if(str == null){
//			System.out.println("Null string");
//			return;
//		}
//		if(str.length() <= 1){
//			System.out.println(str);
//			return;
//		}
//		char[] string = str.toCharArray();
//		int start = 0;
//		int end = str.length()-1;
//		while(start < end){
//			char temp = string[start];
//			string[start] = string[end];
//			string[end] = temp;	
//			start++;
//			end--;
//		}
//		System.out.println(string);
//	}
	
    // Third Method: using string buffer and in build reverse function
	
//	private static void reverseString(String str) {
//		StringBuilder sb = new StringBuilder();
//		if(str == null){
//			System.out.println("Null string");
//			return;
//		}
//		if(str.isEmpty()){
//			System.out.println("Empty string");
//			return;
//		}
//		if(str.length() == 1){
//			System.out.println(str);
//			return;
//		}
//		sb = sb.append(str).reverse();
//		System.out.println(sb.toString());		
//	}

}
