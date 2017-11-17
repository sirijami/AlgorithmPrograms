package leetCodeAlgoEasy;

public class flowerBeds {

	public static void main(String[] args) {
		int[] arr= {0,0,1,0,0};
		System.out.println(canPlaceFlowers(arr, 1));

	}
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		 int count = 0;
		 if(flowerbed.length == 0){
			 return false;
		 }
		 if(flowerbed.length == 1){
			 if(flowerbed[0] == 0){
				 count++;
			 }
		 }
		 if(flowerbed.length == 2){
			 if(flowerbed[0] == 0 && flowerbed[1] == 0){
				 count++;
			 }
		 }
		 if(flowerbed.length >= 3){
			for(int first = 0; first < flowerbed.length-2 ; first = first+ 2){
				int second = first + 1;
				int third = second + 1;
	            if((flowerbed[first] == 0 && flowerbed[second] == 0) && flowerbed[third] ==0){
	                count++;
	                flowerbed[second] = 1;
	            }else if((flowerbed[first] == 1 && flowerbed[third] == 0)&&(flowerbed[second] == 0 && ( third == flowerbed.length-1 || flowerbed[third+1] == 0))){
	            
	            	count++;
					flowerbed[third] = 1;			
				}else if((flowerbed[first] == 0 && flowerbed[third] == 1) &&(flowerbed[second] == 0 && ( third == flowerbed.length-1 || flowerbed[third+1] == 0 ))){
					count++;
					flowerbed[first] = 1;
				}
			}
		 }
		 System.out.println("count " +count);
			if(count == n){
				return true;
			}
		return false;
        
    }
	private static void printArray(int[] flowerbed) {
		for(int i = 0 ;i < flowerbed.length; i++){
			System.out.print(flowerbed[i] + " ");
		}
		System.out.println();
		
	}

}
