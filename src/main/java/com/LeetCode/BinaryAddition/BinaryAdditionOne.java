package com.LeetCode.BinaryAddition;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BinaryAdditionOne {

    public String addBinary(String a, String b) {
        BigInteger intA = new BigInteger(a,2);
        BigInteger intB = new BigInteger(b,2);
        BigInteger sum = intA.add(intB);
        return sum.toString(2);
    }

    public static void main(String[] args) {
        BinaryAdditionOne binaryAdditionOne = new BinaryAdditionOne();
        //System.out.println(binaryAdditionOne.addBinary("11", "1"));
        binaryAdditionOne.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
    }
}