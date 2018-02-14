
public class Practice {

	public static void main(String[] args) {
		String s = "ajbdj";
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1; i >= 0; i--){
			sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
		
        String[] sA = s.split("");
        String s1 = "cde";
        String s2 = "abc";

        StringBuilder sb1 = new StringBuilder(s1);

        StringBuilder sb2 = new StringBuilder(s2);
       for(int i = 0; i < s1.length(); i++){

       }

	}

}
