package leetCodeAlgoEasy;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "ab";
		String t = "aa";
		System.out.println(isIsomorphic(s, t));

	}
    public static boolean isIsomorphic(String s, String t) {
    	if(s.length() != t.length()){
    		return false;
    	}
    	HashMap<Character, Character> hm = new HashMap<Character, Character>();
    	for(int i = 0 ; i < s.length(); i++){
    		char ch = t.charAt(i);
        	if(hm.containsKey(s.charAt(i))){
        		if(hm.get(s.charAt(i)) != ch){
        			return false;
        		}     		
        	}else {
        		if(hm.containsValue(ch)){
        			return false;
        		}
        		hm.put(s.charAt(i), ch);
        	}   		
    	} 
    	System.out.println(hm);
    	return true;
        
    }

}
