package com.practice;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//TODO
public class RemoveAllAdjacentDuplicates {
    public String removeDuplicates(String str, int k) {
        StringBuilder sb = new StringBuilder(str);
        int one=0, two=1;
        if(str.length()<=1) {
            return str;
        }
        while(two<sb.toString().length()) {
            if(sb.toString().charAt(one)==sb.toString().charAt(two)) {
                two++;
            } else {
                one++;
                two++;
            }
            if((two-one)==k){
                sb.delete(one,two);
                one=two-k-1;
                two=two-k;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        RemoveAllAdjacentDuplicates removeAllAdjacentDuplicates = new RemoveAllAdjacentDuplicates();
        //String content = new String(Files.readAllBytes(Paths.get("src/main/resources/longString.txt")));
        System.out.println(removeAllAdjacentDuplicates.removeDuplicates("deeedbbcccbdaa",3));
    }
}
