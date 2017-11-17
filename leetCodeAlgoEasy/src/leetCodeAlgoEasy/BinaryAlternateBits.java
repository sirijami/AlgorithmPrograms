package leetCodeAlgoEasy;

import java.lang.annotation.Retention;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BinaryAlternateBits {

	public static void main(String[] args) {
		int num = 11;
		System.out.println(hasAlternatingBits(num));
		System.out.println(hammingWeight(num));
	}
	
    public static boolean hasAlternatingBits(int n) {
    	String str = Integer.toBinaryString(n);
    	System.out.println(str);
    	char[] ch = str.toCharArray();
    	for(int i =0; i < ch.length-1 ; i++){
    		if(ch[i] == ch[i+1]){
    			return false;
    		}    	
        }
    	return true;
    }
    
    public static int hammingWeight(int n) {
    	String str = Integer.toBinaryString(n);
    	char[] ch = str.toCharArray();
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    	for(int i = 0 ; i < ch.length; i++){
    		if(hm.containsKey(ch[i])){
    			hm.put(ch[i], (int) hm.get(ch[i]) + 1);
    		}else {
    			hm.put(ch[i], 1);
    		}
    	}
    	System.out.println(hm);
    	for(Map.Entry<Character, Integer> m : hm.entrySet()){
    		if(m.getKey() == '1'){
    			return m.getValue();
    		}
    	}
		return 0;
        
    }

}
