//Assuming the array contains negative and positive numbers
public class kadaneFindIndexes {

	public static void main(String[] args) {
		int[] arr =  {4,3,6,8};
		IndexesOfMaxSubSeqSum(arr);
	}

	private static void IndexesOfMaxSubSeqSum(int[] arr) {
		if(arr.length < 1){
			System.out.println("Empty array");
			return;
		}
		if( arr.length == 1){
			System.out.println("Max so far is " + arr[arr.length-1]);
			return;
		}
		int maxSoFar = Integer.MIN_VALUE;
		int sum = 0;
		int start = 0 , end = 0, s= 0;
		for(int i=0; i < arr.length; i++){
			sum = sum + arr[i];
			if(maxSoFar < sum){
				maxSoFar = sum;
				start = s;
				end = i;
			}
			if(sum < 0){
				sum = 0;
				s = i+ 1;
			}
		}
		System.out.println("Max so far is " + maxSoFar);
		System.out.println("Continous sub sequent is from " + start +" to " + end);

		
	}

}
