package leetCodeAlgoEasy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReducedStringLeetCode {

	public static void main(String[] args) {
		String s = "hjagjgakf";
		reducedString(s);
	}

	private static void reducedString(String s) {
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }else {
                hm.put(s.charAt(i), count);
            }
        }
        System.out.println(hm);		
	}

}
