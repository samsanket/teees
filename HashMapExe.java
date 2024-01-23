import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExe {
    public static void main(String[] args) {


//        TreeMap<Employee,String> map= new TreeMap<>();
//
//        Employee employee= new Employee("abc","def",12L);
//        Employee employee1= new Employee("abc","def",13L);
//        Employee employee2= new Employee("abc","def",12L);
//        Employee employee3= new Employee("abc","def",12L);
//        map.put(employee,"1");
//        map.put(employee1,"1");
//        for (Map.Entry<Employee,String> mapping:map.entrySet()){
//            System.out.println("key :" +mapping.getKey() + "  value " + mapping.getValue());
//        }

        HashMap<String,Integer> hashMap= new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        hashMap.put("c",1);
        for (Map.Entry<String,Integer> mapping:hashMap.entrySet()){
            System.out.println("key :" +mapping.getKey() + "  value " + mapping.getValue());
        }
    }
}
