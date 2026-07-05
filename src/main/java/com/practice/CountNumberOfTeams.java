package com.practice;

public class CountNumberOfTeams {
    public static void main(String[] args) {
        int[] ratings = {3,5,7};
        CountNumberOfTeams solution = new CountNumberOfTeams();
        System.out.println(solution.returnTeams(ratings));
    }
    public int returnTeams(int[] ratings) {
        int teams = 0;
        for(int i = 0; i<ratings.length; i++){
            int smallerLeft = 0;
            int largerLeft = 0;
            int smallerRight = 0;
            int largerRight = 0;
            for(int j = i-1; j>=0 ; j--) {
                if(ratings[j]<ratings[i]){
                    smallerLeft++;
                } else {
                    largerLeft++;
                }
            }

            for(int k = i+1 ; k<ratings.length ;k++) {
                if(ratings[k]<ratings[i]) {
                    smallerRight++;
                } else {
                    largerRight++;
                }
            }
            teams += (smallerLeft*largerRight) + (largerLeft*smallerRight);
        }
        return teams;
    }
}
