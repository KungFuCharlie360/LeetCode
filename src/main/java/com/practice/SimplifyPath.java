package com.practice;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        path=path+"/";
        Stack<String> simplifiedPath = new Stack<>();
        String[] directories = path.split("/");
        for (String directory : directories) {
            if(!directory.equals("")) {
                if (directory.equals("..") && !simplifiedPath.isEmpty())
                    simplifiedPath.pop();
                else if (!directory.equals(".") && !directory.equals(".."))
                    simplifiedPath.push(directory);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String ele: simplifiedPath) {
            if(!ele.equals("")) {
                sb.append(ele);
                sb.append("/");
            }
        }
        String result = sb.toString();
        return result.isEmpty()? "/" : "/"+sb.deleteCharAt(result.length()-1).toString();
    }

    public static void main(String[] args) {
        SimplifyPath sm = new SimplifyPath();
        System.out.println(sm.simplifyPath("/../"));
    }
}
