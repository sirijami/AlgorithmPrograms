package leetCodeAlgoEasy;

public class recordCheckingForAttendance {
	public static void main(String[] args) {
		String details = "AA";
		System.out.println(checkRecord(details));
		
		
	}
    public static boolean checkRecord(String s) {
    	int counter = 0;    	
    	for(int i = 0; i < s.length(); i++){   		
    		if(s.charAt(i) == 'A'){
    			counter++;
    		}
    	}   	
    	
    	if(s.length() <= 2){
    		if(s.equals("AA")){
    			return false;
    		}
    	}
    	
    	for(int i = 0 ; i < s.length() -2; i++){
    		String subs = s.substring(i, i+3);   		
			if(counter > 1 || subs.equals("LLL")){
				return false;			
			}	
    	}
		return true;        
    }

}
