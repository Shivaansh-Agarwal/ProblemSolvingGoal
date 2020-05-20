/*
	901. Online Stock Span (Medium)
	https://leetcode.com/problems/online-stock-span/
	19/05/2020
    May LeetCoding Challenge
    Day-19
*/

class StockSpanner {
    
    int index;
    Stack<Integer> stack;
    List<Integer> arrList;
    public StockSpanner() {
        this.stack = new Stack<>();
        this.index = 0;
        this.arrList = new ArrayList<>();
    }
    
    public int next(int price) {
        this.arrList.add(price);
        if(this.index==0){
            stack.push(index);
            this.index++;
            return 1;
        } else {
            while(stack.empty()==false && arrList.get(stack.peek())<=price)
                stack.pop();
            int span = (stack.empty()==true) ? (index+1) : (index-stack.peek());
            stack.push(index);
            this.index++;
            return span;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */