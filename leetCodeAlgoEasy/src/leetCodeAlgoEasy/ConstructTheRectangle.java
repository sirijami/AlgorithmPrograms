package leetCodeAlgoEasy;

public class ConstructTheRectangle {

	public static void main(String[] args) {
		int target = 1;
		System.out.println(4%2);
		constructRectangle(target);

	}
    public static int[] constructRectangle(int area) {
    	int minDif = Integer.MAX_VALUE;
    	int[] res = new int[2];
    	for(int l = 1 ; l <= area; l++){
    		int w = area/ l;
    		if((l*w) == area && l >= w){
  			      int dif = l-w;
  			      if(dif < minDif){
  			    	  minDif = dif;
  			    	  res[0] = l;
  			    	  res[1] = w;
  			      }
    		}
    	}
    	printArray(res);
		return res;
        
    }
	private static void printArray(int[] res) {
		for(int i = 0 ; i < res.length; i++){
			System.out.println(res[i] + " ");
		}
		System.out.println();		
	}

}
