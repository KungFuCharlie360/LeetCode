package com.interview.GeeksForGeeks.dp;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int k = 0;
        int v = nums[k];
        int dontLand = 0;

        if (nums.length == 1) {
            return true;
        } else if (v == 0) {
            return false;
        } else if(k+v>nums.length-1){
            return true;
        } else {
            k = k + v;
            v = nums[k];
        }
        while (k > 0) {
            if (k + v > dontLand) {
                k = k + v;
            } else {
                k = k - 1;
            }
            if(k<nums.length-1){
                v = nums[k];
            } else {
                return true;
            }
            if (v == 0 && k != nums.length - 1) {
                dontLand = k>dontLand?k:dontLand;
                k = k - 1;
                v = nums[k];
            } else if (k >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        JumpGame jp = new JumpGame();
        int[] nums = {5,4,0,2,0,1,0,1,0};
        System.out.print(jp.canJump(nums));
    }
}
