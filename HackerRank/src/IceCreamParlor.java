//import java.util.HashMap;
//
//
//public class IceCreamParlor {
//
//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for(int a0 = 0; a0 < t; a0++){
//            int money = in.nextInt();
//            int n = in.nextInt();
//            int[] arr = new int[n];
//            for(int arr_i = 0; arr_i < n; arr_i++){
//                arr[arr_i] = in.nextInt();
//            }
//            solve(arr, money);
//        }
//        in.close();
//	}
//	
//	static void solve(int[] arr, int money) {
//        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
//        for(int i = 1; i <= arr.length; i++){
//            if(hm.containsKey(arr[i])){
//                hm.put(arr[i], hm.get(arr[i]) + 1);
//            }else {
//                hm.put(arr[i], 1);
//            }   
//        }
//               
//        for(int i = 1 ; i <= arr.length; i++){
//            int val = money - arr[i];
//            if(hm.containsKey(val)){
//                if(hm.get(val) < hm.get(arr[i])){
//                    System.out.println(hm.get(val) + " " + hm.get(arr[i]));
//                }else {
//                    System.out.println(hm.get(arr[i]) + " " + hm.get(val));
//                }
//                
//            }
//        }
//
//    }
//
//}
