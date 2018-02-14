import java.util.Scanner;


public class MakingAnagrams {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
	
	}

	private static int makingAnagrams(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		for(int i = 0; i < c1.length; i++){
			for(int j = 0; j < c2.length; j++){
				if(c1[i] == c2[j]){
					c1[i] = '0';
					c2[j] = '0';
				}
			}
		}
	   int count = 0;
       for(int i = 0; i < c1.length; i++){
    	   if(c1[i] != '0'){
    		   count++;
    	   }
       }
       for(int i = 0; i < c2.length; i++){
    	   if(c2[i] != '0'){
    		   count++;
    	   }
       }
        System.out.println(count);
		return count;
	}
	
//   static int makingAnagrams(String s1, String s2){
//        // Complete this function
//        int cArr[]=new int[26];
//        for(int i=0;i<s1.length();i++){
//        	System.out.println(s1.charAt(i)-97);
//            cArr[s1.charAt(i)-97]++;
//        }
//        for(int i=0;i<s2.length();i++){
//            cArr[s2.charAt(i)-97]--;
//        }
//        int count=0;
//        for(int i=0;i<26;i++){
//            count+=Math.abs(cArr[i]);
//        }
//        System.out.println(count);
//        return count;
//    }

}
