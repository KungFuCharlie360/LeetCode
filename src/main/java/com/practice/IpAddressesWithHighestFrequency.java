package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class IpAddressesWithHighestFrequency {
    public TreeMap<String,Integer> treeMap = new TreeMap<>();
    public String ipAddressFinder(List<String> ips) {
        StringBuilder sb = new StringBuilder();
        int max = 0;
        for(String ip : ips) {
            treeMap.put(ip,treeMap.getOrDefault(ip,0)+1);
            max = treeMap.get(ip)>max?treeMap.get(ip):max;
        }
        int finalMax = max;
        treeMap.forEach((ip, occ)-> {
            if(occ == finalMax) {
                if(sb.length()<1){
                    sb.append(ip);
                } else {
                    sb.append(",");
                    sb.append(ip);
                }
            }
        });
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("192.168.1.234");
        list.add("192.168.1.234");
        list.add("192.168.1.234");
        list.add("192.168.2.234");
        list.add("192.168.2.234");
        list.add("192.168.3.234");
        list.add("192.168.3.234");
        list.add("192.168.3.234");
        IpAddressesWithHighestFrequency ipAddressesWithHighestFrequency = new IpAddressesWithHighestFrequency();
        System.out.println(ipAddressesWithHighestFrequency.ipAddressFinder(list));
    }
}
