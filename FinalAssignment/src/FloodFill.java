import java.util.Arrays;
import java.util.Scanner;


public class FloodFill {

	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );        
        System.out.println("Flood Fill Test\n");
        
        System.out.println("Enter dimensions of grid");
        int M = scan.nextInt();
        int N = scan.nextInt();
        
        char[][] arr = new char[M + 2][N + 2];
        for (int i = 0; i < M + 2; i++)
            Arrays.fill(arr[i], 'o');
        System.out.println("Enter grid with 'p' for passage and 'o' for obstacle");
        
        for (int i = 1; i < M + 1; i++)
            for (int j = 1; j < N + 1; j++)
                arr[i][j] = scan.next().charAt(0);    
        System.out.println("Enter coordinates to start ");
        int sr = scan.nextInt();
        int sc = scan.nextInt();
        if (arr[sr][sc] != 'p')
        {
            System.out.println("Invalid coordinates");
            System.exit(0);
        }
 
        FloodFill ff = new FloodFill();
        ff.fillGrid(arr, sr, sc);    

	}

	private void fillGrid(char[][] arr, int sr, int sc) {
		if (arr[sr][sc] == 'p')
        {
            arr[sr][sc] = 'w';
            display(arr);
 
            fillGrid(arr, sr + 1, sc);
            fillGrid(arr, sr - 1, sc);
            fillGrid(arr, sr, sc + 1);
            fillGrid(arr, sr, sc - 1);		
	}
}

	private void display(char[][] arr) {
        System.out.println("\nGrid : ");
        for (int i = 1; i < arr.length - 1; i++)
        {
            for (int j = 1; j < arr[i].length - 1; j++)
                System.out.print(arr[i][j] +" ");
            System.out.println();
        }
	}
		
	}
/* Output:
Enter dimensions of grid
5 5
Enter grid with 'P' for passage and 'O' for obstacle

p p p p p
p p o o o
o o o o o
p o p o p
o p p p o
Enter coordinates to start 
2 2

Grid : 
w w w w w 
w w o o o 
o o o o o 
p o p o p 
o p p p o 
*/

