package leetCodeAlgoEasy;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str = {"siri","iri", "avi"};
		longestCommonPrefix(str);

	}
    public static String longestCommonPrefix(String[] strs) {
    	StringBuilder sb = new StringBuilder();
    	if(strs != null && strs.length > 0){
    		Arrays.sort(strs);
    		printStringArray(strs);
    		char[] a = strs[0].toCharArray();
    		char[] b = strs[strs.length-1].toCharArray();
    		
    		for(int i = 0 ; i < a.length; i++){
    			if(b.length > i && b[i] == a[i]){
    				sb.append(b[i]);   				
    			}else {
    				System.out.println("sb " + sb.toString());
    				return sb.toString();
    			}
    		}
    	}
        System.out.println(sb.toString());
		return sb.toString();
        
    }
	private static void printStringArray(String[] strs) {
		for(int i = 0; i < strs.length;i++){
			System.out.print(strs[i] + " ");
		}
		System.out.println();
	}

}
