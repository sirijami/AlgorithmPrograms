package leetCodeAlgoEasy;

import javax.sound.sampled.ReverbType;

public class revWrd {

	public static void main(String[] args) {
		String input = "Let's take LeetCode contest";
		String output = reverseWords(input);
		System.out.println(output);
	}

	public static String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String word : words){
			sb.append(new StringBuffer(word).reverse().toString() + " ");
		}
		return sb.toString().trim();		
    }

}

//Another approach 
//String[] words = s.split(" ");
//String reverseString = "";
//
//for(int i = 0 ; i< words.length ; i++){
//	String word = words[i];
//	String reverseWord = "";
//	for(int j = word.length()-1 ; j >= 0 ; j--){
//		reverseWord = reverseWord + word.charAt(j);				
//	}
//   
//	reverseString = reverseString  + reverseWord + " ";
//}
//
//
//return reverseString.trim();
