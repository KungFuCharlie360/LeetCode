//package com.practice;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class MergeEmails {
//    public static void main(String[] args) {
//        MergeEmails emails = new MergeEmails();
//        String[][] accounts = {{"John", "johnsmith@mail.com", "john_newyork@mail.com"}, {"John", "johnsmith@mail.com", "john00@mail.com"}, {"Mary", "mary@mail.com"}, {"John", "johnnybravo@mail.com"}};
//        emails.accountsMerge(Arrays.stream(accounts).map(Arrays::asList).collect(Collectors.toList()));
//    }
//
//    public List<List<String>> accountsMerge(List<List<String>> accounts) {
//        String[][] accts = accounts.stream().map(list -> list.toArray(new String[0])).toArray(String[][]::new);
//        HashMap<String, HashSet<String>> accountMap = new HashMap<String, HashSet<String>>();
//
//        for (int i = 0; i < accts.length; i++) {
//            if(!accountMap.containsKey(accts[i][0].trim())) {
//                accountMap.put(accts[i][0].trim(), new HashSet<String>());
//            }
//            for (int j = 0; j < accts[0].length; j++) {
//                accountMap.get(accts[i][0]).add(accts[i][j]);
//            }
//        }
//
//        return accountMap.entrySet().stream().map(vals -> {
//            List str = new ArrayList<String>();
//            str.add(vals.getKey());
//            str.add(vals.getValue());
//            return str;
//        }).collect(Collectors.toList());
//    }
//}
