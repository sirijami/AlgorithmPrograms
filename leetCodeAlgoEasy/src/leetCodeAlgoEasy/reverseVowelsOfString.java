package leetCodeAlgoEasy;

import java.util.ArrayList;

public class reverseVowelsOfString {

	public static void main(String[] args) {
		String str = "leetcode";
		System.out.println(reverseVowels(str));

	}
	 public static String reverseVowels(String s) {
		 ArrayList<String> al = new ArrayList<String>();
		 al.add("a");
		 al.add("e");
		 al.add("i");
		 al.add("o");
		 al.add("u");
		 al.add("A");
		 al.add("E");
		 al.add("I");
		 al.add("O");
		 al.add("U");
		 

		 char[] arr = s.toCharArray();
		
		 int start = 0;
		 int end = arr.length-1;
		 while(start < end){

			 while(start < end && !al.contains(arr[start] + "")){
				 start++;
			 }
			 while( start < end && !al.contains(arr[end] + "")){
				 end--;
			 }
			 
			 char temp = arr[start];
			 arr[start] = arr[end];
			 arr[end] = temp; 
			 end --;
			 start++;				 
		 }
		return new String(arr) ;

	        
	        
	}

}
