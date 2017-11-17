package leetCodeAlgoEasy;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {
		String note = "a";
		String magazine = "b";
		System.out.println(canConstruct(note, magazine));
	}
    public static boolean canConstruct(String ransomNote, String magazine) {
    	if(ransomNote.isEmpty() && magazine.isEmpty()){
    		return true;
    	}
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();   	
    	for(int i = 0 ; i < magazine.length(); i++){
    		if(hm.containsKey(magazine.charAt(i))){
    			hm.put(magazine.charAt(i), hm.get(magazine.charAt(i)) + 1);
    		}else {
    			hm.put(magazine.charAt(i), 1);
    		}
    	}

    	for(int i = 0 ; i < ransomNote.length();i++ ){
    		if(hm.containsKey(ransomNote.charAt(i))){
    			if(hm.get(ransomNote.charAt(i)) != 0){
    				hm.put(ransomNote.charAt(i), hm.get(ransomNote.charAt(i)) -1);

    			}else {
    				return false;
    			}
    		}else {
    			return false;
    		}   		
    	}
        return true;
    }

}
