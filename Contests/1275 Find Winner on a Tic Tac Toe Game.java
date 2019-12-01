import java.util.*;
class Solution {
    public String tictactoe(int[][] moves) {
        int n = moves.length;
        int matrix[][] = new int[3][3];
        String ans = "";
        for(int[] row: matrix){
            Arrays.fill(row,-1);
        }
        boolean alternate = true;
        int x,y;
        for(int i=0;i<n;i++){
            if(alternate){
                x = moves[i][0];
                y = moves[i][1];
                matrix[x][y] = 1;
                alternate = false;
            } else {
                x = moves[i][0];
                y = moves[i][1];
                matrix[x][y] = 0;
                alternate = true;
            }
        }
        int count1 = 0, count0 = 0;
        //rows
        for(int i=0;i<3;i++){
            count1=0;
            count0=0;
            for(int j=0;j<3;j++){
                if(matrix[i][j]==1)
                    count1++;
                else if(matrix[i][j]==0)
                    count0++;
            }
            if(count1==3){
                ans = "A";
                break;
            } else if(count0==3){
                ans = "B";
                break;
            }
        }
        if(ans.equals("")){
            for(int j=0;j<3;j++){
                count1=0;count0=0;
                for(int i=0;i<3;i++){
                    if(matrix[i][j]==1)
                        count1++;
                    else if(matrix[i][j]==0)
                        count0++;
                }
                if(count1==3){
                    ans = "A";
                    break;
                } else if(count0==3){
                    ans = "B";
                    break;
                }
            }
            if(ans.equals("")){
                count1=0;count0=0;
                if(matrix[0][0]==1 && matrix[1][1]==1 && matrix[2][2]==1){
                    count1=3;
                    ans = "A";
                }
                else if(matrix[0][0]==0 && matrix[1][1]==0 && matrix[2][2]==0){
                    count0=3;
                    ans = "B";
                }
                else if(matrix[0][2]==1 && matrix[1][1]==1 && matrix[2][0]==1){
                    count1=3;
                    ans = "A";
                } else if(matrix[0][2]==0 && matrix[1][1]==0 && matrix[2][0]==0){
                    count0=3;
                    ans = "B";
                }
            }
        }
        if(ans.equals("")){
            if(n==9){
                ans = "Draw";
            } else {
                ans = "Pending";
            }
        }
        return ans;
    }
}