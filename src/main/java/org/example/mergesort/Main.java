package org.example.mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k= m + n;


        for(int i=n; i>0 ; i--){
                if(nums2[n-1]>nums1[m]){
                    nums1[m+n-1]=nums2[n-1];
                }
                else{
                    nums1[m+n-1]=nums1[m-1];
                }

        }
        System.out.println(Arrays.toString(nums1));
    }
}
