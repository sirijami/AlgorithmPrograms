package leetCodeAlgoEasy;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		String str = "au";
		lengthOfLongestSubstring(str);
	
	}
    public static int lengthOfLongestSubstring(String s) {
    	if(s.isEmpty()){
    		return 0;
    	}
    	if(s.length() == 1){
    		return 1;
    	}
    	int lenghtOfLongestSubstring = Integer.MIN_VALUE;
    	ArrayList<Character> al = new ArrayList<Character>();
    	for(int i = 0 ; i < s.length(); i++){
    		if(al.contains(s.charAt(i))){
    			if(lenghtOfLongestSubstring <= al.size()){
    				lenghtOfLongestSubstring = al.size();
    			}
				al.subList(0, i-1);
				al.add(s.charAt(i));
    		}else {
    			al.add(s.charAt(i));
    		}
    	}
    	if(al.size() > lenghtOfLongestSubstring){
    		System.out.println(al.size());
    		return al.size();
    	}
    	System.out.println(al);
    	System.out.println(lenghtOfLongestSubstring);
		return lenghtOfLongestSubstring;
        
    }

}
