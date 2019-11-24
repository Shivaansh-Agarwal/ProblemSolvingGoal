class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int x1=points[0][0],y1=points[0][1],x2,y2;
        int min_time=0;
        for(int i=1;i<n;i++){
            x2 = points[i][0];
            y2 = points[i][1];
            min_time = min_time + Math.max(Math.abs(x1-x2),Math.abs(y1-y2));
            x1 = x2;
            y1 = y2;
        }
        return min_time;
    }
}