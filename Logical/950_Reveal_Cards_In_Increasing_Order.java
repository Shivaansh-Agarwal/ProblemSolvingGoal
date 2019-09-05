class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int ans[] = new int[n];
        Deque<Integer> dq = new LinkedList();
        for(int i=0;i<n;i++)
            dq.add(i);
        for(int card: deck){
            ans[dq.pollFirst()] = card;
            if(!dq.isEmpty()){
                dq.add(dq.pollFirst());
            }
        }
        return ans;
    }
}