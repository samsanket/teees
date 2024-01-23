package leet;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // Create a Map to store the indices of the elements we have seen so far


        Map<Integer, Integer> numIndices = new HashMap<>();



        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {

            // Calculate the complement (the number we need to reach the target)


            int complement = target - nums[i];

            // Check if the complement is already in our Map


            if (numIndices.containsKey(complement)) {

                // If yes, return the indices of the two numbers

                return new int[]{numIndices.get(complement), i};

            }

            // If not, store the current number and its index in the Map
            numIndices.put(nums[i], i);
        }

        // If no solution is found, return an empty array (this should not happen based on the problem description)
        return new int[]{};
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
//        System.out.println(Arrays.toString(result1)); // Output: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
//        System.out.println(Arrays.toString(result2)); // Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
//        System.out.println(Arrays.toString(result3)); // Output: [0, 1]

        System.out.println(containsDuplicate(nums3));

    }


    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm= new HashMap();

        for (int i =0;i<nums.length;i++){
            int value = nums[i];

            if(hm.containsKey(value)){
                return true ;
            }
            else{
                hm.put(value,i);
            }
        }
        return false;

    }
}
