package java8.stream;

import java.util.Arrays;

public class Practicle {

    public static void main(String[] args) {
        String input="tuneBoat520btJBL";
        // to convert the String to String Array []
        String [] result= input.split("");

        Arrays.stream(result).forEach(System.out::print);
    }
}
