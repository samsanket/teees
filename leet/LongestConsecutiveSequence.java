package leet;

import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] arr) {
        int N=arr.length;
        if(N == 1){
            System.out.println("Longest Consecutive subsequence: 1");
            return 1;
        }

        Arrays.sort(arr);
        int count = 1;
        int max_count = -1;
        for(int i=0; i < N-1; i++)
        {
            if(arr[i+1] - arr[i] == 1)
            {
                count++;
            }
            else if(arr[i+1] - arr[i] == 0)
            {
                continue;
            }
            else
            {
                count = 1;
            }
            max_count = Math.max(max_count, count);
        }
        System.out.println("Longest Consecutive subsequence: "+max_count);
        return max_count;
    }




    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums1));  // Output: 4

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums2));  // Output: 9
    }
}
