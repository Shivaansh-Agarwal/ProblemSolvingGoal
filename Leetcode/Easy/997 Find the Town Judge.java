/*
    997. Find the Town Judge
    https://leetcode.com/problems/find-the-town-judge/
    10/05/2020
    May LeetCoding Challenge
    Day-10
*/

/*
    Approach-
    s
    We're given that 
        1. Every person except the Town Judge follows the Town Judge.
        2. Town Judge follows no one.
    So I've taken a HashMap in which all people which are being followed are taken as Key and 
    the value is the count of number of people who follow him.
    Once this HashMap is being made, we'll iterate over all the keys of the HashMap and see which person is being followed N-1 times, that person would be the TownJudge most probably, BUT there's one more catch-
    We've not checked whether the person whom we're considering the Town Judge follows someone or not..
    So we should once again iterate trough the trust[][] and check whether our likely TownJudge follows someone or not.. If he does not follow anyone then we were right, he was the TownJudge.
     
    Edge Case, 
    When there is only 1 person in the Village.
    In that case that person will be the Town Judge and will be labelled 1 so just return 1
*/
class Solution {
    public int findJudge(int N, int[][] trust) {
        // Edge Case
        if(N==1)
            return 1;
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<trust.length; i++){
            hmap.put(trust[i][1], hmap.getOrDefault(trust[i][1], 0)+1);
        }
        int townJudge = -1;
        for(Integer key: hmap.keySet()){
            if(hmap.get(key)==N-1){
                townJudge = key;
                break;
            }
        }
        // Checking for case if townjudge trusts someone
        for(int i=0;i<trust.length;i++){
            if(trust[i][0]==townJudge){
                townJudge = -1;
                break;
            }   
        }
        return townJudge;
    }
}