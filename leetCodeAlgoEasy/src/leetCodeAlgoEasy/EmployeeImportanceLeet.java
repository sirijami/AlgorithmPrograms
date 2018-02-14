//package leetCodeAlgoEasy;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//class Employee{
//	public int id;
//	public int importance;
//	public List<Integer> subordinates;
//	public Employee(int id2, int importance2, ArrayList<Integer> so) {
//		id = id2;
//		importance = importance2;
//		subordinates = so;
//	}
//	public void addValues(int id,int importance,ArrayList<Integer> so ) {
//		ArrayList<Employee> al = new ArrayList<Employee>();
//		for(int i = 0; i < al.size() ; i++){
//			al.add(new Employee(id, importance, so));
//		}		
//	}
//	
//}
//public class EmployeeImportanceLeet {
//
//	public static void main(String[] args) {
//		Employee e = new Employee(1, 5, {2,2});
//
//		
//
//		getImportance(emp, 1);
//	}
//    private static int getImportance(List<Employee> employees, int id) {
//        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
//        for(Employee employee: employees){
//            map.put(employee.id, employee);
//        }
//        
//        return getImportanceHelper(map, id);
//    }
//	private int getImportanceHelper(Map<Integer, Employee> map, int id) {
//
//		return 0;
//	}
//
//}
