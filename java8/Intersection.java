package java8;

import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int b[] = {4, 5, 6};

        int[] c = Arrays.stream(a)
                .distinct() // Ensure distinct elements in a
                .filter(x -> Arrays.stream(b).anyMatch(y -> y == x)) // Filter elements in a that exist in b
                .toArray();

        System.out.println(Arrays.toString(c));
    }
}
