import java.util.Scanner;


public class BirthdayChoclate {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
	}
    static int solve(int n, int[] s, int d, int m){
         int count = 0;

        for(int i = 0 ; i <= s.length- m; i++){
        	int sum = 0;
            for(int j = i; j < i+ m; j++){
            	System.out.println("s[j] " + s[j]);
                sum = sum + s[j];
            }
            System.out.println("sum " + sum);
            if(sum == d){
                count++;
            }
        }
        System.out.println("count " +count);
        return count;
    }


}
