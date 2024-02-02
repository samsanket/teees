package java8;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        long positive =arr.stream().filter(n->n>0).count();
        long negative =arr.stream().filter(n->n<0).count();
        long zero =arr.stream().filter(n->n==0).count();
        double len = (double) arr.size();
        for (long l : new long[]{positive, negative, zero}) {
            System.out.printf("%1.6f ", l / len + "\n");
        }

    }

}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
