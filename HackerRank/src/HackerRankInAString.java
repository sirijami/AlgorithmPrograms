import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class HackerRankInAString {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();

	}
	
	 static String hackerrankInString(String s) {
	        String str = "hackerrank";
	   
	        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
	        for(int i = 0; i< str.length(); i++){
	            if(hm.containsKey(str.charAt(i))){
	                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
	            }else {
	                hm.put(str.charAt(i), 1);
	            }
	        }
	        System.out.print(hm);
	        LinkedHashMap<Character,Integer> hms = new LinkedHashMap<Character,Integer>();
	        for(int j = 0; j < s.length(); j++){
	            if(hms.containsKey(s.charAt(j))){
	                hms.put(s.charAt(j), hms.get(s.charAt(j)) + 1);
	            }else {
	                hms.put(s.charAt(j), 1);
	            }            
	        }
	        System.out.print(hms);
	        int pt = 0;
	        for(Map.Entry<Character,Integer> m : hm.entrySet()){
	        	if(hms.containsKey(m.getValue())){
	        		pt++;
	        		
	        	}

	        }	     
	        return "YES";
	    }


}
