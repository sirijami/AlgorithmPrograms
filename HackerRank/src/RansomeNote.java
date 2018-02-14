import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class RansomeNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
	private String magazine;
	private String note;

	public RansomeNote(String magazine, String note) {
		this.magazine = magazine;
		this.note = note;
	}
	
	private boolean solve() {
		String[] s1 = magazine.split(" ");
		String[] s2 = note.split(" ");
		
        magazineMap = new HashMap<String,Integer>();
        for(int i = 0; i < s1.length; i++){
            if(magazineMap.containsKey(s1[i])){
                magazineMap.put(s1[i], magazineMap.get(s1[i])+ 1);
            }else {
                magazineMap.put(s1[i], 1);
            }
        } 
        System.out.println("magazine map " + magazineMap);
        for(int j = 0; j < s2.length; j++){
        	if(magazineMap.containsKey(s2[j]) && magazineMap.get(s2[j]) > 0){
        		magazineMap.put(s2[j], magazineMap.get(s2[j]) - 1);
        	}else{
        		return false;
        	}
        }
		return true;
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomeNote s = new RansomeNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

	}



}
