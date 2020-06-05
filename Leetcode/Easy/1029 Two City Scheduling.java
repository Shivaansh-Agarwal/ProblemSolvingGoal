/*
    1029. Two City Scheduling
    https://leetcode.com/problems/two-city-scheduling/
    Day-3
    June Leetcoding Challenge
*/

class Profit {
    int a,b,profit;
    Profit(int a, int b){
        this.a = a;
        this.b = b;
        this.profit = b-a;
    }
}

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        Profit prof[] = new Profit[n];
        for(int i=0; i<n; i++)
            prof[i] = new Profit(costs[i][0], costs[i][1]);
        Arrays.sort(prof,new Comparator<Profit>(){
            @Override
            public int compare(Profit a, Profit b){
                return b.profit - a.profit;
            }
        });
        
        int totalCost = 0;
        for(int i=0;i<n;i++){
            if(i<n/2)
                totalCost += prof[i].a;
            else
                totalCost += prof[i].b;
        }
        
        return totalCost;
    }
}