class Solution {
    public boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizontal = 0;
        // Using switch was taking 7ms.
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            switch(ch){
                case 'U': vertical++; break;
                case 'D': vertical--; break;
                case 'L': horizontal++; break;
                case 'R': horizontal--; break;
            }
        }
        return vertical==0 && horizontal==0;
        /*
        This approach (using if-else) was taking 10ms.
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U')
                vertical += 1;
            else if(moves.charAt(i)=='D')
                vertical -= 1;
            else if(moves.charAt(i)=='L')
                horizontal += 1;
            else if(moves.charAt(i)=='R')
                horizontal -= 1;
        }
        if(vertical==0 && horizontal==0)
            return true;
        else 
            return false;
        */
    }
}