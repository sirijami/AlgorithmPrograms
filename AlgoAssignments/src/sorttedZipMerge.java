//The time complexity of this algorithm is O(n) and space is O(sum of two array length)
public class sorttedZipMerge {

	public static void main(String[] args) {
		int[] inputArr1 = {1,5,7,8};
		int[] inputArr2 = {2,3,9,10,15,27};
		int[] result = zipMerge(inputArr1,inputArr2);
		printArray(result);

	}

	private static void printArray(int[] result) {
		for(int i=0; i < result.length; i++){
			System.out.print(result[i] + " ");
		}

		
	}

	private static int[] zipMerge(int[] inputArr1, int[] inputArr2) {
		int[] outputArr = new int[inputArr1.length + inputArr2.length];
		int i = 0, j= 0, k = 0;
		
		//checking for the the smaller element in both array and adding to the output array
		while(i < inputArr1.length && j < inputArr2.length){
			if(inputArr1[i] < inputArr2[j]){
				outputArr[k] = inputArr1[i];
				i++;
				k++;
			}else{
				outputArr[k] = inputArr2[j];
				j++;
				k++;
			}
			
		}
		
		//Adding remaining elements in the array to output array
		while( i < inputArr1.length){
			outputArr[k] = inputArr1[i];
			i++;
			k++;
		}
		while( j < inputArr2.length){
			outputArr[k] = inputArr2[j];
			j++;
			k++;
		}
		return outputArr;
		
	}

}
