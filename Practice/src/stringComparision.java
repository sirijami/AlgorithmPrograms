
public class stringComparision {

	public static void main(String[] args) {
		String st = new String("hey");
		String mn = new String("hey");
		Object o = new Object();
		stringComparision sc = new stringComparision();
		
		
		String s = "sirisha";
		String y = "sirisha";
		if(s == y){
			System.out.println("true" );
		}
		if(st == mn){
			System.out.println("true" );
		}else {
			System.out.println("false" );
		}
		printClassName(sc);

	}
	static void printClassName(Object obj) {
	    System.out.println("The object's" + " class is " +
	        obj.getClass());
	}

}
