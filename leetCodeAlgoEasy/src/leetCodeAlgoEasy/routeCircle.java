package leetCodeAlgoEasy;

public class routeCircle {

	public static void main(String[] args) {
		String input = "UDRRLLUDRL";
		System.out.println(judgeCircle(input));
	
	}
    public static boolean judgeCircle(String moves) {
    	
    	moves = " " + moves + " ";
//    	System.out.println(moves.split("U").length);
//    	String[] arr = moves.split("U");
//    	printArray(arr);
        if(moves.split("L").length == moves.split("R").length && moves.split("U").length == moves.split("D").length ){
    		return true;
    	}
		return false;
        
    }
	private static void printArray(String[] arr) {
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();		
	}

}
