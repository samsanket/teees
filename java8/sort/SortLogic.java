package java8.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortLogic {

    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee("sanket",91.0));
        employees.add(new Employee("vikas",90.21));
        employees.add(new Employee("rohit",90.22));
        employees.add(new Employee("Milind",90.23));

        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str1;

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2);      // true
        System.out.println(str1 == str3);      // true

        employees.stream().filter(employee -> employee.getSalary()>90).collect(Collectors.toList());


    }
}
