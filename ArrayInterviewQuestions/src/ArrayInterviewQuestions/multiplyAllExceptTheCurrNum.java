package ArrayInterviewQuestions;

public class multiplyAllExceptTheCurrNum {

	public static void main(String[] args) {
		int[] arr1 = {2,5,7,9};
		int[] result = mulAllExceptNum(arr1);
		printArray(result);       
	}
	
	private static int[] mulAllExceptNum(int[] num){
		int[] result = new int[num.length];
		int totalProduct = 1;
		for(int i = 0; i < num.length; i++){
			totalProduct = totalProduct * num[i];
		}
		for(int i = 0; i < result.length; i++){
			result[i] = totalProduct/num[i];
		}
		return result;
	}
	
	private static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
