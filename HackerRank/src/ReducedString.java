//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//
//public class ReducedString {
//	static String super_reduced_string(String s){
//        // Complete this function
//        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
//        int count = 1;
//        for(int i = 0; i < s.length(); i++){
//            if(hm.containsKey(s.charAt(i))){
//                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
//            }else {
//                hm.put(s.charAt(i), count);
//            }
//        }
//        System.out.println(hm);
//        return "siri";
//        StringBuilder result = new StringBuilder();
//        for(Map.Entry<Character,Integer> m : hm.entrySet()){
//            if((int) (m.getValue() % 2) != 0){
//                result.append(Character.toString(m.getKey()));
//            }
//        }
//        System.out.println(result);
//        return result.toString();
//    }
//	 public static void main(String[] args) {
//		 String s = "aaabcsss";
//		 System.out.println("Result is" + super_reduced_string(s));
//
//	    }
//
//}
