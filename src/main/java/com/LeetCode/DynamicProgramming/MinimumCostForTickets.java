package com.LeetCode.DynamicProgramming;


public class MinimumCostForTickets {
    public static void main(String[] args) {
        MinimumCostForTickets mct = new MinimumCostForTickets();
        System.out.println(mct.minCostTickets(new int[]{1, 4, 5, 6, 7, 8, 20}, new int[]{2, 7, 15}));
    }

    public int minCostTickets(int[] days, int[] costs) {
        int[] costForDay = new int[days[days.length - 1] + 1];

        int travelDay = 0;
        for (int today = 1; today < costForDay.length; today++) {
            if (today < days[travelDay]) {
                costForDay[today] = costForDay[today - 1];
            } else {
                travelDay++;
                costForDay[today] = Math.min(costForDay[today - 1] + costs[0],
                        Math.min(costForDay[Math.max(0, today - 7)] + costs[1],
                                costForDay[Math.max(0, today - 30)] + costs[2]));
            }
        }
        return costForDay[costForDay.length - 1];
    }
}
