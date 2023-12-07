//import org.Employee;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Test {
//
//    //[1,1,3,3,7,7,5,4,4,9,9]
//    public static void main(String[] args) {
//        int[] arr = {1,1,3,3,7,7,5,4,4,9,9};
//        boolean flag = true;
//        int result = 0;
//        for(int i = 0; i <= arr.length-1 ; i=i+2){
//            if(flag == false){
//                break;
//            }
//            for(int j = i; j <= i+1; j++){
//                if( i != j && arr[i] == arr[j]){
//                    break;
//                }
//                else {
//                    flag = false;
//                    result = arr[i];
//                }
//            }
//        }
//        System.out.println(result);
//
//        //id, dept, salary -> list of employees, employees
//        List<String> list = Arrays.asList("","","","");
//        //list.stream().filter(i -> i.getSalary ).collect(Collectors.groupingBy(getDeptName))
//
//        List<Employee> list1 = new ArrayList<>();
//        Map<String, List<Employee>> map = new HashMap<>();
//
//        for(Employee e: list1){
//            if(e.getSalary > 5000){
//                if(map.containsKey(e.getDeptName)){
//                    map.put(e.getDeptname, e);
//                }
//            }
//
//        }
//
//
//    }
//}
