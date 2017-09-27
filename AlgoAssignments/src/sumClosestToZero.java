import java.util.Arrays;
public class sumClosestToZero {

	public static void main(String[] args) {
		int[] arr = {2,1,92,478,3,56};	
		sumPair(arr);
	}

	private static void sumPair(int[] arr) {
		int sum, min = 99999;
		int left = 1, right = arr.length-1;
		if(arr.length < 2){
			System.out.println("Not a valid input");
			return;
		}
		Arrays.sort(arr);
		int i = 0;
		int r = arr.length -1;
		while(i < r){
			sum = arr[i] + arr[r];
			if(Math.abs(sum) < Math.abs(min)){
				min = sum;
				left = i;
				right  = r;
			}
			if(sum < 0){
				i++;
			}else {
				r--;
			}
		}
		System.out.println("The sum of pairs closest to zero are " + arr[left]+ " and " + arr[right]);
	}

}
