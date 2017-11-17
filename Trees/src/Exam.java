
public class Exam {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,7};
		isSumPair(arr, 5);

	}

	private static void isSumPair(int[] arr, int sum) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end){
			int tempSum = start + end;
			if(tempSum == sum){
				System.out.println("Pairs exist");
				break;
			}else if(tempSum > sum){
				end--;
			}else {
				start++;
			}
		}
		
	}

	
	


}
