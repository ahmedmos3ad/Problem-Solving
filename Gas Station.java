class Solution {
    //https://leetcode.com/problems/gas-station/
    public int canCompleteCircuit(int[] gas, int[] cost) {

        //we can make 1 round trip if the total amount of fuel we get from all station is equal
        //or more than the cost to travel between all of them

        //I use 2 surplus values so I can reset one of them to 0 when the fuel
        //we have is a negative value.
        //if surplus is -ve that means that whatever fuel we had + the fuel we gained at that station
        //isn't sufficient to travel to the next one
        //which renders it a bad start point, we use this approach
        //to provide a better time complexity than brute forcing with double loop


        int totalSurplus=0; //holds all the fuel we have left after 1 round trip
        int surplus=0; //same as totalSurplus but resets if its negative as explained above
        int startIndex=0;

        for (int i=0;i<gas.length;i++){
            totalSurplus+=gas[i]-cost[i];
            surplus+=gas[i]-cost[i];

            if (surplus<0)
            {
                surplus=0;
                startIndex=i+1;
            }
        }
        return (totalSurplus>=0) ? startIndex : -1;
    }
}