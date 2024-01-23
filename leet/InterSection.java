package leet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterSection {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int res[] = intersection(nums1, nums2);
        for (int i : res) {
            System.out.println(i);
        }
    }
    static int[] intersection(int[] nums1, int[] nums2) {
       int n=0;
        if (nums2.length>nums1.length){
            n=nums1.length;
        }else {
            n=nums2.length;
        }
        int res[] = new int[n];
        int count=0;
        for (int i=0;i<nums1.length;i++){
            for (int j=0;j< nums2.length;j++){
            if (nums1[i]==nums2[j]){

                res[count]=nums1[i];
            }
            }
        }
        return  res;
    }
}



//nums1 = [1,2,2,1], nums2 = [2,2]

// Input:
// nums1 = [4,9,5],
// nums2 = [9,4,9,8,4]
