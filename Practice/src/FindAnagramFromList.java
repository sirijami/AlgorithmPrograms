import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class FindAnagramFromList {

	public static void main(String[] args) {
		String[] list = {"tea", "ate", "eat", "apple", "java", "vaja", "cut", "utc"};
		String[] result = findAnagramList(list);
		printArray(result);
	}
	private static void printArray(String[] result) {
		for(int i =0; i< result.length; i++){
			System.out.print( result[i] + " ");
		}
		System.out.println();
	}
	
	public static String[] findAnagramList(String[] str){
		Set<String> output = new TreeSet<String>();
		for(int i = 0; i < str.length; i++){
			Set<String> allAnagrams = findAllAnagarms("", str[i]);
			String currentString = str[i];
			for(int j = i+1; j < str.length; j++){
				if(allAnagrams.contains(str[j])){
					output.add(str[j]);
					output.add(currentString);
				}				
			}
		}
		System.out.println(output);
		String[] s = output.toArray(new String [output.size()]);
		return s;
		
	}

	
	public static Set<String> findAllAnagarms(String prefix, String s1){
		Set<String> set = new TreeSet<String>();
		if(s1.length() == 0){
			set.add(prefix);
			return set;
		}

		for(int i = 0; i < s1.length(); i++){
			set.addAll(findAllAnagarms(prefix + s1.charAt(i), s1.substring(0, i) + s1.substring(i+1)));
		}
		return set;	
	
	}

}
