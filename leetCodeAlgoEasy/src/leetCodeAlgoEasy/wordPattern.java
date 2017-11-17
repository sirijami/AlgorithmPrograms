package leetCodeAlgoEasy;

import java.util.HashMap;

public class wordPattern {

	public static void main(String[] args) {
		String pattern = "abca";
		String str = "dog cat cat dog";
		System.out.println(wordPattern(pattern , str));

	}
    public static boolean wordPattern(String pattern, String str) {
    	String[] arr = str.split(" ");
        if(arr.length != pattern.length()){
            return false;
        }
    	printArray(arr);
    	HashMap<Character,String> hm = new HashMap<Character,String>();
    	for(int i = 0 ; i < arr.length; i++){
    		char c = pattern.charAt(i);
    		if(hm.containsKey(c)){
    			if(!hm.get(c).equals(arr[i])){
    				return false;
    			}   			
    		}else {
    			if(hm.containsValue(arr[i])){
    				return false;
    			}
    			hm.put(c, arr[i]);
    		}
    	} 	   	
		return true;   	
    }
	private static void printArray(String[] arr) {
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
}
