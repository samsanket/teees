package java8;

import java.util.Arrays;

public class Challenge {
//    Input: ar1[] = {1, 5, 9, 10, 15, 20};
//    ar2[] = {2, 3, 8, 13};
//    Output: ar1[] = {1, 2, 3, 5, 8, 9}
//    ar2[] = {10, 13, 15, 20}

    public static void main(String[] args) {
        int[] ar1 = {1, 5, 9, 10, 15, 20};
        int[] ar2 = {2, 3, 8, 13};

        int n=ar1.length>ar2.length?ar1.length:ar2.length;

        int t=0;
        for (int i=0;i<n;i++){
            if (n==ar2.length){
                break;
            }
            if (ar1[i]>ar2[i]){
               t=ar1[i];
               ar1[i]=ar2[i];
               ar2[i]=t;

            }
        }
    }

//    private static void sort(int[] ar1) {
//        int x;
//        for (int i = 0; i < ar1.length; i++) {
//            for (int j = 0; j < ar1.length; j++) {
//                if (ar1[i] < ar1[j]) {
//                    x = ar1[i];
//                    ar1[i] = ar1[j];
//                    ar1[j] = x;
//
//                }
//            }
//        }
//        for (int b : ar1) {
//            System.out.println(b);
//        }
//        System.out.println("*************");
//    }
}


