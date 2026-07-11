//package com.LeetCode.BitManipulation;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class AddingTwoNegaBinaryNumbers {
//    public static void main(String[] args) {
//        int[] arr1 = new int[]{1, 1, 1, 1, 1};
//        int[] arr2 = new int[]{1, 0, 1};
//        AddingTwoNegaBinaryNumbers ng = new AddingTwoNegaBinaryNumbers();
//        int[] ans = ng.addNegabinary(arr1, arr2);
//        for (int i = ans.length - 1; i > 0; i--) {
//            System.out.println(ans[i]);
//        }
//
//    }
//
//    public int[] addNegabinary(int[] arr1, int[] arr2) {
//        int num1 = 0, num2 = 0;
//        int sum1 = 0, sum2 = 0, answer;
//
//        for (int i = arr1.length - 1; i >= 0; i--) {
//            sum1 = (int) (sum1 + (arr1[i] * Math.pow(-2, num1)));
//            num1++;
////        }
//
//        for (int i = arr2.length - 1; i >= 0; i--) {
//
//            sum2 = (int) (sum2 + (arr2[i] * Math.pow(-2, num2)));
//            num2++;
//        }
//
//        answer = sum1 + sum2;
//        ArrayList<Integer> ans = new ArrayList<>();
//        System.out.println(answer);
//        while(answer!=0) {
//            if(answer % 2 == 0) {
//                ans.add(0);
//                answer = answer / -2;
//            } else {
//                ans.add(1);
//                answer = (answer-1) / -2;
//            }
//            System.out.println(answer);
//        }
//
//        return ans.stream().mapToInt(Integer::intValue).toArray();;
//
//    }
//}
