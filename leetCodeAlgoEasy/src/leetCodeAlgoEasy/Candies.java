package leetCodeAlgoEasy;

import java.util.HashMap;
import java.util.Map;

public class Candies {

	public static void main(String[] args) {
		int[] arr = {1,1,1,1,2,2,2,3,3,3};
		System.out.println(distributeCandies(arr));

	}
	public static int distributeCandies(int[] candies) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0;
        for(int i = 0 ; i < candies.length ; i++){
            if(hm.containsKey(candies[i])){
                hm.put(candies[i], hm.get(candies[i]) + 1);
            }else {
                hm.put(candies[i], 1);
            }
        }
        for(Map.Entry m : hm.entrySet()){
            sum = sum + (int)m.getValue();
        }
        System.out.println("sum "+ sum);
        int res = sum /2;
        return res;
    }

}
