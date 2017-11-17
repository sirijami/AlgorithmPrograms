import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class stringAnagram {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "abcd";
		boolean result = isAnagram(str1, str2);
		System.out.println(result);
	}

	private static boolean isAnagram(String str1, String str2) {

		HashMap<Character, Integer> hm1 = new HashMap<Character,Integer>();
		if(str1.length() != str2.length()){
			return false;
		}
		for(Character ch: str1.toCharArray() ){
			if(hm1.get(ch) == null){
				hm1.put(ch, 1);
			}else {
				hm1.put(ch, hm1.get(ch)+1);
			}
		}
		System.out.println(hm1);
		for(Character ch : str2.toCharArray()){
			if(hm1.get(ch) == null){
				return false;
			}else if(hm1.get(ch) == 1) {
				hm1.remove(ch);				
			} else {
				hm1.put(ch, hm1.get(ch) - 1);
			}
		}
		return hm1.isEmpty();
	}


}
