package com.LeetCode.ArrayManipulation;

import java.util.HashMap;
import java.util.Map;

public class PivotPoint {
    public int pivotIndex(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int len = nums.length;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        leftSum[0]=nums[0];
        rightSum[len-1]=nums[len-1];
        for(int i=1,j=len-2; i<=len&&j>=0; i++,j--){
            leftSum[i]=nums[i]+leftSum[i-1];
            rightSum[j]=nums[j]+rightSum[j+1];
        }
        for(int i=0; i<len; i++ ) {
            if(leftSum[i]==rightSum[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PivotPoint pivotPoint = new PivotPoint();
        int[] temp = {1,2,3};
        pivotPoint.pivotIndex(temp);
    }
}