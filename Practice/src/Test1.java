import java.util.Arrays;


public class Test1 {
	
    public static void main (String[] args){
        int[] arr1 = {2,4,15,5,7,10,9};
        int[] arr2 = {4,6,7,9};
//        intersectionOfArray(arr1, arr2);
        System.out.println(secondLargest(arr1, arr2));
     }
    
    public static void intersectionOfArray(int[] arr1, int[] arr2){

        int i=0, j = 0;
           while(i < arr1.length && i < arr2.length){
              if(arr1[i] < arr2[j]){
                i++;
              }else if (arr1[i] > arr2[j]){
                j++;
              } else {
                System.out.print(arr2[j] + " ");
                i++;
                j++;
           }   
        }
    }
    
    public static int secondLargest(int[] arr1, int[] arr2){
    	
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	if(arr1[arr1.length-1] > arr2[arr2.length-1]){
    		return arr2[arr2.length-1];
    	}else if (arr1[arr1.length-1] < arr2[arr2.length-1]){
    		return arr1[arr1.length-1];
    	}
		return arr1[arr1.length-1];
    	
    }
    

}
