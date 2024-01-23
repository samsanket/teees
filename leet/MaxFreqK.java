package leet;

import java.util.*;

public class MaxFreqK {
    public  static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>  map= new HashMap<>();
        for (int i =0; i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        map.entrySet().forEach(longLongEntry -> System.out.println(longLongEntry));
      Set<Integer> keySet= map.keySet();
      Collection<Integer> values=  map.values();

      keySet.forEach(integer -> System.out.println(integer));
      values.forEach(integer -> System.out.println(integer));


//        int max = Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//
//        for (int value : values) {
//            if (value > max) {
//                secondMax = max;
//                max = value;
//            } else if (value > secondMax && value < max) {
//                secondMax = value;
//            }
//        }


    return nums;
    }
    public static void main(String[] args) {
        int [] arr= {0,0,2,1,2,2,1,6,6,7,8,9,3,66,100,100,1000,1000,100,100,100,100};
    topKFrequent(arr,2);
    }
}
