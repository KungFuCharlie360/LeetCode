package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class HighFive {
    public static void main(String[] args) {
        int[][] items = {{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}};
        HighFive solution = new HighFive();
        int[][] result = solution.highFive(items);
        for (int i = 0; i < result.length; i++) {
            for(int j = 0; j<2 ; j++) {
             System.out.println("Values are - i :"+i+" j :"+j +" ==== "+ result[i][j]);
            }
        }
    }

    /*
    Given a list of the scores of different students, items, where items[i] = [IDi, scorei]
    represents one score from a student with IDi, calculate each student's top five average.
    Return the answer as an array of pairs result, where result[j] = [IDj, topFiveAveragej]
    represents the student with IDj and their top five average. Sort result by IDj in increasing
    order. A student's top five average is calculated by taking the sum of their top five scores
    and dividing it by 5 using integer division.
     */
    //[[1,91],[1,92],[2,93],[2,97],[1,60],[2,77],[1,65],[1,87],[1,100],[2,100],[2,76]]

    public int[][] highFive(int[][] items) {
        HashMap<Integer, ArrayList<Integer>> idWithScores = new HashMap<>();

        for (int i = 0; i < items.length; i++) {
            if (idWithScores.get(items[i][0]) == null) {
                idWithScores.put(items[i][0], new ArrayList());
            }
            idWithScores.get(items[i][0]).add(items[i][1]);
        }

        int[][] result = new int[idWithScores.size()][2];
        AtomicInteger atomicInteger = new AtomicInteger(0);

        idWithScores.forEach((id, average) -> {
            System.out.println("For ID " + id);
            result[atomicInteger.get()][0] = id;
            result[atomicInteger.get()][1] = (int) (average.stream()
                    .sorted(Collections.reverseOrder())
                    .limit(5)
                    .mapToDouble(dv -> dv)
                    .average()
                    .getAsDouble());
            System.out.println("Average for "+ result[0][atomicInteger.get()]+" is "+ result[atomicInteger.get()][1]);
            atomicInteger.incrementAndGet();
        });
        return result;
    }

    public int[][] highFive1(int[][] items) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < items.length; i++) {
            if (!map.containsKey(items[i][0])) {
                map.put(items[i][0], new ArrayList());
            }
            map.get(items[i][0]).add(items[i][1]);
        }
        int k = 0;
        int[][] result = new int[map.size()][2];
        for (int i : map.keySet()) {
            int average = 0;
            int d = map.get(i).size() < 5 ? map.get(i).size() : 5;
            for (int j = 0; j < 5; j++) {
                Collections.sort(map.get(i), Collections.reverseOrder());
                average += map.get(i).get(j);
            }
            result[k][0] = i;
            result[k][1] = average / d;
            k++;
        }
        return result;
    }

}
