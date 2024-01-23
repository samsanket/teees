package java8.map;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {

        List<Customer> customers = EkartDataBase.getAll();

        // get only list of email
        // one to one mapping
        // one customer one email


       List<String> email= customers.stream().map(Customer::getEmail).toList();
//       email.stream().forEach(System.out::println);


        // Fetch phone Number
        /* it will return List<List<String>>
        its Stream of Stream
         */

        List<List<String>> collectedPhoneNumber = customers.stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
//        collectedPhoneNumber.forEach(System.out::println);
        System.out.println(collectedPhoneNumber);

        // use flat map to get a single List
        // one Customer many phone number
        // one to many mapping
        // use flat map
        // when nested list use flatMap


        List<String> phoneNumber = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phoneNumber);


    }
}