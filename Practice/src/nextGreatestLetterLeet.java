import java.util.ArrayList;


public class nextGreatestLetterLeet {

	public static void main(String[] args) {
		char[] lett = {'c','f', 'j'};
		char target= 'a';
		System.out.println(nextGreatestLetter(lett, target));

	}
	
	 public static char nextGreatestLetter(char[] letters, char target) {
		 for(int i = 0 ; i < letters.length ; i++){
			 
	         if(target == letters[letters.length-1] || target > letters[letters.length-1]){
	             return letters[0];
	         }
	         if (target < letters[i]) {
	             return letters[i];
	         }	 
		 }
		 return 0;
	 }
       
	    

}
