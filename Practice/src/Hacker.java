import java.io.StreamCorruptedException;
import java.util.Scanner;


public class Hacker {

	public static void main(String[] args) {
		String[] res = new String[]{};
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int s = in.nextInt();

	        for(int a0 = 0; a0 < s; a0++){
	            int l = in.nextInt();
	            int r = in.nextInt();
	            int dif= 0;
	            int extraleft = l-1;
	            int extraRight = r +1;
	            int sweetness = 0;
	            if(l != r){
	            	dif = r -l;	            	
	            }
	            if( (extraleft != l  && extraRight != r) && (extraleft > 0 && extraRight < r)){
	            	for(int i = l ; i < r; i++){
	            		sweetness = i + sweetness;
	            	}
	            	sweetness = sweetness + l + r;
	            }
	            System.out.println(sweetness);
	        }
	        in.close();

	}

}
