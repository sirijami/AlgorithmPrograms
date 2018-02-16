package ArrayInterviewQuestions;

public class findSecondLargest {

	public static void main(String[] args) {
		int[] arr = {12, 13, 1, 10, 34, 1};
		System.out.println("Second largest element in the array is " + findSecondLargestElement(arr) );

	}

	private static int findSecondLargestElement(int[] arr) {
		int first_largest = Integer.MIN_VALUE, sec_largest = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length; i++){
			if(arr[i] > first_largest){
				sec_largest = first_largest;
				first_largest = arr[i];
			}else if(arr[i] > sec_largest && sec_largest != arr[i]){
				sec_largest = arr[i];
			}
		}
		return sec_largest;
	}

}
