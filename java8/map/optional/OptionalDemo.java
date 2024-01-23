package java8.map.optional;

import java8.map.Customer;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Customer customer= new Customer(109,"harry",null, Arrays.asList("7897897512","1212121212"));

        Optional<Object> empty = Optional.empty();
//        System.out.println(empty);

        Optional<Customer> optionalCustomer = Optional.of(customer);
//        System.out.println(optionalCustomer);

        Optional<String> emailOptional =Optional.of(customer.getEmail());
//        System.out.println(emailOptional);

        // use optional.of() => if you know that object is not Null

        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());


//        System.out.println(emailOptional2);

    }
}
