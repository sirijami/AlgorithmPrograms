package leetCodeAlgoEasy;

import java.util.ArrayList;
import java.util.List;

public class NumberOfAnagramsInString {

	public static void main(String[] args) {
		String text = "sdhkdsbk";
		String pattern = "kd";
		findAnagrams(text, pattern);
		
	}
    public static List<Integer> findAnagrams(String s, String p) {
    	int[] chars = new int[26];
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	printArray(chars);
    	for(char c : p.toCharArray()){
    		chars[c-'a']++;
    	}
    	printArray(chars);
    	
    	int start = 0; int end = 0;
    	int pLength = p.length();
    	while (end < s.length()){
    		
    	}

    	
		return null;
       
       
    }
	private static void printArray(int[] sCount) {
		for(int i = 0; i < sCount.length; i++){
			System.out.print(sCount[i] + " ");
		}
		System.out.println();
		
	}
    
    
	

}
