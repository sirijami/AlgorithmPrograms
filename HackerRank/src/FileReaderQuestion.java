import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeMap;


public class FileReaderQuestion {

	public static TreeMap<Date, TreeMap<String,Integer>> outerHm 
				= new TreeMap<Date, TreeMap<String,Integer>>(Collections.reverseOrder());

		
	public static void main(String[] args) {
		readInput();
		printOutput();		
	}
	
	public static void readInput(){
		try {
			Scanner sc = new Scanner(System.in);
	        sc.useDelimiter("\n");
			String str = sc.next();
	        //System.out.println("Input line " + str);  
			// 2015-08, 2016-04
		
			String tempStartDate = str.substring(0, 4) +"-"+ str.substring(5, 7) +"-"+ "01";
			Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(tempStartDate);
	        //System.out.println("Start date" + startDate); 
			
			String tempEndDate = str.substring(9, 13) + "-"+ str.substring(14) +"-"+ "01";
			Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(tempEndDate);
			//System.out.println("End date" + endDate); 
	            
	        boolean fileHasElements = true;
			String s = sc.next();
	        //System.out.println("Input line " + s);     
	            
			String s1 = sc.next();
	        //System.out.println("Input line " + s1); 
			
			while(fileHasElements && !s1.isEmpty()) {
				String[] s1Array = s1.split(",");
			
				String s1date = s1Array[0].trim();
				String category = s1Array[1].trim();
				int categoryCounts = Integer.parseInt(s1Array[2].trim());
				
				Date date = new SimpleDateFormat("yyyy-MM-dd").parse(s1date);
	            //System.out.println("Input date " + date); 
	            //System.out.println("date.compareTo(startDate) >= " + (date.compareTo(startDate)));
	            //System.out.println("(date.compareTo(endDate) <=  " + (date.compareTo(endDate)));
	                               
				if(( date.compareTo(startDate) >= 0)  && (date.compareTo(endDate) <=0)){
	                //System.out.println("Ready to store");
					store(s1date, category, categoryCounts);
				}	
	            try {
				s1 = sc.next();
	            //System.out.println("Input line" + s1); 
	            } catch (NoSuchElementException e) {
	                fileHasElements = false;
	            }
			}

			} catch (ParseException e) {
				e.printStackTrace();
			}	
	}

	public static void store(String inputDate, String category, int categoryCounts){		
		try{
            Date date = new SimpleDateFormat("yyyy-MM").parse(inputDate);
            TreeMap<String, Integer> categoryMap = new TreeMap<String, Integer>();
            if(outerHm.containsKey(date)){

                categoryMap = outerHm.get(date);
                if(categoryMap.containsKey(category)){
                    int updateCategoryCount = categoryMap.get(category) + categoryCounts;
                    // if updated count is > 0
                    if(categoryCounts > 0){
                        categoryMap.put(category, updateCategoryCount);
                    }else{
                        // else remove the category from the category
                        categoryMap.remove(category);
                    }			

                }else {
                    // if updated count is > 0
                    if(categoryCounts > 0){
                        categoryMap.put(category, categoryCounts);
                    }
                }

                // if categoryMap is empty
                // remove date entry from outerMap
                if(categoryMap.isEmpty()){
                    outerHm.remove(categoryMap);
                }

            }else {	
                // if updated count is > 0
                if(categoryCounts > 0){
                    categoryMap.put(category, categoryCounts);			
                    outerHm.put(date, categoryMap);
                }
            }
    }catch (ParseException e) {
                e.printStackTrace();
            }
    
	System.out.println(outerHm);	
	}
	public static void printOutput(){
		for(Map.Entry<Date, TreeMap<String,Integer>> outer : outerHm.entrySet()){
			String newDateFormat = new SimpleDateFormat("yyyy-MM").format(outer.getKey());
			System.out.print(newDateFormat);
			TreeMap<String, Integer> categoryMap = outer.getValue();
			for (Map.Entry<String, Integer> category : categoryMap.entrySet()) {
				System.out.print(", " + category.getKey() + ", " + category.getValue());
			}
			System.out.println();
		}
					
	}
}
