package leetCodeAlgoEasy;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
class MapValues{
	private int count, index;
	
	public MapValues(int index){
		this.index = index;
		this.count = 1;
	}
	
	public int getIndex(){
		return index;
	}
	public int getCount(){
		return count;
	}
	public void setIndex(int index){
		this.index = index;
	}
	public void setCount(int count){
		this.count = count;
	}
	public String toString(){
		return ("count " + getCount() + " Index " + getIndex());
	}
	
}
public class UniqChar {

	public static void main(String[] args) {
		String str = "ll";
		System.out.println(nonRepeated(str));
	}
	
	public static String nonRepeated(String s) {
		//Check for null string
		  if(s == null){
			  return null;
		  }
         String result = Character.toString(firstUniqChar(s));
         return result;
	  }
    public static char firstUniqChar(String s) {
    	// Check for single char in the String
    	if(s.length() == 1 ){
    		return s.charAt(0);
    	}
    	char[] ch = s.toCharArray();
    	
    	//Used Linked HashMap to keep track of the order of character in the string
    	LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
    	for(int i = 0 ; i < ch.length; i++){
    		if(hm.containsKey(ch[i])){
    			hm.put(ch[i], hm.get(ch[i])+1);
    		}else {
    			hm.put(ch[i], 1);
    		}
    	}
    	
    	//Fetches the first uniq character from the Linked hashMap
    	for(Map.Entry entry : hm.entrySet() ){
    		if((int) entry.getValue() == 1 ){
    			return (char) entry.getKey() ;
    		}
    	}
    	
    	//Need to return nothing when there are no unique char
		return  0;   	  	
    }

//	private static int firstUniqChar(String str) {
//		if(str == null){
//			return -1;
//		}
//		char[] ch = str.toCharArray();
//		LinkedHashMap<Character, CountIndex> hm = new LinkedHashMap<Character, CountIndex>();
//		
//		for(int i = 0; i < ch.length; i++){
//			if(hm.containsKey(ch[i])){
//				CountIndex ci = hm.get(ch[i]);
//				int countVal = ci.getCount();
//				countVal++;
//				ci.setCount(countVal);
//				hm.put(ch[i], ci);
//			}else{
//				CountIndex ci = new CountIndex(i);
//				hm.put(ch[i], ci );
//			}
//		}
//		System.out.println(hm.toString());
//		for(Map.Entry<Character, CountIndex> m: hm.entrySet()){
//			if( m.getValue().getCount() == 1){
//				return m.getValue().getIndex();
//			}
//			System.out.println(m);
//		}
//		return -1;
//	}
// 
}
