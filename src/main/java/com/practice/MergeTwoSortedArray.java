package com.practice;

public class MergeTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int k = 0 ;
        int i = 0 ;
        int j = 0 ;
        int[] arr = new int[l1+l2];
        while(i<l1 && j<l2) {
            if(nums1[i]<=nums2[j]) {
                arr[k] = nums1[i];
                i++;
                k++;
                continue;
            }
            if(nums2[j]<=nums1[i]) {
                arr[k] = nums2[j];
                j++;
                k++;
                continue;
            }
        }
        while (i<l1){
            arr[k]=nums1[i];
            k++;
            i++;
        }
        while (j<l2){
            arr[k]=nums2[j];
            k++;
            j++;
        }
        if((l1+l2)%2==0){
            return (double) (arr[(l1+l2)/2]+arr[((l1+l2)/2)-1])/2;
        }else {
            return (double) arr[(l1+l2)/2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0,0};
        int[] nums2 = {0,0};
        MergeTwoSortedArray mergeTwoSortedArray = new MergeTwoSortedArray();
        System.out.println(mergeTwoSortedArray.findMedianSortedArrays(nums1, nums2));
    }
}