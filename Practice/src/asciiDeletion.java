import java.util.HashMap;
import java.util.Map.Entry;


public class asciiDeletion {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2= "a";
		System.out.println("The ascii deletion: " + asciiDifference(s1, s2));
	}
	
	private static int asciiDifference(String a, String b){
		char[] ch1; char[] ch2;
		if(a.length() > b.length()){
			ch1 = a.toCharArray();
			ch2 = b.toCharArray();
		}else{
			ch1 = b.toCharArray();
			ch2 = a.toCharArray();
		}
	
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int count = 1; int temp = 0;
		for(int i = 0; i < ch1.length; i++){
			if(hm.containsKey(ch1[i])){
				hm.put(ch1[i], hm.get(ch1[i]) + 1);
			}else {
				hm.put(ch1[i], count);
			}
		}
//		System.out.println(hm);
		for(int i = 0; i < ch2.length; i++){
			if(hm.containsKey(ch2[i])){
				hm.put(ch2[i], hm.get(ch2[i]) - 1);
			}else {
				hm.put(ch2[i], count);
			}			
		}
//        System.out.println("2");
//		System.out.println(hm);
		
		for(Entry<Character, Integer> e : hm.entrySet()){		
			if(e.getValue() != 0){
				temp = (int) e.getKey() + temp;
				
			}
		}
		return temp;
	}

}
