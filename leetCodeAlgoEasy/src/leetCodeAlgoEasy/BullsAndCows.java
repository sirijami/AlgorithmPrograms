package leetCodeAlgoEasy;

public class BullsAndCows {

	public static void main(String[] args) {
		String secret = "1123";
		String guess = "0111";
		getHint(secret,guess);
	}
    public static String getHint(String secret, String guess) {
    	int bull = 0; int cow = 0;
        int[] num = new int[10];
    	for(int i = 0 ; i < guess.length(); i++){
    		int s = Character.getNumericValue(secret.charAt(i));
    		System.out.println("s " + s);
    		int g = Character.getNumericValue(guess.charAt(i));
    		if(s == g){
    			bull ++;
    		}else{
    			if(num[s] < 0){
    				cow++;
    			}
    			if(num[g] > 0){
    				cow++;
    			}
    			num[s]++;
    			num[g]--;
    			System.out.println("nums[s] " + num[s]);
    			System.out.println("nums[g]" + num[g]);
    			
    		}
    	}
    	System.out.println("bull " + bull + " cow " +  cow);
        return bull + "A" + cow + "B";
    }

}
