

public class quickSort {

	public static void main(String[] args) {
		int[] arr = {-1,200, 10,100,30,20,2,40,50,8,3};
		quickSort qs = new quickSort();
		qs.sort(arr,0, arr.length-1);
		printArray(arr);
		System.out.println("The third largest number is " + arr[arr.length -3]);


	}

	private void sort(int arr[], int low, int high) {
		if(low < high){
			int wl = wall(arr, low, high);
			sort(arr, low, wl-1);
			sort( arr, wl + 1, high);
		}	    	    
    }
	
	private int wall(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for( int j = low ; j < high ; j++){
			if(arr[j] < pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			printArray(arr);
		}
        //placing the pivot element at it's location
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        printArray(arr);
        return i+1;
       
    }

	static void printArray(int arr[]){
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

