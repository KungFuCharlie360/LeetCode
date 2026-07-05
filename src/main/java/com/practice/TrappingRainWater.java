package com.practice;

public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappingRainWater.trap(height));
    }

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxL = 0;
        int maxR = 0;
        int trapperWater = 0;
        while(left<right) {
            if(height[left]<height[right]) {
                if(height[left]>maxL) {
                    maxL = height[left];
                } else {
                    trapperWater += maxR - height[left];
                }
                left++;
            } else {
                if(height[right]>maxR) {
                    maxR = height[right];
                } else {
                    trapperWater += maxR - height[right];
                }
                right--;
            }
        }
        return trapperWater;
    }
}
